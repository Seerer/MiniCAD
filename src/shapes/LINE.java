package shapes;

import java.awt.*;

public class Line extends Shape{
    public static final long serialVersionUID = 1L;

    public Line(int x1, int y1, int x2, int y2, String shape, Color color, float stroke){
        super(x1, y1, x2, y2, shape, color, stroke);
    }

    @Override
    public void DrawGraphics(Graphics2D shape) {
        shape.setPaint(getColor());
        shape.setStroke(new BasicStroke(getStroke(),BasicStroke.CAP_BUTT,BasicStroke.JOIN_ROUND));
        shape.drawLine(getX1(), getY1(), getX2(), getY2());
        InitGraphics();
    }
    public void InitGraphics(){

    }
}
