/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project2;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Michael
 */
public class UserGroup implements UserComponent{

    private String name;
    private List<UserComponent> userComponent = new ArrayList<>();
    
    public UserGroup(String name){
        this.name = name;
    }
    
    public void add(UserComponent newUserComponent){
        userComponent.add(newUserComponent);
    }
    
    @Override
    public String getName(){
        return name;
    }
    
    public List<UserComponent> getUsers(){
        return userComponent;
    }

    @Override
    public UserComponent getComponent() {
        return this;
    }
}
