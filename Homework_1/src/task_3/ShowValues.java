package task_3;

import java.lang.Math;
/**
 * Created by Евгений on 09.03.2016.
 */
public class ShowValues {
    private static double interval;
    private static double startVal;
    private static double endVal;
    private static double getValue(double val) {
        double result =  Math.tan(2 * val) - 3;
        return result;
    }
    public static void printResult() {
        System.out.println("+--------------------+");
        System.out.println("|   x   |    f(x)    |");
        System.out.println("+--------------------+");
        for (double i = startVal; i <= endVal; i += interval) {
            System.out.printf("| %5.2f | %+010f |\n", i, getValue(i));
        }
        System.out.println("+--------------------+");
    }
    public static void setValues(double startValue, double endValue, double interv) {
        startVal = startValue;
        endVal = endValue;
        interval = interv;
        printResult();
    }
}