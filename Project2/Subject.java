/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

 /**
 *
 * @author Michael
 */
//Subject interface that implements observer pattern
public interface Subject {
    
    public void addFollowers(UserComponent user);
    public void addFollowed(UserComponent user);
    public void notifyObserver(String message);
    
}
