/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Model.Factory.Pedido;

/**
 *
 * @author Roberto
 */
public class ComboPedido {
    
    private Combo combo;
    private Pedido pedido;
    private int cantidad;

    public ComboPedido(Combo combo, Pedido pedido, int cantidad) {
        this.combo = combo;
        this.pedido = pedido;
        this.cantidad = cantidad;
    }

    public Combo getCombo() {
        return combo;
    }

    public void setCombo(Combo combo) {
        this.combo = combo;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    
    
}
