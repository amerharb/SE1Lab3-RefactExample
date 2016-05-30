/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package refactexample.graphics;

import javax.swing.*;
import java.awt.*;
import refactexample.shapes.Shape;
import refactexample.shapes.Point;

/**
 *
 * @author admin
 */
public class ShapePanel extends JPanel {
   String s="";
   int postionX=0;
   int postionY=0;
   int size=0;
   boolean isCircle=false;
   boolean blank=true;

   public ShapePanel() {
   }

   public void paintShape(Shape sh) {
       blank=false;
       Point p=sh.getPoint();
       s=sh.getId();
       postionX=p.x;
       postionY=p.y;
       size=sh.getSize();
       isCircle = s.equals("C");
       this.repaint();
   }

   public void blank() {
       blank=true;
       this.repaint();
   }


   public void paintComponent(Graphics g) {
	g.setColor(Color.white);
	g.fillRect(0, 0, 500, 400);
        if (!blank) {
            g.setColor(Color.black);
            g.drawString(s, 10, 10);
            if (isCircle)
                g.drawOval(postionX, postionY, size, size);
            else
                g.drawRect(postionX, postionY, size, size);
            g.setColor(Color.white);
        }
   }




}
