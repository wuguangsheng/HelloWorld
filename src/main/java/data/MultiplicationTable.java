package data;

/**
 * The Multiplication table class
 * @author wuguangsheng
 * @version 1.0 16/1/28
 */
public class MultiplicationTable {
    void table(final int n){
        int counter = 1;
        System.out.println("The " + n + " times table");
        while (counter < 13){
            System.out.print(counter + "x" + n);
            System.out.println("=" + counter * n);
            counter = counter + 1;
        }

    }
    public void input (final int x){
        if ((x < 2) || (x > 12)){
            System.out.println("Cannot display that table");
        } else {
            table(x);
        }

    }
    public void anyNumber(final int y){
        int time = 1;
        while (time < y){
            input(time);
            time = time + 1;
        }
    }

}
