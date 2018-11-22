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

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected String getPass() {
        return pass;
    }

    protected void setPass(String pass) {
        this.pass = pass;
    }
    
    

    public User(String name, String pass) {
        this.name = name;
    }
    
    
    
    
}
