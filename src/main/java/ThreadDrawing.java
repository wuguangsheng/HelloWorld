import rectangle.Drawing;

/**
 * The program is the thread implement with runnable
 *
 * @author wuguangsheng
 * @version V1.0 on 16/5/23
 */
class ThreadDrawing implements Runnable {
    public void run(){
        Drawing drawing = new Drawing();
        drawing.drawAnything();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
