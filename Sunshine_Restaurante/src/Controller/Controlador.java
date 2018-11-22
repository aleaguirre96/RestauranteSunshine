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
<<<<<<< HEAD
=======
    //private CrearCombo crearCombos = new CrearCombo();
>>>>>>> 05c06716a3526b4e0e00dd8d233cc3e5a8b60c6f
    private EditarMenu editarMEnu = new EditarMenu();
    private VerMenu verMenu = new VerMenu();
    private VentanaGerente ventGerente = new VentanaGerente();

    private Connector ConneccionBase;
    
    public User Login(String name, String pass){
        ConneccionBase = Connector.getInstance();
        ConneccionBase.createConnection();
        return ConneccionBase.Login(name, pass);
    }
    
    public AgregarProducto getAgregarProducto() {
        return agregarProducto;
    }

<<<<<<< HEAD
   
=======
   // public CrearCombo getCrearCombos() {
   //     return crearCombos;
   // }

>>>>>>> 05c06716a3526b4e0e00dd8d233cc3e5a8b60c6f
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
