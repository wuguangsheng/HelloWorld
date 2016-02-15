package rectangle;

import tool.DrawFrame;
import tool.DrawPanel;

import java.awt.*;
import java.awt.geom.Rectangle2D;

/**
 * The program drawing a spiral
 *
 * @author wuguangsheng
 * @version V1.0 on 16/2/15
 */
public class DrawingSpiral extends DrawPanel{
    public void drawingSpiral(){
        DrawFrame frame = new DrawFrame("Drawing a spiral");
        DrawingSpiral drawing = new DrawingSpiral();
        frame.add(drawing);
        frame.pack();
        frame.centreOnScreen();
        frame.setVisible(true);
    }
    private DrawingSpiral(){}
    public DrawingSpiral(final int w, final int h){
        super(w, h);
    }
    public void paint(final Graphics g){
        Graphics2D g2d = (Graphics2D)g;
        Rectangle2D rectangle = new Rectangle2D.Double(0,0,0,0);
        double theta = 0.0;
        double increment = 2* Math.PI/100.0;
        for (int n = 0; n < 1500; ++n){
            theta += increment;
            double radius = 75.0 * n / 1000;
            double x = 150 + (radius * Math.cos(theta));
            double y = 150 + (radius * Math.sin(theta));
            rectangle.setRect(x,y,1,1);
            g2d.draw(rectangle);
        }
    }
}
