/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project2;

/**
 *
 * @author Michael
 */
public interface Visitor {
    
    void visit(UserCounter user);
    void visit(GroupCounter group);
    void visit(MessageCounter message);
    void visit(PositiveCounter message);
    
}
