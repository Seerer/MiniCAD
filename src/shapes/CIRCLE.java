package shapes;

import java.awt.*;

public class Circle extends Shape{
    public static final long serialVersionUID = 1L;

    public Circle(int x1, int y1, int x2, int y2, String shape, Color color, float stroke){
        super(x1, y1, x2, y2, shape, color, stroke);
    }

    @Override
    public void DrawGraphics(Graphics2D shape) {
        int centralx = (getX1() + getX1())/2;
        int centraly = (getY1() + getY2())/2;
        int radius = (int) Math.sqrt((centralx-getX1())^2 + (centraly-getY1())^2);
        shape.setPaint(getColor());
        shape.setStroke(new BasicStroke(getStroke(),BasicStroke.CAP_BUTT,BasicStroke.JOIN_ROUND));
        shape.drawOval(centralx-radius, centraly + radius, 2*radius, 2*radius);
        InitGraphics();
    }
    public void InitGraphics(){

    }
}
