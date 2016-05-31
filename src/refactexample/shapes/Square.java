/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package refactexample.shapes;

/**
 *
 * @author admin
 */
public class Square extends Shape
{

    String Id;

    public Square(int size, Point p)
    {
        super(size, p);
    }

    public String getId()
    {
        return "S";
    }

}
