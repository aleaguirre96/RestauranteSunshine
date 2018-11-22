/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;


import Model.Combo;
import Model.Producto;
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
            mensaje = "Add_Combo: Combo Agregado.";
            connection.close();
        }catch(SQLException e){
            mensaje = "Add_Combo: No se pudo agregar el Combo";
        }
        return mensaje;
    }
    
    public String addNewProducCombo(Combo Com,Producto newPro, int cant){
        String mensaje = "";
        try{
            this.conectar();
            CallableStatement statemen = connection.prepareCall("{CALL SETCOMBOPRODUCTO(?,?,?)}");
            statemen.setString(1, Com.getNombre()); 
            statemen.setString(2, newPro.getNombre());
            statemen.setInt(3, cant);
            statemen.execute();
            statemen.close();
            mensaje = "Add_ProdCombo: Producto Agregado al combo.";
            connection.close();
        }catch(SQLException e){
            mensaje = "Add_ProdCombo: No se pudo agregar el producto al Combo";
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
            mensaje = "Act_Combo: Atributo disponible editado.";
            connection.close();
        }catch(SQLException e){
            mensaje = "Act_Combo: No se pudo editar el atributo disponible.";
        }
        return mensaje;
    } 
    
    public ArrayList<Combo> getProductosCombos(ArrayList<Combo> combos)throws SQLException{
        try{
        this.conectar();
            for (Combo combo : combos) {
                CallableStatement st = connection.prepareCall("{CALL  GETCOMBOPRODUCTO(?)}");
                st.setString(1, combo.getNombre());
                ResultSet rs = st.executeQuery();
                while (rs.next()){ //(int ID, String nombre, String descripcion, double precio, boolean activo)
                    combo.setProductoCombo(new Producto(rs.getInt(1), //id
                            rs.getString(2), //nombre
                            rs.getString(5),
                            rs.getBigDecimal(4).doubleValue(), //precio
                            rs.getBoolean(3)) //activo
                    ,rs.getInt(6));
                }
                connection.close(); 
            }
            
        }catch(SQLException e){
            throw e;    
        }
        return combos;
    }
    
    
}
