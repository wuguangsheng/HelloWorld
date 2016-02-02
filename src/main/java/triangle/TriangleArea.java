package triangle;

/**
 * Program to input the lengths of the sides of a triangle
 * and output the area and perimeter of the triangle,
 * @author wuguangsheng
 * @version 1.0 16/1/27
 */
public class TriangleArea {
    public static void triangleArea(){
        // Obtain data from the user.
        KeyboardInput in = new KeyboardInput();
        System.out.print("Side1: ");
        double side1 = in.readDouble();
        System.out.println(side1);
        System.out.print("Side2: ");
        double side2 = in.readDouble();
        System.out.println(side2);
        System.out.print("Side3: ");
        double side3 = in.readDouble();
        System.out.println(side3);
        // Now test to see if the input describes an invalid
        // triangle by seeing if the sum of the lengths of
        // any tow sides is less than the length of the third.
        if (    ((side1 + side2) < side3) ||
                ((side1 + side3) < side2) ||
                ((side2 + side3) <side1)
                ) {
            System.out.println("The input does not describe a triangle.");
        } else {
            // Now do the calculations.....
            double perimeter = side1 + side2 + side3 ;
            double semiPerimeter = 0.5 * perimeter ;
            double temp = semiPerimeter *
                    (semiPerimeter - side1) *
                    (semiPerimeter - side2) *
                    (semiPerimeter - side3) ;
            double area = Math.sqrt(temp) ;
            // ...and output the results.
            System.out.println("Perimeter: " + perimeter);
            System.out.println("Area: " + area);
        }

    }
}
