package task_2;

import java.util.Map;

/**
 * Created by Евгений on 19.03.2016.
 */
public class Account {
    private Map list;

    public void addEmployee(String str, int age, char gender) {
         list.put(new Employee(str, age, gender), 1);
    }
}
