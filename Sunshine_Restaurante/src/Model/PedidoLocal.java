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
public class PedidoLocal extends Pedido {
    
    public PedidoLocal() {
    }

    public PedidoLocal(int ID, Sucursal sucursal, String t_pago, double total, String fecha) {
        super(ID, sucursal, t_pago, total, fecha);
    }    
    
}
