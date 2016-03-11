package task_2;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by Евгений on 05.03.2016.
 */
public class TestFindMinValue {
    @Test
    public void testFindMin() throws Exception {
        String noValue = FindMinValue.setValues(6, 0.01);
        assertEquals(noValue, "Все элементы последовательности больше заданного числа");

        String value = FindMinValue.setValues(7, 0.2);
        assertEquals(value, "Наименьший элемент - a 6 : 0.015625");

        FindMinValue.printArray();
    }
}
