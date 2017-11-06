/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Michael
 */
//User counter class that keeps track of how many users exist
//Implements visitor pattern
public class UserCounter implements Visitable{

    private int counter;
    
    public UserCounter(){
        counter = 0;
    }
    
    public int getCounter(){
        return counter;
    }
    
    public void update(){
        counter++;
    }
    
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    
}
