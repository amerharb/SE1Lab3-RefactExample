/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package refactexample;

import refactexample.graphics.*;
import refactexample.shapes.*;
/**
 *
 * @author admin
 */
public class Controller {
    GUI myGUI;

    public Controller() {
        
    }

    public void startUp(){
        myGUI=new GUI(this);
    }

    public void paintShape(String command) {
        if (command.equals("CIRCLE"))
            myGUI.paintShape(new Circle(100, new Point(200,100)));
        else if (command.equals("SQUARE"))
            myGUI.paintShape(new Square(100, new Point(200,100)));
        else if (command.equals("BLANK"))
            myGUI.blank();
        else if (command.equals("QUIT"))
            System.exit(0);
    }

}
