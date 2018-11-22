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
public class DAO_Connector { //Se usa un singleton para la coneccion
    

    protected final String ip = "localhost";
    protected final String port = "3306";
    protected final String dataBase = "DataBaseRestaurante";
    protected final String url = "jdbc:mysql://"+ip+":"+port+"/"+dataBase;
    protected final String user = "userconect";
    protected final String pass = "userconect";
    protected Connection connection;



    public void conectar(){

        try {
            if(connection != null){
                connection.close();
            }
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(url,user, pass);
            
            System.out.println("DATABASE: Conexion exitosa..");
        } catch (SQLException se) {
            System.out.println("DATABASE: No se puede conectar a la Base. Error: "+se);
        } catch (ClassNotFoundException e) {
            System.out.println("DATABASE: oops! No se encuentra la clase. Error: " + e.getMessage());
        }

    }

    public void closeConnection(){
        try {
            if(connection != null){
                connection.close();
            }
        } catch (SQLException se) {
            System.out.println("No se puede conectar. Error: " + se.toString());
        }
    }
    
 
    
}

