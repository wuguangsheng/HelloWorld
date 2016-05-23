import data.CelsiusFahrenheitComparisonTable;
import data.MultiplicationTable;
import data.UtilDate;
import person.PersonDate;
import person.PersonDescribe;
import rectangle.*;
import tool.FileInput;
import tool.KeyboardInput;
import triangle.TriangleArea;

import java.awt.*;

/**
 * The java learning main run class
 * @author wuguangsheng
 * @version 1.0 16/1/29
 *
 */
public class Option{
    public static void main(final String[] arge){
        /**
         * Sade hello world!
         */
        PersonDescribe kathy=new PersonDescribe();
        kathy.speak("Hello World");

        /**
         * Drawing
         */
        Thread thread1,thread2;
        ThreadGraph threadGraph = new ThreadGraph();
        thread1 = new Thread(threadGraph);
        thread1.start();

        /**
         * Thread run for Drawing a graph
         */
        ThreadDrawing threadDrawing =new ThreadDrawing();
        thread2 = new Thread(threadDrawing);
        thread2.start();

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        /**
         * generated order
         */
        UtilDate now = new UtilDate();
        kathy.speak("订单编码：\t" + now.getOrderNum() + now.getNumber(1000));
        kathy.speak("下单时间：\t" + now.getDateFormatter());
        kathy.speak("订单批号：\t" + now.getDate());

        /**
         * Input times from keyboard then mad multiplication table
         */
        MultiplicationTable ob = new MultiplicationTable();
        KeyboardInput input = new KeyboardInput();
        System.out.println("Input time:");
        final int time = input.readInteger();
        ob.anyNumber(time);

        /**
         * person information
         */
        PersonDate show = new PersonDate();
        show.Information();

        /**
         * triangle area
         */
        kathy.speak("\n三角形面积计算");
        TriangleArea key = new TriangleArea();
        key.triangleArea();

        /**
         * display rectangle
         */
        DisplayRectangle display = new DisplayRectangle();
        System.out.println("Input height:");
        final int height = input.readInteger();
        System.out.println("Input width:");
        final int width = input.readInteger();
        display.displayRectangle(height, width);

        /**
         * display celsius fahrenheit comparison table
         */
        CelsiusFahrenheitComparisonTable by =
                new CelsiusFahrenheitComparisonTable();
        by.displayComparisonTable();

        /**
         * Drawing a spiral
         */
        DrawingSpiral draw = new DrawingSpiral(1440,1024);
        draw.drawingSpiral();

        /**
         * Drawing Color rectangle
         */
        ColorRectangle rectangle = new ColorRectangle(50,90,100,20, Color.CYAN);
        rectangle.colorRectangle(rectangle);

        /**
         * File input
         */
        FileInput in = new FileInput("/Users/wuguangsheng/Sites/HelloWorld/src/main/java/data/PointAxis.dat");
        String s = in.readString();
        while (in.eof()){
           System.out.print(s);
           System.out.println(in);
           s = in.readString();
        }
        in.close();
        System.out.println();
   }
}
