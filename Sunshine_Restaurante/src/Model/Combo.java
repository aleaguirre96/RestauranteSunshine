/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Roberto
 */
public class Combo {
    
    private int ID;
    private String nombre;
    private String descripcion;
    private double precio;
    private boolean activo;
    private ArrayList<Object[]> productosCombo;

    public Combo(int ID, String nombre, String descripcion, double precio, boolean activo) {
        this.ID = ID;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.activo = activo;
        this.productosCombo = new ArrayList<>();
    }
    
    public void setProductoCombo(Producto newProducto, int cant){
        Object[] nuevoP = {newProducto, cant};
        this.productosCombo.add(nuevoP);
    }
    
    public int getCantidadProductoPos(int posProducto){
        return (int)this.productosCombo.get(posProducto)[1];
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    
    
    
}
