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
//UserController class that keeps track of list of uses and group
//Also does the user/group adding and getting
public class UserController {
    
    private List<UserComponent> listOfUsers = new ArrayList<>();
    private List<UserComponent> listOfGroups = new ArrayList<>();  
    
    public UserController(){
        
    }
    
    //Check if user already exist
    public boolean checkUser(String userName){
        for(UserComponent user : listOfUsers){
            if (user.getName().equalsIgnoreCase(userName)){
                return false;
            }
        }
        return true;
    }
    
    //Check if group already exist
    public boolean checkGroup(String groupName){
        for(UserComponent group : listOfGroups){
            if (group.getName().equalsIgnoreCase(groupName)){
                return false;
            }
        }        
        return true;
    }    
   
    //Add group to listOfGroups
    public void addGroup(String groupName){
        UserGroup newUserGroup = new UserGroup(groupName);
        listOfGroups.add(newUserGroup);        
    }
    
    //Add group to listOfGroups but also add group to specific group
    public void addGroup(String groupName, Object selectedNode){
        UserGroup newUserGroup = new UserGroup(groupName);
        listOfGroups.add(newUserGroup); 
        UserGroup selectedGroup = getGroup(selectedNode);
        selectedGroup.add(newUserGroup);
    }
    
    //Add user to listOfUser and to speicifc group
    public void addUser(String userName, Object selectedNode){     
        User newUser = new User(userName);        
        listOfUsers.add(newUser);
        UserGroup selectedGroup = getGroup(selectedNode);
        selectedGroup.add(newUser);
    }  
    
    //Get group based on selected node
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
    
    //Return user based on selected node
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
    
    //Return user based on user's name
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
