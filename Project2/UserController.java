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
public class UserController {
    
    private List<UserComponent> listOfUsers = new ArrayList<>();
    private List<UserComponent> listOfGroups = new ArrayList<>();  
    
    public UserController(){
        
    }
    
    public boolean checkUser(String userName){
        for(UserComponent user : listOfUsers){
            if (user.getName().equalsIgnoreCase(userName)){
                return false;
            }
        }
        return true;
    }
    
    public boolean checkGroup(String groupName){
        for(UserComponent group : listOfGroups){
            if (group.getName().equalsIgnoreCase(groupName)){
                return false;
            }
        }        
        return true;
    }    
    
    public void addGroup(String groupName){
        UserGroup newUserGroup = new UserGroup(groupName);
        listOfGroups.add(newUserGroup);        
    }
    
    public void addGroup(String groupName, Object selectedNode){
        UserGroup newUserGroup = new UserGroup(groupName);
        listOfGroups.add(newUserGroup); 
        UserGroup selectedGroup = getGroup(selectedNode);
        selectedGroup.add(newUserGroup);
    }
    
    public void addUser(String userName, Object selectedNode){     
        User newUser = new User(userName);        
        listOfUsers.add(newUser);
        UserGroup selectedGroup = getGroup(selectedNode);
        selectedGroup.add(newUser);
    }  
    
    public UserGroup getGroup(Object selectedNode){
        UserGroup selectedGroup = null;
        for (UserComponent group : listOfGroups){
            if (group.getName().equalsIgnoreCase((String)selectedNode)){
                selectedGroup = (UserGroup)group.getComponent();
                break;
            }
        }  
        return selectedGroup;
    }
    
    public User getUser(Object selectedNode){
        User selectedUser = null;
        for (UserComponent user: listOfUsers){
            if (user.getName().equalsIgnoreCase((String)selectedNode)){
                selectedUser = (User)user.getComponent();
                break;
            }
        }
        return selectedUser;
    }
    
    public User getUser(String userName){
        User selectedUser = null;
        for (UserComponent user: listOfUsers){
            if (user.getName().equalsIgnoreCase(userName)){
                selectedUser = (User)user.getComponent();
                break;
            }
        }
        return selectedUser;        
    }
}
