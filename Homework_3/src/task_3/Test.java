package task_3;

import java.io.*;

/**
 * Created by Евгений on 24.03.2016.
 */
public class Test {
    public static void main(String[] args) {
        try {
            String path = "Homework_3/src/task_3/";
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(path + "task-attachment.html"), "Cp1251"));
            String fileContent = "";
            String s;
            while ((s = br.readLine()) != null) {
                fileContent += s;
            }
            br.close();
            String[] a = fileContent.split("<body>");
            fileContent = a[1];
            String[] b = fileContent.split("рис");
            System.out.print(b.length);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
