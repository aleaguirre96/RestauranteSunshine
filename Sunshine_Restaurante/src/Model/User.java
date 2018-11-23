/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author jose
 */
public class User {
    private String name;
    private String pass;
    private int tipo;

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
    

    public User(String name, String pass, int tipo) {
        this.name = name;
        this.pass = pass;
        this.tipo = tipo;
    }
    
    
    
    
}
