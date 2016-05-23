import rectangle.Graph;

/**
 * The program thread implements
 *
 * @author wuguangsheng
 * @version V1.0 on 16/5/23
 */
class ThreadGraph implements Runnable {
    public void run(){
        Graph g = new Graph();
        g.graph();

        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
