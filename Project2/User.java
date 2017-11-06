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
//User class that implements composite and visitor pattern
//Acts as both subject and visitor
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
    
    //If an observer decide to follow this user(as subject)
    //Update this user's list of followers(observers)
    @Override
    public void addFollowers(UserComponent newFollower){
        listOfFollowers.add(newFollower);
    }
    
    //If user decide to follow someone(become a observer)
    //Inform the followed(subject) that they have a new follower
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
    
    //Code for informing observers that their subject
    //updated their newsfeed
    @Override
    public void notifyObserver(String message){
        User user = null;
        //For all of subject's observer, update their newsfeed
        for(UserComponent userToUpdate: listOfFollowers){
            user = (User)userToUpdate;
            user.update(message);
        }
    }
    
    /*When a user's subject update their newsFeed
    as observer, update their newsFeed as well*/
    @Override
    public void update(String message){
        newsFeed.add(message);
    }
    
    public List<String> getNewsFeed(){
        return newsFeed;
    }
    
    //If user posts tweet add tweet to user's newsFeed
    //Afterwards send tweet to rest of follower
    public void addNewsFeed(String message){
        String tweet = this.name + ": " + message;
        newsFeed.add(tweet);
        notifyObserver(tweet);
    }
}
