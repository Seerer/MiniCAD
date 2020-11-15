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
        JMenu file = new JMenu("Files");
        JMenu edit = new JMenu("Edit");

        JMenuItem new_file = new JMenuItem("New file");
        new_file.setFont(new Font("微软雅黑", 1, 10));
        new_file.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                NewFile();
            }
        });
        file.add(new_file);

        JMenuItem open_file = new JMenuItem("Open");
        new_file.setFont(new Font("微软雅黑", 1, 10));
        new_file.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                OpenFile();
            }
        });
        file.add(open_file);

        JMenuItem save_file = new JMenuItem("Save");
        new_file.setFont(new Font("微软雅黑", 1, 10));
        new_file.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SaveFile();
            }
        });
        file.add(save_file);

        JMenuItem save_as_file = new JMenuItem("Save as");
        new_file.setFont(new Font("微软雅黑", 1, 10));
        new_file.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SaveAsFile();
            }
        });
        file.add(save_as_file);

        JMenuItem exit = new JMenuItem("Exit");
        new_file.setFont(new Font("微软雅黑", 1, 10));
        new_file.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Exit();
            }
        });
        file.add(exit);
        //此处可以保留一下，考虑设置preference在内部进行画布大小的调整
        JMenuItem edit_menu = new JMenuItem("Change window size");
        new_file.setFont(new Font("微软雅黑", 1, 10));
        new_file.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EditMenu();
            }
        });
        edit.add(edit_menu);
    }

    public void NewFile(){

    }

    public void OpenFile(){

    }

    public void SaveFile(){

    }

    public void SaveAsFile(){

    }

    public void Exit(){

    }

    public void EditMenu(){

    }


    public boolean isIs_updated() {
        return is_updated;
    }

    public void setIs_updated(boolean is_updated) {
        this.is_updated = is_updated;
    }

    public boolean isIs_saved() {
        return is_saved;
    }

    public void setIs_saved(boolean is_saved) {
        this.is_saved = is_saved;
    }
}
