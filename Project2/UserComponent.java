/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Michael
 */
//UserComponent interface that implements composite pattern
public interface UserComponent {
    
    public String getName();
    public long getTimeStamp();
    public UserComponent getComponent();

}
