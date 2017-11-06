/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Michael
 */
//Positive counter class that keeps track of how many positive messages exist
//Does not calculate percentage of how many posts are positive. That is done in AdminControlPanel
//Implements visitor pattern
public class PositiveCounter implements Visitable{
    private int counter;
    
    public PositiveCounter(){
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
