package Layout;

import shapes.*;
import shapes.Rectangle;
import shapes.Shape;

import javax.swing.*;
import java.awt.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class MiniCadInterface extends JFrame {
    private static final long serialVersionUID = 1L;

    private MenuBar menu;
    private ToolBar tool;
    private Canvas canvas;
    private JPanel draw_plane;
    private ColorControl palette;
    private FontControl font_pool;
    private JLabel status;

    //画布位置信息
    private int canvas_x, canvas_y, canvas_len, canvas_height;
    //笔画粗细
    private float stroke =5;
    //端点坐标
    private int x1, y1, x2, y2;
    //当前中心位置
    private int cx, cy;
    private int font_style;
    private int font_size;
    private int mouse_press;
    private int mouse_wheel;
    private int shape_index;

    private String font;
    private String context;
    private String cur_shape_type;
    private Color color = Color.BLACK;
    private Shape cur_shape;

    public MiniCadInterface(){
        super.setTitle("MyMiniCAD");
        super.setSize(1600, 1200);

        //substantiate toolbar
        tool = new ToolBar();
        super.add(tool, BorderLayout.WEST);

        //substantiate draw_plane and Canvas
        draw_plane = new JPanel();
        draw_plane.setLayout(null);
        draw_plane.setBackground(Color.GRAY);

        //substantiate canvas
        canvas = new Canvas();
        canvas.setBounds(10, 10, canvas.getWidth(), canvas.getHeight());

        draw_plane.add(canvas);
        draw_plane.setPreferredSize(new Dimension(canvas.getWidth() + 10, canvas.getHeight() + 10));
        JScrollPane jsp = new JScrollPane();
        //super.setContentPane(jsp);
        super.getContentPane().add(jsp);

        //substantiate FontBar
        font_pool = new FontControl();
        super.add(font_pool, BorderLayout.NORTH);

        //substantiate platte
        JPanel south_panel = new JPanel();
        south_panel.setLayout(null);
        south_panel.setPreferredSize(new Dimension(super.getWidth(), 100));
        palette = new ColorControl();
        palette.setBounds(16, 12, super.getWidth() - 16, 50);

        //substantiate status
        status = new JLabel();
        status.setBounds(16, 66, super.getWidth() - 16, 15);
        south_panel.add(status);
        super.add(south_panel, BorderLayout.SOUTH);
        status.setText("Welcome words");

        //substantiate menu
        menu = new MenuBar(canvas);
        super.setJMenuBar(menu);


        super.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        super.setLocationRelativeTo(null);
        super.setVisible(true);
    }

    public void InitGraphics(){
        Image image_cursor_brush = Toolkit.getDefaultToolkit().getImage("");
        Image image_cursor_delete = Toolkit.getDefaultToolkit().getImage("");
        Image image_cursor_resize = Toolkit.getDefaultToolkit().getImage("");

        palette.GetCurrentPanel().addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                color = palette.GetCurrentColor();
                if (shape_index != 1 && shape_index <= canvas.GetShapeNum())
                    UpdateShape();
            }
        });

        font_pool
    }

    private void UpdateShape(){
        CreateNewShape();
        canvas.SetShape(shape_index, cur_shape);
    }

    public void CreateNewShape(){
        menu.setIs_updated(true);
        if (cur_shape_type.equals("Line"))
            cur_shape = new Line(x1, y1, x2, y2, "Line", color, stroke);
        else if (cur_shape.equals("Rectangle"))
            cur_shape = new Rectangle(x1, y1, x2, y2, "Rectangle", color, stroke);
        else if (cur_shape.equals("Circle"))
            cur_shape = new Circle(x1, y1, x2, y2, "Circle", color, stroke);
        else if (cur_shape.equals("Ellipse"))
            cur_shape = new Ellipse(x1, y1, x2, y2, "Ellipse", color, stroke);
        else
            cur_shape = new Text(x1, y1, x2, y2, "Text", color, stroke, font, context, font_style, font_size);
    }

    public static void main(String args[]){
        MiniCadInterface minicad = new MiniCadInterface();
        minicad.InitGraphics();
    }
}
