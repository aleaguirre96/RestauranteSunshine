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
public class ComboPedido {
    
    private int ID_Combo;
    private int ID_Pedido;
    private int cantidad;

    public ComboPedido(int ID_Combo, int ID_Pedido, int cantidad) {
        this.ID_Combo = ID_Combo;
        this.ID_Pedido = ID_Pedido;
        this.cantidad = cantidad;
    }

    public int getID_Combo() {
        return ID_Combo;
    }

    public void setID_Combo(int ID_Combo) {
        this.ID_Combo = ID_Combo;
    }

    public int getID_Pedido() {
        return ID_Pedido;
    }

    public void setID_Pedido(int ID_Pedido) {
        this.ID_Pedido = ID_Pedido;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }       
    
}
