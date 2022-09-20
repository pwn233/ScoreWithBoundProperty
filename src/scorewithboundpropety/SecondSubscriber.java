/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scorewithboundpropety;

/**
 *
 * @author User
 */
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
/**
 *
 * @author pwn233
 */
public class SecondSubscriber implements PropertyChangeListener {
    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        System.out.println("Second Subscriber : "+evt.getNewValue());
    }
}

