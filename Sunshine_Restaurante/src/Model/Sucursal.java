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
public class Sucursal {
    
    private String ID;
    private UserEmpl gerente;
    
    void Sucursal(String ID, UserEmpl gerente){
        this.ID = ID;
        this.gerente = gerente;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

}
