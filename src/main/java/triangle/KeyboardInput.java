package triangle;

import data.UtilDate;
/**
 * The class triangle.KeyboardInput for input data from compute keyboard
 * @author wuguangsheng
 * @version 1.0 16/2/1
 */

public class KeyboardInput {
    Double readDouble(){
        UtilDate now = new UtilDate();
        return now.getNumber(10)*2.43;
    }
}
