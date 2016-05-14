package rectangle;

import tool.DrawFrame;
import tool.DrawPanel;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Steven on 16/5/14.
 */
public class ColorRectangle{
    private int rectangle_x;
    private int rectangle_y;
    private int rectangle_width;
    private int rectangle_height;
    private JFrame frame;
    private Color color;

    public ColorRectangle(){
        frame = new JFrame("color rectangle");

        rectangle_x = 80;
        rectangle_y = 90;
        rectangle_width = 20;
        rectangle_width = 20;
        color = Color.BLUE;
        frame.setSize(200,200);
        frame.setVisible(true);

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
    public void setFrame(JFrame f){
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
    public JFrame getFrame(){
        return frame;
    }

    public ColorRectangle(int x,int y,int w,int h,JFrame f,Color c){

        setRectangle_x(x);
        setRectangle_y(y);
        setRectangle_width(w);
        setRectangle_height(h);
        setColor(c);
        setFrame(f);

        frame.setSize(200,200);
        frame.setVisible(true);

    }

    public void paint(){
        System.out.println(getFrame());
        frame.setVisible(true);
        Graphics g = frame.getGraphics();
        g.setColor(color);
        g.fillRect(rectangle_x,rectangle_y,rectangle_width,rectangle_height);
    }
}
