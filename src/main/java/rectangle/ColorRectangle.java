package rectangle;

import tool.DrawFrame;
import tool.DrawPanel;

import java.awt.*;

/**
 * The program
 *
 * @author wuguangsheng
 * @version V1.0 on 16/5/9
 */
public class ColorRectangle extends DrawPanel{
    //Define the variables
    private int rectangle_width;
    private int rectangle_height;
    private int rectangle_x;
    private int rectangle_y;
    private DrawFrame frame;
    private Color color;

    //Default constructor
    public void ColorRectangle(){
        frame = new DrawFrame("Box Fun");
        ColorRectangle cl = new ColorRectangle();

        frame.add(cl);
        frame.pack();
        frame.centreOnScreen();
        frame.setVisible(true);
    }

    private ColorRectangle(){
        rectangle_x = 80;
        rectangle_y = 50;
        rectangle_width = 60;
        rectangle_height = 20;
        color = Color.BLUE;

    }
    public ColorRectangle(int w,int h,int x,int y,int r_w,int r_h,DrawFrame f,Color c){
        super(w, h);
        rectangle_width = r_w;
        rectangle_height = r_h;
        rectangle_x = x;
        rectangle_y = y;
        frame = f;
        color = c;

    }

    //Display a color rectangle in the window
    public void paint(final Graphics g){
        System.out.println(rectangle_width);
        g.setColor(color);
        g.fillRect(rectangle_x,rectangle_y,rectangle_width,rectangle_height);
    }

    //modified the instance variables in the object
    public void setWidth(int w){
        rectangle_width = w;
    }

    public void setHeight(int h){
        rectangle_height = h;
    }

    public void setX_axit(int x){
        rectangle_x = x;
    }

    public void setY_axit(int y){
        rectangle_y = y;
    }

    public void setWindow(DrawFrame f){
        frame = f;
    }

    public void setColor(Color c){
        color = c;
    }

    //get the instance variables in the object
    public int getWidth(){
        return rectangle_width;
    }

    public int getHeight(){
        return rectangle_height;
    }

    public int getX_axit(){
        return rectangle_x;
    }

    public int getY_axit(){
        return rectangle_y;
    }

    public DrawFrame getWindow(){
        return frame;
    }

    public Color getColor(){
        return color;
    }

}
