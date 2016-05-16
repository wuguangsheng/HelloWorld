package rectangle;

import java.awt.*;
import java.io.IOException;

/**
 * Created by Steven on 16/5/16.
 */
public class BoxFun {
    public static void boxFun() throws IOException {

        ColorRectangle cl = new ColorRectangle(50,100,100,20,Color.CYAN);

        System.out.println("Enter any then ready");
        System.in.read();

        cl.colorRectangle();
    }
}
