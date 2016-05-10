package task_3;

import java.io.*;

/**
 * Created by Евгений on 09.05.2016.
 */
public class Reader {
    public static void main(String[] args) {
        String fileToOpen = "JavaFundamentals-Homework/Homework_4/src/task_3/ru_utf8.txt";
        String fileToWrite = "JavaFundamentals-Homework/Homework_4/src/task_3/ru_utf16.txt";
        File file = new File(fileToOpen);

        try(FileReader inputFile = new FileReader(fileToOpen);
            Writer out = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream(fileToWrite), "UTF16"))
        ) {
            char[] buff = new char[(int)file.length()];
            inputFile.read(buff);
            out.write(buff);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
