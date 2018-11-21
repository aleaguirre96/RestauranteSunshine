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
public class PedidoExpress extends Pedido {
    
    private boolean entregado;
    private String tiempo_entrega;
    private String tiempo_preparacion;
    private int puntacion;

    public PedidoExpress() {
    }

    public PedidoExpress(int ID, Sucursal sucursal, String t_pago, double total,
                         String fecha,boolean entregado, String tiempo_entrega, 
                         String tiempo_preparacion, int puntacion) {
        super(ID, sucursal, t_pago, total, fecha);
        this.entregado = entregado;
        this.tiempo_entrega = tiempo_entrega;
        this.tiempo_preparacion = tiempo_preparacion;
        this.puntacion = puntacion;
    }

    

    public boolean isEntregado() {
        return entregado;
    }

    public void setEntregado(boolean entregado) {
        this.entregado = entregado;
    }
    
}
