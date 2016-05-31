/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package refactexample.shapes;

/**
 *
 * @author admin
 */
public abstract class Shape {
    int size;
    Point p;
    public Shape(int size, Point p) {
        this.size=size;
        this.p=p;
    }

    public int getSize() {
        return size;
    }

    public Point getPoint(){
        return p;
    }

    public abstract String getId();

}
