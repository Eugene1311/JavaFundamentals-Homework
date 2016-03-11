package task_4;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
/**
 * Created by Евгений on 09.03.2016.
 */
public class TestMaxSum {
    @Test
    public void testMaxSum() {
        MaxSum.setValues(new double[]{1, 0.5, 3.5, 4.1});
        assertEquals(MaxSum.findMax(), 7.6, 0.01);
    }
}
