import data.MultiplicationTable;
import data.UtilDate;
import person.HelloWorld;
import person.PersonDate;
import person.PersonDescribe;
import triangle.TriangleArea;

import java.awt.*;

/**
 * The java learning main run class
 * @author wuguangsheng
 * @version 1.0 16/1/29
 *
 */
public class Option
{
	public static void main(String[]args)
	{
		PersonDescribe kathy;
		kathy=new PersonDescribe();
		kathy.speak("Hello World");

        UtilDate now = new UtilDate() ;
        System.out.println("订单编码：\t" + now.getThree()+now.getOrderNum());
        System.out.println("下单时间：\t" + now.getDateFormatter());
        System.out.println("订单批号：\t" + now.getDate());

        MultiplicationTable ob;
        ob = new MultiplicationTable();
        ob.anyNumber(5);

        PersonDate show =new PersonDate();
        show.Information();

        HelloWorld end = new HelloWorld();
        end.endShow("\n三角形面积计算");
        show.toString();

        TriangleArea key = new TriangleArea();
        key.triangleArea();

	}

}
