/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Michael
 */
//Visitor interface that implements visitor pattern
//Keeps track of which objects can visit
public interface Visitor {
    
    void visit(UserCounter user);
    void visit(GroupCounter group);
    void visit(MessageCounter message);
    void visit(PositiveCounter message);
    
}
