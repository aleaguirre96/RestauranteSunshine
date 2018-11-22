/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;


import Model.Combo;
import java.math.BigDecimal;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author jose
 */
public class DAO_COMBOS extends DAO_Connector{
      public ArrayList<Combo> cargarCombos () throws SQLException
    {
        ArrayList<Combo> listaProductos = new ArrayList<Combo>();
        try{
        this.conectar();
        CallableStatement st = connection.prepareCall("{CALL  GETCOMBOS()}");
        ResultSet rs = st.executeQuery();
        while (rs.next()){ //(int ID, String nombre, String descripcion, double precio, boolean activo)
            listaProductos.add(new Combo(rs.getInt(1), //id
                                            rs.getString(2), //nombre
                                            rs.getString(5),
                                            rs.getBigDecimal(4).doubleValue(), //precio
                                            rs.getBoolean(3) //activo
                                              )); 
        }
        connection.close();
        }catch(SQLException e){
            throw e;    
        }
        return listaProductos;
    }
    
    public String addNewCombo(Combo newCom){
        String mensaje = "";
        try{
            this.conectar();
            CallableStatement statemen = connection.prepareCall("{CALL ADDNEWCOMBO(?,?,?,?)}");
            statemen.setString(1, newCom.getNombre()); 
            statemen.setBoolean(2, newCom.isActivo());
            statemen.setBigDecimal(3,new BigDecimal(newCom.getPrecio()));
            statemen.setString(4, newCom.getDescripcion());
            statemen.execute();
            statemen.close();
            mensaje = "Add_Prod: Combo Agregado.";
            connection.close();
        }catch(SQLException e){
            mensaje = "Add_Prod: No se pudo agregar el Combo";
        }
        return mensaje;
    }
    
    public String setActivoCombo(Combo upDatCombo){
        String mensaje = "";
        try{
            this.conectar();
            CallableStatement statemen = connection.prepareCall("{CALL SETDISPPRODUCTO(?,?)}");
            statemen.setString(1, upDatCombo.getNombre()); 
            statemen.setBoolean(2, upDatCombo.isActivo());
            statemen.executeUpdate();
            statemen.close();
            mensaje = "Add_Prod: Atributo disponible editado.";
            connection.close();
        }catch(SQLException e){
            mensaje = "Add_Prod: No se pudo editar el atributo disponible.";
        }
        return mensaje;
    }  
    
    
}
