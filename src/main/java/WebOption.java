import rectangle.Home;

import java.applet.Applet;

/**
 * The program is the class for web applet
 *
 * @author wuguangsheng
 * @version V1.0 on 16/5/21
 */
public class WebOption extends Applet {
    public void init(){
        add(new Home());
    }
/*
    public void start(){

    }
    public void stop(){}
    public void destroy(){}
    public void paint(Graphics g){
        g.setColor(Color.BLUE);
        g.drawString("Hello",100,100);
    }
*/
}
