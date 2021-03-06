import data.CelsiusFahrenheitComparisonTable;
import data.MultiplicationTable;
import data.UtilDate;
import person.PersonDate;
import person.PersonDescribe;
import rectangle.DisplayRectangle;
import rectangle.Drawing;
import rectangle.DrawingSpiral;
import rectangle.Graph;
import tool.KeyboardInput;
import triangle.TriangleArea;

import java.awt.*;

/**
 * The java learning main run class
 * @author wuguangsheng
 * @version 1.0 16/1/29
 *
 */
public class Option {
   public static void main(String[]args){
       /**
        * Sade hello world!
        */
//       PersonDescribe kathy=new PersonDescribe();
//       kathy.speak("Hello World");

       /**
        * generated order
       **/
//       UtilDate now = new UtilDate();
//       kathy.speak("订单编码：\t" + now.getOrderNum() + now.getNumber(1000));
//       kathy.speak("下单时间：\t" + now.getDateFormatter());
//       kathy.speak("订单批号：\t" + now.getDate());

       /**
        * Input times from keyboard then mad multiplication table
        */
//       MultiplicationTable ob = new MultiplicationTable();
//       KeyboardInput input = new KeyboardInput();
//       System.out.println("Input time:");
//       final int time = input.readInteger();
//       ob.anyNumber(time);

       /**
        * person information
        */
//       PersonDate show =new PersonDate();
//       show.Information();

       /**
        * triangle area
        */
//       kathy.speak("\n三角形面积计算");
//       TriangleArea key = new TriangleArea();
//       key.triangleArea();

       /**
        * display rectangle
        */
//       DisplayRectangle display = new DisplayRectangle();
//       System.out.println("Input height:");
//       final int height = input.readInteger();
//       System.out.println("Input width:");
//       final int width = input.readInteger();
//       display.displayRectangle(height, width);

       /**
        * display celsius fahrenheit comparison table
        */
//       CelsiusFahrenheitComparisonTable by =
//           new CelsiusFahrenheitComparisonTable();
//       by.displayComparisonTable();

       /**
        * Drawing
        */
       Drawing drawing = new Drawing(1440,1024);
       drawing.drawAnything();

       /**
        * Drawing a spiral
        */
       DrawingSpiral draw = new DrawingSpiral(1440,1024);
       draw.drawingSpiral();

       /**
        * Drawing a graph
        */
       Graph drawingGraph = new Graph(1440,1024);
       drawingGraph.graph();
   }
}
