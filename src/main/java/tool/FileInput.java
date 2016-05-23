package tool;

import java.io.*;

/**
 * The program is a input class to read values from a file of characters,
 * if any file errors occur, methods in this class will display an error
 * message and terminate the program.
 *
 * @author wuguangsheng
 * @version V1.0 on 16/2/23
 */
public class FileInput {
    /**
     * Instance variables to store the name of the file we are associated
     * with.
     */
    private String filename = "";
    /**
     * Instance variables for the file stream associated with the file that
     * we are associated with.
     */
    private BufferedReader reader = null;
    /**
     * Instance variables to store current state of EOF.
     */
    private boolean eof = false;
    /**
     * Construct <CODE>FileInput</CODE> object give a file name.
     */
    public FileInput(final String fname){
        filename = fname;
        try {
            reader = new BufferedReader(new FileReader(filename));
        }
        catch (FileNotFoundException e){
            error("Can't open file:" + filename);
        }
    }
    /**
     * Construct <CODE>FileInput</CODE> object give a <CODE>File</CODE>
     * object.
     */
    public FileInput(final File file){
        filename = file.getName();
        try {
            reader = new BufferedReader(new FileReader(file));
        }
        catch (FileNotFoundException e){
            error("Can't open file:" + filename);
        }
    }
    /**
     * Close the file when finished
     */
    public final synchronized void close(){
        try {
            reader.close();
        }
        catch (IOException e){
            error("Can't closs file:" + filename);
        }
    }
    /**
     * Return true if the end of file has been reached.
     */
    public boolean eof(){
        return eof;
    }
    /**
     * Read an <CODE>int</CODE> value from file. the default return
     * values is 0.
     */
    public final synchronized int readInteger(){
        String input = "";
        int value = 0;
        try {
            input = reader.readLine();
        }
        catch (IOException e){
            error("readInteger failed for file:" + filename);
        }
        if (input == null){
            eof = true;
        }else {
            try {
                value = Integer.parseInt(input);
            }
            catch (NumberFormatException e){}
        }
        return value;
    }
    /**
     * Read a <CODE>long</CODE> value from file. The default return
     * value is 0L.
     */
    public final synchronized long readLong(){
        String input ="";
        long value = 0L;
        try {
            input = reader.readLine();
        }
        catch (IOException e){
            error("readLong failed for file:" + filename);
        }
        if (input == null){
            eof = true;
        }else {
            try {
                value = Long.parseLong(input);
            }
            catch (NumberFormatException e){}
        }
        return value;
    }
    /**
     * Read a <CODE>double</CODE> value from file. The default
     * return value is 0.0.
     */
    public final synchronized double readDouble(){
        String input = "";
        double value = 0.0D;
        try {
            input = reader.readLine();
        }
        catch (IOException e){
            error("readDouble failed for file:" + filename);
        }
        if (input == null){
            eof = true;
        }else {
            try {
                value = Double.parseDouble(input);
            }
            catch (NumberFormatException e){}
        }
        return value;
    }
    /**
     * Read a <CODE>float</CODE> value from file. The default
     * return value is 0.0F.
     */
    public final synchronized float readFloat(){
        String input = "";
        float value = 0.0F;
        try {
            input = reader.readLine();
        }
        catch (IOException e){
            error("readFloat failed for file:" + filename);
        }
        if (input == null){
            eof = true;
            }else {
            try {
                value = Float.parseFloat(input);
            }
            catch (NumberFormatException e){}
        }
        return value;
    }
    /**
     * Read a <CODE>char</CODE> value from file. The default
     * return value is ' '(space).
     */
    public final synchronized char readCharacter(){
        char c = ' ';
        try {
            int n = reader.read();
            if (n == -1){
                eof = true;
            }else {
                c =(char)n;
            }
        }
        catch (IOException e){
            error("readCharacter failed for file:" + filename);
        }
        return c;
    }
    /**
     * Read a <CODE>String</CODE> value from file. The default
     * return value is " "(the empty string).
     */
    public final synchronized String readString(){
        String s = "";
        try {
            s = reader.readLine();
        }
        catch (IOException e){
            error("readString failed for file:" + filename);
        }
        if (s == null){
            eof = true;
            s = "";
        }
        return s;
    }
    /**
     * Deal with a file error, write a message and terminate.
     */
    private void error(String msg){
        System.err.println(msg);
        System.err.println("Unable to continue executing program.");
        System.exit(0);
    }
}
