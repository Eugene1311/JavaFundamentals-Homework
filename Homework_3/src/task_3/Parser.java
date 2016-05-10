package task_3;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Евгений on 21.03.2016.
 */
public class Parser {
    public static void main(String[] args) throws IOException {
//        String fileName = "C:\\Users\\Eugene\\IdeaProjects\\JavaFundamentals-Homework\\JavaFundamentals-Homework\\Homework_3\\src\\task_3\\test.txt";
//        Path path = Paths.get(fileName);
//        Scanner scanner = new Scanner(path);
//        System.out.print("Строка: ");
//        while(scanner.hasNext()){
//            System.out.print( scanner.next() + " ");
//        }
//        scanner.close();
        Scanner con = new Scanner(System.in);
        int i = 0;
        while (con.hasNextInt()) {
            i = con.nextInt();
        }
        System.out.println(i);
    }

}
