/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.User;
import View.AgregarProducto;
//import View.CrearCombo;
import View.EditarMenu;
import View.IniciarSesion;
import View.Principal;
import View.RealizarCompra;
import View.Registrarse;
import View.Reportes;
import View.VentanaGerente;
import View.VerMenu;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author danip
 */
public class Controlador {
    
    public static Controlador ctr = new Controlador();
    private Principal principal = new Principal();
    private IniciarSesion iniciarSesion = new IniciarSesion();
    private RealizarCompra realizarCompra = new RealizarCompra();
    private Registrarse registrarse = new Registrarse();
    private AgregarProducto agregarProducto = new AgregarProducto();

    private EditarMenu editarMEnu = new EditarMenu();
    private VerMenu verMenu = new VerMenu();
    private VentanaGerente ventGerente = new VentanaGerente();
    private ArrayList<User> userApp = new ArrayList<User>();

    
        
    public AgregarProducto getAgregarProducto() {
        return agregarProducto;
    }
    
    public ArrayList<User> getUser(){
        return userApp;
    }
    
    public void setUsers(){
        DAO_Users useConec = new DAO_Users();
        try { 
            this.userApp = useConec.cargarUsers();
        } catch (SQLException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    public EditarMenu getEditarMEnu() {
        return editarMEnu;
    }

    public Reportes getReportes() {
        return reportes;
    }
    private Reportes reportes = new Reportes();

    public IniciarSesion getIniciarSesion() {
        return iniciarSesion;
    }

    public RealizarCompra getRealizarCompra() {
        return realizarCompra;
    }
    private Controlador(){}
    


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
    
    public VentanaGerente getVentanaGerente(){
        return this.ventGerente;
    }
    
    
   
    
    
    
}
