package task_2;

/**
 * Created by Евгений on 13.03.2016.
 */
public class Employee {private String firstName;
    private String lastName;
    private int age;
    private char gender;

    public Employee(String str, int age, char gender) {
        String[] fullInfo = str.split(" ");
        this.firstName = fullInfo[0];
        this.lastName = fullInfo[1];
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }

    public String getFirstName() {
        return firstName;
    }
}
