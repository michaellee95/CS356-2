/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Michael
 */
/*Updator class that implements visitor
Uses visitor pattern so depending on what object is passed
it wil update that object*/
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
