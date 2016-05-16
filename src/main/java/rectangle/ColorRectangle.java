package rectangle;

import tool.DrawFrame;
import tool.DrawPanel;

import java.awt.*;

/**
 * Created by Steven on 16/5/14.
 */
public class ColorRectangle extends DrawPanel{
    private int rectangle_x;
    private int rectangle_y;
    private int rectangle_width;
    private int rectangle_height;
    private DrawFrame frame = new DrawFrame("Box Fun");
    private Color color;

    public void colorRectangle(ColorRectangle c){
        frame.add(c);
        frame.pack();
        frame.centreOnScreen();
        frame.setVisible(true);
    }

    public ColorRectangle(){
    }

    public ColorRectangle(int x,int y,int w,int h,Color c){
        super(200,200);
        setRectangle_x(x);
        setRectangle_y(y);
        setRectangle_width(w);
        setRectangle_height(h);
        setColor(c);
    }

    public void paint(final Graphics g){
        g.setColor(color);
        g.fillRect(rectangle_x,rectangle_y,rectangle_width,rectangle_height);
    }

    private void setRectangle_x(int x){
        rectangle_x = x;
    }
    private void setRectangle_y(int y){
        rectangle_y = y;
    }
    private void setRectangle_width(int w){
        rectangle_width = w;
    }
    private void setRectangle_height(int h){
        rectangle_height =h;
    }
    private void setColor(Color c){
        color = c;
    }
    private void setFrame(DrawFrame f){
        frame = f;
    }
    public int getRectangle_x(){
        return rectangle_x;
    }
    public int getRectangle_y(){
        return rectangle_y;
    }
    public int getRectangle_width(){
        return rectangle_width;
    }
    public int getRectangle_height(){
        return rectangle_height;
    }
    public Color getColor(){
        return color;
    }
    public DrawFrame getFrame(){
        return frame;
    }
}
