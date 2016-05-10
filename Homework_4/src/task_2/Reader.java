package task_2;

import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;

/**
 * Created by Евгений on 04.04.2016.
 */
public class Reader {
    public static void main(String[] args) throws IOException {
        FileReader file = new FileReader("C:\\Users\\Eugene\\IdeaProjects\\JavaFundamentals-Homework\\JavaFundamentals-Homework\\Homework_4\\src\\task_2\\Source.java");
        System.out.println("Содержимое файла:");
        String str = "";
        int i;
        while ((i = file.read()) != -1) {
            str += (char) i;
        }
        file.close();

        String pattern = "\\s+";
        Pattern p = Pattern.compile(pattern);
        String[] words = p.split(str);
        str = "";
        for(String word : words) {
            str += word;
        }
        System.out.println(str);

        String currentWord;
        for(Keywords keyword : Keywords.values()) {
            currentWord = keyword.toString().toLowerCase();
            if(str.contains(currentWord)) {
                System.out.println(currentWord);
            }
//            System.out.println(keyword.toString().toLowerCase());
        }
    }
}
