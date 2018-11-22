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
public class UserEmpl extends User {
    private int tipo;
    public UserEmpl(String name, String pass,int tipo) {
        super(name, pass);
        this.tipo = tipo;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    
    @Override
    public void setPass(String pass) {
        super.setPass(pass); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getPass() {
        return super.getPass(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setName(String name) {
        super.setName(name); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getName() {
        return super.getName(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
