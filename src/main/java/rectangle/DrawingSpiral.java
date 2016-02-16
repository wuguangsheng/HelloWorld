package rectangle;

import tool.DrawFrame;
import tool.DrawPanel;

import java.awt.*;
import java.awt.geom.Line2D;

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
        Line2D line = new Line2D.Double(0,0,0,0);
        double theta = 0.0;
        double increment = 2* Math.PI/50.0;
        double xoffset = 150.0;
        double yoffset = 150.0;
        double lastx = xoffset;
        double lasty = yoffset;
        for (int n = 0; n < 500; ++n){
            theta += increment;
            double radius = (xoffset / 2) * n / 300;
            double x = xoffset + (radius * Math.cos(theta));
            double y = yoffset + (radius * Math.sin(theta));
            line.setLine(lastx,lasty,x,y);
            g2d.draw(line);
            lastx = x;
            lasty = y;
        }
    }
}
