package tool;

import javax.swing.*;
import java.awt.*;

/**
 * The program product a <CODE>JPanel</CODE> with a default size,
 * Subclass must override the <CODE>paint</CODE> method which has
 * signature: <PRE> public void paint (final Graphics g) </PRE>.
 *
 * @author wuguangsheng
 * @version V1.0 on 16/2/5
 */
public class DrawPanel extends JPanel{
    /**
     * The width of the panel.
     */
    private int width = 300;
    /**
     * The height of the panel.
     */
    private int height = 300;
    /**
     * Default constructor, user the default size.
     */
    protected DrawPanel(){
        setPreferredSize(new Dimension(width,height));
    }
    /**
     * Constructor for a size determined by the user.
     */
    protected DrawPanel(final int w,final int h){
        width = w;
        height = h;
        setPreferredSize(new Dimension(width,height));
    }
    /**
     * Accessor for the width of the panel.
     * @return width
     */
    public int getWidth(){
        return width;
    }
    /**
     * Accessor for the height of the panel.
     * @return height
     */
    public int getHeight(){
        return height;
    }
}
