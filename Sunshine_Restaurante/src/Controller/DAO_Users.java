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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author jose
 */
public class DAO_Users extends DAO_Connector{
    public ArrayList<User> cargarUsers () throws SQLException
    {
        ArrayList<User> listaUsuarios = new ArrayList<User>();
        try{
        this.conectar();
        CallableStatement st = connection.prepareCall("{CALL  GETUSERS()}");
        ResultSet rs = st.executeQuery();
        while (rs.next()){
            int tipo = rs.getInt(3);
            if(tipo == 0){
                listaUsuarios.add(new UserClient(rs.getString(1),rs.getString(2)));
            }else if(tipo > 0){
                listaUsuarios.add(new UserEmpl(rs.getString(1),rs.getString(2),tipo));
            }
        }
        connection.close();
        }catch(SQLException e){
            System.out.print(e.getMessage());
            throw e;    
        }
        return listaUsuarios;
    }
}

