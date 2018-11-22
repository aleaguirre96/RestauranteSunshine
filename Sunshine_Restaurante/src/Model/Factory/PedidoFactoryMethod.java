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
public interface PedidoFactoryMethod {
    public Pedido crearPedidoLocal(int ID, Sucursal sucursal, String t_pago, double total, String fecha);
    public Pedido crearPedidoExpress(int ID, Sucursal sucursal, String t_pago, double total,
                         String fecha,boolean entregado, String tiempo_entrega, 
                         String tiempo_preparacion, int puntacion);
}
