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
public class PedidoFactory implements PedidoFactoryMethod {
    
    public Pedido crearPedidoLocal(int ID, Sucursal sucursal, String t_pago, double total, String fecha) {
        return new PedidoLocal(ID, sucursal, t_pago, total, fecha);
    }
    
    public Pedido crearPedidoExpress(int ID, Sucursal sucursal, String t_pago, double total,
                         String fecha,boolean entregado, String tiempo_entrega, 
                         String tiempo_preparacion, int puntacion){
        return new PedidoExpress(ID, sucursal, t_pago,total, fecha, entregado, tiempo_entrega, tiempo_preparacion, puntacion);
    }
}
