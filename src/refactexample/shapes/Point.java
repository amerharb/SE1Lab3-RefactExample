/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package refactexample.shapes;

import java.beans.PropertyChangeSupport;

/**
 *
 * @author admin
 */
public class Point
{

    private int x;
    private int y;

    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public int getX()
    {
        return x;
    }

    public void setX(int x)
    {
        int oldX = this.x;
        this.x = x;
    }

    public int getY()
    {
        return y;
    }

    public void setY(int y)
    {
        int oldY = this.y;
        this.y = y;
    }
}
