package shapes;

import java.awt.*;
import java.awt.font.FontRenderContext;
import java.awt.geom.Rectangle2D;

public class Text extends Shape{
    private static final long serialVersionUID = 1L;
    private double textwidth, textheight;
    private int style, fontsize;
    private String font, content;

    public Text(int x1, int y1, int x2, int y2, String shape, Color color, float stroke,
                String font, String content, int style, int fontsize){
        super(x1, y1, x2, y2, shape, color, stroke);
        this.font = font;
        this.content = content;
        this.style = style;
        this.fontsize = fontsize;
    }

    @Override
    public void DrawGraphics(Graphics2D text) {
        text.setPaint(getColor());
        Font f = new Font(font, style, fontsize);
        text.setFont(f);
        FontRenderContext c = text.getFontRenderContext();
        Rectangle2D StringBounds = f.getStringBounds(content, c);
        textwidth = StringBounds.getWidth();
        textheight = StringBounds.getHeight();
        if (content != "")
            text.drawString(content, (int)(getX1() - textwidth/2), (int)(getY1() + textwidth/2));
        //nitPoint();
    }


    public int getStyle() {
        return style;
    }

    public void setStyle(int style) {
        this.style = style;
    }

    public int getFontsize() {
        return fontsize;
    }

    public void setFontsize(int fontsize) {
        this.fontsize = fontsize;
    }

    public String getFont() {
        return font;
    }

    public void setFont(String font) {
        this.font = font;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
