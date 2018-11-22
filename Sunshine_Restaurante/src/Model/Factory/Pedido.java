/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Factory;

import Model.Sucursal;

/**
 *
 * @author Roberto
 */
public abstract class Pedido {
    
    private int ID;
    private Sucursal sucursal;
    private String t_pago;
    private double total;
    private String fecha;

    public Pedido() {
    }

    public Pedido(int ID, Sucursal sucursal, String t_pago, double total, String fecha) {
        this.ID = ID;
        this.sucursal = sucursal;
        this.t_pago = t_pago;
        this.total = total;
        this.fecha = fecha;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }    

    public String getT_pago() {
        return t_pago;
    }

    public void setT_pago(String t_pago) {
        this.t_pago = t_pago;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
}
