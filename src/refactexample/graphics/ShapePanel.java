/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package refactexample.graphics;

import javax.swing.*;
import java.awt.*;
import refactexample.shapes.Shape;

/**
 *
 * @author admin
 */
public class ShapePanel extends JPanel
{

    String s = "";
    int postionX = 0;
    int postionY = 0;
    int size = 0;
    boolean isCircle = false;
    boolean erase = true;

    public ShapePanel()
    {
    }

    public void paintShape(Shape sh)
    {
        erase = false;
        Point p = sh.getPoint();
        s = sh.getId();
        postionX = p.getX();
        postionY = p.getY();
        size = sh.getSize();
        isCircle = s.equals("C");
        this.repaint();
    }

    public void erase()
    {
        erase = true;
        this.repaint();
    }

    public void paintComponent(Graphics g)
    {
        g.setColor(Color.white);
        g.fillRect(0, 0, 500, 400);
        if (!erase) {
            g.setColor(Color.black);
            g.drawString(s, 10, 10);
            if (isCircle) {
                g.drawOval(postionX, postionY, size, size);
            } else {
                g.drawRect(postionX, postionY, size, size);
            }
            g.setColor(Color.white);
        }
    }

}
