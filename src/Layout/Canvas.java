package Layout;

import shapes.Shape;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Canvas extends JPanel {
    private static final long serialVersionUID = 1L;

    private ArrayList<Shape> shape_list = new ArrayList<Shape>();

    public Canvas(){
        this.setSize(1600, 1200);
        this.setBackground(Color.WHITE);
    }
    //先画出所有的控件，然后绘制出所有的shape
    public void PaintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2D = (Graphics2D)g;
        for (Shape s : shape_list)
            s.DrawGraphics(g2D);
    }

    public void AddShape(Shape s){
        shape_list.add(s);
    }

    public Shape GetShape(int index){
        return shape_list.get(index);
    }

    public void SetShape(int i, Shape s){
        shape_list.set(i, s);
    }

    public void RemoveShape(int index){
        shape_list.remove(index);
    }

    public int GetShapeNum(){
        return shape_list.size();
    }
    //通过下标获得画板上对应Shape的索引
    public int GetShapeIndex(int x, int y) {
        for (Shape s : shape_list)
            if (s.Contains(x, y))
                return shape_list.indexOf(s);
        return -1;
    }

    public void ClearAll(){
        shape_list.clear();
    }
}
