/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.User;
import Model.UserClient;
import Model.UserEmpl;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

/**
 *
 * @author jose
 */
public class Connector { //Se usa un singleton para la coneccion
    
    private static Connector ourInstance;

   // private static final String ip = "172.19.49.189";////Si se usa la maquina virtual "10.0.2.2"; //ip del pc de uno si se usa un celular
    private static final String ip = "localhost";
    private static final String port = "3306";
    private static final String dataBase = "DataBaseRestaurante";
    private static final String url = "jdbc:mysql://"+ip+":"+port+"/"+dataBase;
    private static final String user = "userconect";
    private static final String pass = "userconect";
    private Connection connection;

    public static  Connector getInstance() {
        if(ourInstance == null)
            ourInstance = new Connector();
        //Crea una coneccion para ser usada
        return ourInstance;
    }

    private  Connector() { }

    public boolean createConnection(){
        boolean exito = false;

        try {
            if(connection != null){
                connection.close();
            }

            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(url,user, pass);
            exito = true;
            System.out.println("DATABASE: Conexion exitosa..");
        } catch (SQLException se) {
            System.out.println("DATABASE: No se puede conectar a la Base. Error: "+se);
        } catch (ClassNotFoundException e) {
            System.out.println("DATABASE: oops! No se encuentra la clase. Error: " + e.getMessage());
        }

        return  exito;
    }

    public boolean closeConnection(){
        boolean exito = false;
        try {
            if(connection != null){
                connection.close();
            }
            exito = true;
        } catch (SQLException se) {
            System.out.println("No se puede conectar. Error: " + se.toString());
        }
        return exito;
    }
    
    public User Login(String username, String password){
        try {
            CallableStatement statement = connection.prepareCall("{CALL LOGINUSER(?,?,?)}");
            statement.setString(1,username); //se le da el valor a ese parametro
            statement.setString(2, password);
            statement.registerOutParameter(3, Types.INTEGER);

            statement.execute();
            int tipo = statement.getInt(3);
            if(tipo == 0){
               return new UserClient(username, password);
            }else if(tipo > 0){
               return new UserEmpl(username, password, tipo);
            }
            statement.close();
            System.out.println("Tipo de user: "+tipo);
        } catch (SQLException e) {
            System.out.println("Login: Error al validar session"+e);
        }catch (Exception e){
            System.out.println("Login: Error al validar session"+e.getMessage());
        }
        
        return null; 
    }
    
}
