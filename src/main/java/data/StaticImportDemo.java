package data;

import static java.lang.Math.*;

/**
 * The program
 *
 * @author wuguangsheng
 * @version V1.0 on 16/5/8
 */
public class StaticImportDemo {
    private double r;
    public StaticImportDemo(double r){
        this.r = r;
    }
    public static double staticImportDemo(double r){
        StaticImportDemo demo = new StaticImportDemo(r);
        double d;
        d = Math.cos(PI * demo.r);
        return d;
    }
}
