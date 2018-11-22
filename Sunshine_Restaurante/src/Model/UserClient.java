<<<<<<< Updated upstream
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
public class UserClient extends User{

    public UserClient(String name, String pass) {
        super(name, pass);
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
=======
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
public class UserClient extends User{

    public UserClient(String name, String pass) {
        super(name,pass);
    }    
}
>>>>>>> Stashed changes
