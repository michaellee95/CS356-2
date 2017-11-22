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
    private long timeStamp;
    
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
        timeStamp = System.currentTimeMillis();
        UserGroup newUserGroup = new UserGroup(groupName, timeStamp);
        listOfGroups.add(newUserGroup);        
    }
    
    //Add group to listOfGroups but also add group to specific group
    public void addGroup(String groupName, Object selectedNode){
        timeStamp = System.currentTimeMillis();        
        UserGroup newUserGroup = new UserGroup(groupName, timeStamp);
        listOfGroups.add(newUserGroup); 
        UserGroup selectedGroup = getGroup(selectedNode);
        selectedGroup.add(newUserGroup);
    }
    
    //Add user to listOfUser and to speicifc group
    public void addUser(String userName, Object selectedNode){ 
        timeStamp = System.currentTimeMillis();        
        User newUser = new User(userName, timeStamp);        
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
    
    //Return true if every user and group does not contain space
    //No need to check if name is unique since it is checked already
    public boolean isUnique(){
        String name;
        for (UserComponent user: listOfUsers){
            name = user.getName();
            if (name.contains(" "))
                return false;
        }

        for (UserComponent group: listOfGroups){
            name = group.getName();
            if (name.contains(" "))
                return false;
        }        
        
        return true;
    }
}
