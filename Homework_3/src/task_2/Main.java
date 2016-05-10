package task_2;

import java.util.Locale;
import java.util.Objects;
import java.util.ResourceBundle;
import java.util.Scanner;

/**
 * Created by Евгений on 01.05.2016.
 */
public class Main {
    private static String lang;

    public static void main(String[] args) {
        while(!selectLanguage()) {
            selectLanguage();
        }

        Locale locale = new Locale(Objects.equals(lang, "рус") ? "ru" : lang);

       consoleInOut(locale);
    }

    private static boolean selectLanguage() {
        Scanner con = new Scanner(System.in);
        System.out.println("Select language (en/рус): ");
        lang = con.nextLine().toLowerCase();
        return lang.equals("en") || lang.equals("рус");
    }

    private static void consoleInOut(Locale locale) {
        ResourceBundle questions = ResourceBundle.getBundle("task_2.questions", locale);

        for(int i = 1; i <= 2; i++) {
            System.out.println(questions.getString(String.valueOf(i)));
        }

        Scanner questionNumber = new Scanner(System.in);
        System.out.println(questions.getString("chooseQuestion"));


        ResourceBundle answers = ResourceBundle.getBundle("task_2.answers", locale);
        System.out.println(answers.getString(String.valueOf(questionNumber.nextInt())));
    }
}
