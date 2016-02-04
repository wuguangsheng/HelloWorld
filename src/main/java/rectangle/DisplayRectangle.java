package rectangle;

/**
 * The program
 *
 * @author wuguangsheng
 * @version V1.0 on 16/2/4
 */
public class DisplayRectangle {
    void displaySolidLine(final int width){
        for (int i = 0 ; i < width; ++i){
            System.out.print("*");
        }
    }
    void displayLineWithEndsOnly(final int width){
        System.out.print("*");
        for (int i = 0; i < width -2; ++i){
            System.out.print(" ");
        }
        System.out.print("*");
    }
    public void displayRectangle(final int height, final int width){
        for (int i = 0; i < height; ++i){
            if ((i == 0)||(i == height - 1)){
                displaySolidLine(width);
            } else {
                displayLineWithEndsOnly(width);
            }
            System.out.println();
        }
    }
}
