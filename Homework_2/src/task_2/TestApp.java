package task_2;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Евгений on 19.03.2016.
 */
public class TestApp {
    @Test
    public void TestEmployees() {
        Employee first = new Employee("Иван Иванов", 27, 'м');
        assertEquals("Иван", first.getFirstName());
    }
}
