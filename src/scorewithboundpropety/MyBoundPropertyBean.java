/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scorewithboundpropety;
import java.beans.*;
import java.io.Serializable;
/**
 *
 * @author pwn233
 */
public class MyBoundPropertyBean implements Serializable {
    
    public static final String SCORE_PROPERTY = "score";
    
    private String score, oldScore;
    
    private PropertyChangeSupport propertySupport;
    
    public MyBoundPropertyBean() {
        propertySupport = new PropertyChangeSupport(this);
    }
    
    public String getScoreProperty() {
        return score;
    }
    
    public void setScoreProperty(String score) {
        oldScore = this.score;
        this.score = score;
        propertySupport.firePropertyChange(SCORE_PROPERTY, oldScore, this.score);
    }
    
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.addPropertyChangeListener(listener);
    }
    
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.removePropertyChangeListener(listener);
    }
}
