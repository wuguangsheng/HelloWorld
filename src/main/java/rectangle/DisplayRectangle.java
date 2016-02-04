package rectangle;

/**
 * The program displaying rectangle with *
 *
 * @author wuguangsheng
 * @version V1.0 on 16/2/4
 */
public class DisplayRectangle {
    /**
     * The method displaying a solid line with *
     * @param width
     */
    void displaySolidLine(final int width){
        for (int i = 0 ; i < width; ++i){
            System.out.print("*");
        }
    }

    /**
     * The method displaying row head-end with *
     * @param width
     */
    void displayLineWithEndsOnly(final int width){
        System.out.print("*");
        for (int i = 0; i < width -2; ++i){
            System.out.print(" ");
        }
        System.out.print("*");
    }

    /**
     * The method displaying rectangle base in height and width
     * @param height
     * @param width
     */
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
