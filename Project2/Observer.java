/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Michael
 */
//Observer interface that implements observer pattern
public interface Observer {
    
    public void update(String message, long lastUpdateTime);
}
