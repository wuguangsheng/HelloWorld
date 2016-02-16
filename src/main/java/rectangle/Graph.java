package rectangle;

import tool.DrawFrame;
import tool.DrawPanel;

import java.awt.*;
import java.awt.geom.Line2D;

/**
 * The program drawing a graph
 *
 * @author wuguangsheng
 * @version V1.0 on 16/2/16
 */
public class Graph extends DrawPanel{
    public void graph(){
        DrawFrame frame = new DrawFrame("Drawing a graph");
        Graph drawing = new Graph(500,400);
        frame.add(drawing);
        frame.pack();
        frame.centreOnScreen();
        frame.setVisible(true);
    }
    public Graph() {}
    public Graph(final int w,final int h){super(w,h);}

    /**
     * The method for drawing a axis for x or y
     * @param g2d
     */
   void drawAxis(final Graphics2D g2d,final int scale, final int scalevalue,
                  final int step, final int xoffset, final int yoffset, final int x,final int y){
        Line2D line = new Line2D.Double(xoffset,yoffset,x,y);
        g2d.draw(line);
        if (y != yoffset){
            for(int i = 0;i < scale; ++i){
                if (i != 0){
                    line.setLine(xoffset+(i*step),yoffset,xoffset+(i*step),yoffset+5);
                    g2d.draw(line);
                }
                g2d.drawString(new Integer(i*scalevalue).toString(),xoffset+(i*step),yoffset+20);
            }
        }else {
            for (int i = 0; i < scale; ++i){
                if (i !=0){
                    line.setLine(xoffset,yoffset-(i*step),xoffset-5,yoffset-(i*step));
                    g2d.draw(line);
                }
                g2d.drawString(new Integer(i*scalevalue).toString(),xoffset-26,yoffset-(i*step));
            }
        }
    }
    void plotCross(final Graphics2D g2d, final int x, final int y){
        Line2D line = new Line2D.Double(x-5,y-5,x+5,y+5);
        g2d.draw(line);
        line.setLine(x+5,y-5,x-5,y+5);
        g2d.draw(line);
    }
    void plotPoint(final Graphics2D g2d, final int x, final int y,
                   final int oldx, final int oldy){
        int posx = 4 * x + 50;
        int posy = 350 - 4 * y;
        int posoldx = 4 * oldx + 50;
        int posoldy = 350 - 4 * oldy;
        plotCross(g2d, posx, posy);
        Line2D line = new Line2D.Double(posoldx,posoldy,posx,posy);
        g2d.draw(line);
    }
    void points(final Graphics2D g2d){
        plotPoint(g2d,10,10,0,0);
        plotPoint(g2d,20,35,10,10);
        plotPoint(g2d,30,40,20,35);
        plotPoint(g2d,40,30,30,40);
        plotPoint(g2d,50,35,40,30);
        plotPoint(g2d,60,30,50,35);
        plotPoint(g2d,70,40,60,30);
        plotPoint(g2d,80,30,70,40);
        plotPoint(g2d,90,60,80,30);
    }
    public void paint(final Graphics g){
        Graphics2D g2d = (Graphics2D)g;
        drawAxis(g2d,8,10,40,50,350,450,350);
        drawAxis(g2d,11,10,40,50,350,50,70);
        points(g2d);
    }
}
