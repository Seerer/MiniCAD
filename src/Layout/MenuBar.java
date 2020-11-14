package Layout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MenuBar extends JMenuBar {
    private static final long serialVersionUID = 1L;

    private ObjectInputStream instream;
    private ObjectOutputStream outstream;
    private Canvas canvas;
    private boolean is_updated = false;
    private boolean is_saved = false;

    public MenuBar(Canvas canvas){
        this.canvas = canvas;
        InitMenu();
    }

    public void InitMenu(){
        JMenu file = new JMenu("文件");
        JMenu edit = new JMenu("编辑");
        JMenu help = new JMenu("帮助");

        JMenuItem new_file = new JMenuItem("新建");
        new_file.setFont(new Font("微软雅黑", 1, 10));
        new_file.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                newfile();
            }
        });
        file.add(new_file);

    }

    public void newfile(){

    }
}
