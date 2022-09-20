/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scorewithboundpropety;

import java.util.Scanner;

/**
 *
 * @author pwn233
 */
public class ScoreWithBoundProperty {
    static Scanner sc = new Scanner(System.in);
    static String dummy = "";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyBoundPropertyBean src = new MyBoundPropertyBean();
        FirstSubscriber fList = new FirstSubscriber(); //First
        SecondSubscriber sList = new SecondSubscriber(); //Second
        src.addPropertyChangeListener(fList);
        src.addPropertyChangeListener(sList);
        
        while(true) {
            System.out.print("Enter Score : ");
            dummy = sc.nextLine();
            if(dummy.equals("")) break;
            else src.setScoreProperty(dummy);
            dummy = "";
        }
    }
    
}
