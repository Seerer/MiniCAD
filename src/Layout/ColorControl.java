package Layout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ColorControl extends JPanel {
    private static final long serialVersionUID = 1L;
    private JPanel cur_panel;

    public ColorControl(){
        Init();
    }

    public void Init(){
        this.setLayout(null);
        this.setSize(new Dimension(400, 100));

        cur_panel = new JPanel();
        cur_panel.setBackground(Color.BLACK);
        cur_panel.setToolTipText("current color");
        cur_panel.setBounds(0, 15, 40, 40);

        MouseAdapter ma = new MouseAdapter() {
            public void mousePressed(MouseEvent e){
                JPanel btn = (JPanel)e.getSource();
                if (e.getButton() == 1)
                    setColor(btn.getBackground());
            }
        };

        JPanel  color_board = new JPanel();
        color_board.setLayout(new GridLayout(2, 5, 2, 2));
        color_board.setBounds(50, 2, 240, 60);
        color_board.setToolTipText("available colors");

        Color[] color_map = {Color.BLACK, Color.WHITE, Color.BLUE, Color.RED, Color.ORANGE,
                            Color.YELLOW, Color.PINK, Color.GRAY, Color.lightGray,Color.GREEN,};
        for (int i = 0; i < color_map.length; i++)
        {
            JPanel cp = new JPanel();
            cp.setPreferredSize(new Dimension(30, 30));
            cp.setBackground(color_map[i]);
            cp.setToolTipText("R:" + color_map[i].getRed() + " G:" + color_map[i].getGreen() + " B:" + color_map[i].getBlue());

            color_board.add(cp);
        }

        this.setBackground(null);

    }

    public JPanel GetCurrentPanel(){
        return cur_panel;
    }

    public void setColor(Color c){
        cur_panel.setBackground(c);
    }
}
