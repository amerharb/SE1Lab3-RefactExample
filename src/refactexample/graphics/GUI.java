/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package refactexample.graphics;

import javax.swing.*;
import java.awt.*;
import refactexample.shapes.Shape;
import refactexample.Controller;

/**
 *
 * @author admin
 */
public class GUI extends JFrame
{

    ShapePanel myShapePanel;
    ButtonPanel myButtonPanel;

    public GUI(Controller controller)
    {
        super();
        myShapePanel = new ShapePanel();
        myButtonPanel = new ButtonPanel(controller);
        setTitle("The View");
        setSize(500, 400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        add(myShapePanel, BorderLayout.CENTER);
        add(myButtonPanel, BorderLayout.SOUTH);
    }

    public void paintShape(Shape sh)
    {
        myShapePanel.paintShape(sh);
    }

    public void blank()
    {
        myShapePanel.blank();
    }
}
