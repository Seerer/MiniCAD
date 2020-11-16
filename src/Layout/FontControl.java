package Layout;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class FontControl extends JPanel {
    private static final long serialVersionUID = 1L;

    private JCheckBox is_bold, is_italic;

    private JComboBox<String> style;
    private JComboBox<String> font_size;
    private String []FONT= {"微软雅黑", "宋体", "楷体", "Monospaced", "Times New Roman", "Garamond", "SonsSerif"};
    private String []FONTSIZE = new String[100];

    public void FontPanel(){
        for (int i = 0; i < FONTSIZE.length; i++)
            FONTSIZE[i] = Integer.toString(++i);
        Init();
    }

    public void Init(){
        this.setLayout(null);
        this.setPreferredSize(new Dimension(600, 38));

        //checkbox for bold type
        is_bold = new JCheckBox("Bold");
        is_bold.setBackground(null);
        is_bold.setFont(new Font("微软雅黑",1,15));
        is_bold.setBounds(540, 0, 70, 38);
        this.add(is_bold);

        //checkbox for italic type
        is_italic = new JCheckBox("Italic");
        is_italic.setBackground(null);
        is_italic.setFont(new Font("微软雅黑",3,15));
        is_italic.setBounds(540, 0, 70, 38);
        this.add(is_italic);

        //location of the font fence
        JTextField jtf1 = new JTextField("Font: ");
        jtf1.setFont(new Font("微软雅黑", 1, 15));
        jtf1.setBounds(20, 0, 55, 38);
        jtf1.setEditable(false);
        jtf1.setBorder(new LineBorder(new Color(0,0,0,0)));
        this.add(jtf1);

        //drop down menu for the font
        style = new JComboBox<String>(FONT);
        style.setBackground(null);
        style.setFont(new Font("微软雅黑", 1, 15));
        style.setSelectedIndex(0);
        style.setMaximumRowCount(7);
        style.setBounds(75, 7, 175, 26);
        this.add(style);

        //location of the font size fence
        JTextField jtf2 = new JTextField("Font Size: ");
        jtf2.setBackground(null);
        jtf2.setFont(new Font("微软雅黑", 1, 15));
        jtf2.setBounds(270, 0, 55, 38);
        jtf2.setEditable(false);
        jtf2.setBorder(new LineBorder(new Color(0,0,0,0)));
        this.add(jtf2);

        //drop down menu for the font size fence
        font_size = new JComboBox<String>(FONTSIZE);
        font_size.setLayout(null);
        font_size.setFont(new Font("微软雅黑", 1, 15));
        font_size.setBounds(20, 0, 55, 38);
        font_size.setEditable(false);
        font_size.setBorder(new LineBorder(new Color(0, 0, 0, 0)));
        this.add(font_size);
    }

    public int getBold(){
        if (is_bold.isSelected())
            return Font.BOLD;
        else
            return Font.PLAIN;
    }

    public int getItalic(){
        if (is_italic.isSelected())
            return Font.ITALIC;
        else
            return Font.PLAIN;
    }

    //use lower word to distinguish from the default name
    public String getfont(){
        return FONT[style.getSelectedIndex()];
    }

    public int getFontSize(){
        return Integer.parseInt(FONTSIZE[font_size.getSelectedIndex()]);
    }

    public void SetBoldCheckbox(int flag){
        if (flag == Font.BOLD)
            is_bold.setSelected(true);
        else
            is_bold.setSelected(false);
    }

    public void SetItalicCheckBox(int flag){
        if (flag == Font.ITALIC)
            is_italic.setSelected(true);
        else
            is_italic.setSelected(false);
    }

    public void SetFontCombobox(String s){
        for (int i = 0; i < FONT.length; i++)
            if (FONT[i].equals(s))
                font_size.setSelectedIndex(i);
    }

    public JCheckBox getIs_bold() {
        return is_bold;
    }

    public JCheckBox getIs_italic() {
        return is_italic;
    }

    public JComboBox<String> getStyle() {
        return style;
    }

    public JComboBox<String> getFont_size() {
        return font_size;
    }
}
