package data;

/**
 * 摄氏、华氏温度对照表
 *
 * @author wuguangsheng
 * @version V1.0 on 16/2/4
 */
public class CelsiusFahrenheitComparisonTable {
    /**
     * The method converting for celsius to fahrenheit
     * @param celsius
     * @return fahrenheit
     */
    private static int celsiusFahrenheitConvert(final int celsius){
        final int fahrenheit = celsius*9/5+32;
        return fahrenheit;
    }

    /**
     * The method display a unit
     * @param row
     * @param column
     */
    private static void displayOneUnit(final int row,final int column){
        if(row == 0){
            System.out.print("C\tF\t");
        } else {
            final int a = (row - 1)*5 + column;
            System.out.print((a) + "\t");
            System.out.print(celsiusFahrenheitConvert(a) + "\t");
        }
    }

    /**
     * The method display table
     */
    public void displayComparisonTable(){
        for (int i = 0; i <= 20; ++i ){
            for (int j = 0; j < 5; ++j ){
                displayOneUnit(i, j);
            }
            System.out.println();
        }
    }
}
