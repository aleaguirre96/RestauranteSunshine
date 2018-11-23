/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Combo;
import Model.Producto;
import Model.User;
import Model.UserClient;
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
import View.CrearCombo;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import View.VerListaEmpleados;
import javax.swing.table.DefaultTableModel;

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
    private CrearCombo crearCombo = new CrearCombo();
    private VentanaGerente ventGerente = new VentanaGerente();
    private VerListaEmpleados listaEmpleados= new VerListaEmpleados();
    

    public CrearCombo getCrearCombo() {
        return crearCombo;
    }

    public VentanaGerente getVentGerente() {
        return ventGerente;
    }

    public VerListaEmpleados getListaEmpleados() {
        return listaEmpleados;
    }
    
    public ArrayList<User> userApp = new ArrayList<User>();
    private ArrayList<Producto> listaProductos = new ArrayList<Producto>();
    private ArrayList<Combo> listaCombos = new ArrayList<Combo>();

    public void cargarDatosBase(){
        this.setUsersArray();
        this.setProductosArray();
        this.setCombosArray();
        this.setProductosComboArray();
    }
        
    public AgregarProducto getAgregarProducto() {
        return agregarProducto;
    }

    public ArrayList<User> getUserApp() {
        return userApp;
    }

    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    public ArrayList<Combo> getListaCombos() {
        return listaCombos;
    }

    public void setUsersArray(){
        DAO_Users useConec = new DAO_Users();
        try { 
            this.userApp = useConec.cargarUsers();
        } catch (SQLException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public String setNewUsersClient(UserClient nuevoUser){
        DAO_Users useConec = new DAO_Users();
        return useConec.addNewUserClient(nuevoUser);
    }
    
    public String setNewProducto(Producto nuevoProducto){
        DAO_PRODUCTOS proConec = new DAO_PRODUCTOS();
        return proConec.addNewProducto(nuevoProducto);
    }
    
    public String setNewCombo(Combo nuevoCombo){
        DAO_COMBOS conConec = new DAO_COMBOS();
        return conConec.addNewCombo(nuevoCombo);
    }
    
    public String chageActProducto(Producto productoCambio){//Se le pasa el nombre del producto con el activo que queremos
        DAO_PRODUCTOS proConec = new DAO_PRODUCTOS();
        return proConec.setActivoProducto(productoCambio);
    }
    
    public String chageActCombo(Combo comboCambio){//Se le pasa el nombre del combo con el activo que queremos
        DAO_COMBOS conConec = new DAO_COMBOS();
        return conConec.setActivoCombo(comboCambio);
    }
    
    public String setNewProductoCombo(Combo comb, Producto newProducto, int cant){
        DAO_COMBOS conConec = new DAO_COMBOS();
        return conConec.addNewProducCombo(comb, newProducto, cant);
    }
    
    public void setProductosArray(){
        DAO_PRODUCTOS proConec = new DAO_PRODUCTOS();
        try { 
            this.listaProductos = proConec.cargarProductos();
        } catch (SQLException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
    
    public void setCombosArray(){
        DAO_COMBOS conConec = new DAO_COMBOS();
        try { 
            this.listaCombos = conConec.cargarCombos();
        } catch (SQLException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void setProductosComboArray(){
        DAO_COMBOS conConec = new DAO_COMBOS();
        try {
            this.listaCombos = conConec.getProductosCombos(listaCombos);
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
    
    public void crearCombo(){}
    public void crearProducto(){}
    public void generarReporteMensual(){}
    public void generarReportePorSucursal(){}
    public void generarReporteGeneral(){}
    public void registrarse(){}
    public void logIn(){}
    public void editarMenu(){}
    
    public void verListaEmpleados(){
        DefaultTableModel modelo = (DefaultTableModel) Controlador.getCtr().listaEmpleados.getjTListaDisponibles().getModel();
        Object[] fila = new Object[modelo.getColumnCount()];
        for(int i =0;i<userApp.size();i++){
           
            fila[0]=userApp.get(i).getName();
            fila[1]=userApp.get(i).getTipo();
            modelo.addRow(fila);
        }
    
    }
    
    
    
    
}
