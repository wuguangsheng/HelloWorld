package rectangle;


import tool.DrawFrame;

import java.awt.*;

/**
 * The program
 *
 * @author wuguangsheng
 * @version V1.0 on 16/5/9
 */
public class BoxFun {
    public void boxfun(){

        DrawFrame f = new DrawFrame("Even Fun");
        ColorRectangle colorRectangle = new ColorRectangle(200,200,80,40,20,20,f, Color.CYAN);

        colorRectangle.ColorRectangle();
    }
}
