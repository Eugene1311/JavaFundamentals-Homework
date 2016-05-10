package task_1;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by Евгений on 03.04.2016.
 */
public class Reader {
    public static void main(String[] args) throws IOException {
        FileInputStream file = new FileInputStream("Homework_4/src/task_1/Source.java");
        System.out.println("Размер файла: " + file.available() + " байт(а)");

        byte[] buffer = new byte[file.available()];

        file.read(buffer, 0, file.available());

        System.out.println("Содержимое файла:");
        for(int i = 0; i < buffer.length; i++){
            System.out.print(buffer[i] + " ");
        }
    }
}