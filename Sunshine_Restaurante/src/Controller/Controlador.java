/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.IniciarSesion;
import View.Principal;
import View.RealizarCompra;
import View.Registrarse;
import View.VerMenu;

/**
 *
 * @author danip
 */
public class Controlador {

    public IniciarSesion getIniciarSesion() {
        return iniciarSesion;
    }

    public RealizarCompra getRealizarCompra() {
        return realizarCompra;
    }
    private Controlador(){}
    
    public static Controlador ctr = new Controlador();
    Principal principal = new Principal();
    IniciarSesion iniciarSesion = new IniciarSesion();
    RealizarCompra realizarCompra = new RealizarCompra();
    Registrarse registrarse = new Registrarse();

    public static Controlador getCtr() {
        return ctr;
    }

    public Principal getPrincipal() {
        return principal;
    }

    public Registrarse getRegistrarse() {
        return registrarse;
    }

    public VerMenu getVerMenu() {
        return verMenu;
    }
    VerMenu verMenu = new VerMenu();
    
   
    
    
    
}
