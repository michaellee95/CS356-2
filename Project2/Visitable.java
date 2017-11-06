/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Michael
 */
//Visitable interface that implements visitor pattern
public interface Visitable {
    
    public void accept(Visitor visitor);
    
}
