package task_2;

import org.junit.Test;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by Евгений on 01.05.2016.
 */
public class Tests {
    @Test
    public void testResourceBundle() {
        ResourceBundle questions = ResourceBundle.getBundle("task_2.questions", new Locale("en"));
        System.out.println(questions.getString("1"));
    }

    @Test
    public void testIntToString() {
        int intVar = 100;
        long longVar = 1_000_000_000_000L;
//        intVar = (int) (intVar + longVar);
        intVar += longVar;
        System.out.println(intVar);
        int x1 = 123456789;
        int x2 = 99999999;
        float f1 = x1;
        System.out.println("f1 - "+f1);
        System.out.println("f2 - "+ (float) x2);
    }

    @Test
    public void testLoseAccuracy() {
        float f1 = 1.2345f;
        double d1 = f1;
        double d2 = 1.2345;

        System.out.println("d1 = " + d1);
        System.out.println("--------------------");
        System.out.printf("d2 = %.16f\n", d2);
        System.out.println("f1 - " + f1);
        System.out.printf("f1 = %.16f\n", f1);

        long a = 10_000_000_000L;
        int x;
        x = (int) a;
        System.out.println("x - " + x);
    }

    @Test
    public void testCastingToInt() {
        int a = Integer.MAX_VALUE;
        a += 3_000_000_000L;
        System.out.println(a);
    }
}
