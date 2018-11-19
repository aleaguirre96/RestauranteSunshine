/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Roberto
 */
public class ComboProducto {
    
    private int ID_Combo;
    private int ID_Producto;
    private int cantidad;

    public ComboProducto(int ID_Combo, int ID_Producto, int cantidad) {
        this.ID_Combo = ID_Combo;
        this.ID_Producto = ID_Producto;
        this.cantidad = cantidad;
    }

    public int getID_Combo() {
        return ID_Combo;
    }

    public void setID_Combo(int ID_Combo) {
        this.ID_Combo = ID_Combo;
    }

    public int getID_Producto() {
        return ID_Producto;
    }

    public void setID_Producto(int ID_Producto) {
        this.ID_Producto = ID_Producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
}



