/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Michael
 */
//UserGroup class that implements composite pattern
public class UserGroup implements UserComponent{

    private String name;
    private long timeStamp;
    private List<UserComponent> userComponent = new ArrayList<>();
    
    public UserGroup(String name, long timeStamp){
        this.name = name;
        this.timeStamp = timeStamp;
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

    @Override
    public long getTimeStamp() {
        return timeStamp;
    }
}
