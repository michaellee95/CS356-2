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
public class Updator implements Visitor{

    @Override
    public void visit(UserCounter user) {
       user.update();
    }
    
    @Override
    public void visit(GroupCounter group) {
       group.update();
    }

    @Override
    public void visit(MessageCounter message) {
       message.update();
    }

    @Override
    public void visit(PositiveCounter positive) {
       positive.update();
    }    
    
}
