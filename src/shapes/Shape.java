package shapes;

import java.awt.*;
import java.io.Serializable;
import java.util.HashSet;

//Shape class:
public class Shape implements Serializable {
    private static final long serialVersionUID = 1L;

    private int x1;
    private int y1;
    private int x2;
    private int y2;

    private String shape;
    private Color color;
    private float stroke;

    //Draw lines between every two points in order to shape the object.
    private HashSet<Point> points_sequence = new HashSet<Point>();

    public Shape(int x1, int y1, int x2, int y2, String shape, Color color, float stroke){
        setX1(x1);
        setY1(y1);
        setX2(x2);
        setY2(y2);
        setShape(shape);
        setColor(color);
        setStroke(stroke);
    }

    public void DrawGraphics(Graphics2D shape){

    }

    public void AddPoint(Point point){
        points_sequence.add(point);
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setStroke(float stroke) {
        this.stroke = stroke;
    }

    public int getX1() {
        return x1;
    }

    public int getY1() {
        return y1;
    }

    public int getX2() {
        return x2;
    }

    public int getY2() {
        return y2;
    }

    public String getShape() {
        return shape;
    }

    public Color getColor() {
        return color;
    }

    public float getStroke() {
        return stroke;
    }

}
