/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

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
public class DAO_PRODUCTOS extends DAO_Connector {
    public ArrayList<Producto> cargarProductos () throws SQLException
    {
        ArrayList<Producto> listaProductos = new ArrayList<Producto>();
        try{
        this.conectar();
        CallableStatement st = connection.prepareCall("{CALL  GETPRODUCTOS()}");
        ResultSet rs = st.executeQuery();
        while (rs.next()){ //(int ID, String nombre, String descripcion, double precio, boolean activo)
            listaProductos.add(new Producto(rs.getInt(1), //id
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
    
    public String addNewProducto(Producto newProd){
        String mensaje = "";
        try{
            this.conectar();
            CallableStatement statemen = connection.prepareCall("{CALL ADDNEWPRODUCTO(?,?,?,?)}");
            statemen.setString(1, newProd.getNombre()); 
            statemen.setBoolean(2, newProd.isActivo());
            statemen.setBigDecimal(3,new BigDecimal(newProd.getPrecio()));
            statemen.setString(4, newProd.getDescripcion());
            statemen.execute();
            statemen.close();
            mensaje = "Add_Prod: Producto Agregado.";
            connection.close();
        }catch(SQLException e){
            mensaje = "Add_Prod: No se pudo agregar el producto";
        }
        return mensaje;
    }
    
    public String setActivoProducto(Producto upDatProcducto){
        String mensaje = "";
        try{
            this.conectar();
            CallableStatement statemen = connection.prepareCall("{CALL SETDISPPRODUCTO(?,?)}");
            statemen.setString(1, upDatProcducto.getNombre()); 
            statemen.setBoolean(2, upDatProcducto.isActivo());
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
