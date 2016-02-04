package tool;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * The class KeyboardInput for input data from compute keyboard
 * @author wuguangsheng
 * @version 1.0
 * created on 16/2/1
 * modified on 16/2/4
 */

public class KeyboardInput {
    /**
     * The buffered stream that works the keyboard so that we can
     * read from it sensibly.
     */
    private final BufferedReader in =
        new BufferedReader(new InputStreamReader(System.in));

    /**
     * Read an <CODE>int</CODE> value from keyboard input. The
     * default return value is 0.
     * @return int value
     */
    public final synchronized int readInteger(){
        String input = "";
        int value = 0;
        try {
            input = in.readLine();
        }
        catch (IOException e){}
        if (input != null){
            try {
                value = Integer.parseInt(input);
            }
            catch (NumberFormatException e){}
        }
        return value;
    }

    /**
     * Read a <CODE>long</CODE> value from keyboard input.The default
     * return value is 0L.
     * @return long value
     */
    public final synchronized long readLong(){
        String input = "";
        long value = 0L;
        try {
            input = in.readLine();
        }
        catch (IOException e){}
        if (input !=null){
            try {
                value = Long.parseLong(input);
            }
            catch (NumberFormatException e){}
        }
        return value;
    }

    /**
     * Read a <CODE>double</CODE> value from keyboard input. The
     * default return value is 0.0D.
     * @return double value
     */
    public final synchronized double readDouble(){
        String input = "";
        double value = 0.0D;
        try {
            input = in.readLine();
        }
        catch (IOException e) {}
        if (input !=null){
            try {
                value = Double.parseDouble(input);
            }
            catch (NumberFormatException e) {}
        }
        return value;
    }

    /**
     * Read a <CODE>float</CODE> value from keyboard input. The
     * default return value is 0.0F.
     * @return float value
     */
    public final synchronized float readFloat(){
        String input = "";
        float value = 0.0F;
        try {
            input = in.readLine();
        }
        catch (IOException e) {}
        if (input !=null){
            try {
                value = Float.parseFloat(input);
            }
            catch (NumberFormatException e) {}
        }
        return value;
    }

    /**
     * Read a <CODE>char</CODE> value from keyboard input. The
     * default value is ' ' (space).
     * @return char value
     */
    public final char readCharacter(){
        char c = ' ';
        try {
            c = (char)in.read();
        }
        catch (IOException e) {}
        return c;
    }

    /**
     * Read a <CODE>string</CODE> value from keyboard input. The
     * default value is ""(the empty string).
     * @return string value
     */
    public final synchronized String readString(){
        String s = "";
        try {
            s = in.readLine();
        }
        catch (IOException e) {}
        if (s == null) {
            s = "";
        }
        return s;
    }
}
