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
public class User implements UserComponent,Subject,Observer{

    private String name;
    private List<UserComponent> listOfFollowers = new ArrayList<UserComponent>();
    private List<UserComponent> listOfFollowed = new ArrayList<UserComponent>();
    private List<String> newsFeed = new ArrayList<String>();
    
    public User (String name){
        this.name = name;
    }
    
    @Override
    public String getName() {
        return name;
    }
    
    @Override
    public void addFollowers(UserComponent newFollower){
        listOfFollowers.add(newFollower);
    }
    
    @Override
    public void addFollowed(UserComponent newFollowed){
        listOfFollowed.add(newFollowed);
        User user = (User)newFollowed;
        user.addFollowers(this);
    }    
    
    public List<UserComponent> getFollowers(){
        return listOfFollowers;
    }
   
    public List<UserComponent> getFollowed(){
        return listOfFollowed;
    }    
    
    @Override
    public UserComponent getComponent() {
        return this;
    }
    
    @Override
    public void notifyObserver(String message){
        User user = null;
        for(UserComponent userToUpdate: listOfFollowers){
            user = (User)userToUpdate;
            user.update(message);
        }
    }
    
    @Override
    public void update(String message){
        newsFeed.add(message);
    }
    
    public List<String> getNewsFeed(){
        return newsFeed;
    }
    
    public void addNewsFeed(String message){
        String tweet = this.name + ": " + message;
        newsFeed.add(tweet);
        notifyObserver(tweet);
    }
}
