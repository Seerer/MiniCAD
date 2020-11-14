package Layout;

import javax.swing.*;
import java.awt.*;

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
    private int font_size;
    private int mouse_press;
    private int mouse_wheel;
    //private int shape_index;

    private String font;
    private String context;
    private String cur_shape_type;
    private Color color = Color.BLACK;
    private Shape cur_shape;

    public MiniCadInterface(){
        super.setTitle("MyMiniCAD");
        super.setSize(1200, 1000);

        //substantiate toolbar
        tool = new ToolBar();
        super.add(tool, BorderLayout.WEST);

        //substantiate draw_plane
        draw_plane = new JPanel();
        draw_plane.setLayout(null);
        draw_plane.setBackground(Color.GRAY);

        //substantiate canvas
        canvas = new Canvas();


        //substantiate FontBar
        font_pool = new FontControl();
        super.add(font_pool, BorderLayout.NORTH);

        //substantiate platte

        //substantiate status

        //substantiate menu
        menu = new MenuBar(canvas);
        super.setMenuBar(menu);

        super.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        super.setLocationRelativeTo(null);
        super.setVisible(true);
    }

    public void DrawListener(){

    }





}
