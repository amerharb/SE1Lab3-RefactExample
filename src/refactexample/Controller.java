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
    GUI g;

    public Controller() {
        
    }

    public void startUp(){
        g=new GUI(this);
    }

    public void paintShape(String command) {
        if (command.equals("CIRCLE"))
            g.paintShape(new Circle(100, new Point(200,100)));
        else if (command.equals("SQUARE"))
            g.paintShape(new Square(100, new Point(200,100)));
        else if (command.equals("BLANK"))
            g.blank();
        else if (command.equals("QUIT"))
            System.exit(0);
    }

}
