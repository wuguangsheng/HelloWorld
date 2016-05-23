package rectangle;

import tool.DrawFrame;
import tool.DrawPanel;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.Rectangle2D;

/**
 * The program is drawing template
 *
 * @author wuguangsheng
 * @version V1.0 on 16/2/3
 */
public class Drawing extends DrawPanel{
    /**
     * Create a frame and drawing, display them on the screen.
     */
    public void drawAnything(){
        // Change the string "Drawing" to change the frame title.
        DrawFrame frame = new DrawFrame("Drawing");
        // Don't forget to edit the names here if you change the
        // class name.
        Drawing drawing = new Drawing();
        // The drawing grid size can be change by using a statement
        // like this :
        // Drawing drawing = new Drawing(500,600);
        // This will give a 500 X 600 frame.
        // Don't change these lines.
        frame.add(drawing);
        frame.pack();
        frame.centreOnScreen();
        frame.setVisible(true);
    }

    /**
     * If the class name is changed ,then edit the name of the
     * following two methods to match, i.e. if your class is
     * called MyPicture, the next method becomes
     * public MyPicture(){}.
     */
    public Drawing(){}
    public Drawing(final int w, final int h){
        super(w,h);
    }

    /**
     * This method is called to do the actual drawing
     * @param g
     * g
     */
    public void paint(final Graphics g){
        // Don't edit this line.
        Graphics2D g2d = (Graphics2D)g;
        // Change anything below this line to draw a picture
        Rectangle2D r = new Rectangle2D.Double(0,0,0,0);
        Ellipse2D e = new Ellipse2D.Double(0,0,0,0);
        GeneralPath triangle = new GeneralPath();
        for (int i= 0;i < 10; ++i){
            r.setRect(i * 15, i * 15, 100, 50);
            g2d.setColor(Color.red);
            g2d.draw(r);
            g2d.setColor(Color.yellow);
            e.setFrame(i * 10, 200 - i * 15, 15 * i, 20 * i);
            g2d.setColor(Color.blue);
            g2d.draw(e);
            triangle.moveTo(i*10,i*15);
            triangle.lineTo(i*20,i*15);
            triangle.lineTo(i*15, i*5);
            triangle.lineTo(i*10, i*15);
            triangle.closePath();
            g2d.draw(triangle);
        }
    }
    // other method can be added here
}
