package task_2;

/**
 * Created by Евгений on 05.03.2016.
 */
public class FindMinValue {
    private static double valToCompare;
    private static double[] arr;

    public static String setValues(int arrLength, double val) {
        if (arrLength <= 0) return "";
        arr = new double[arrLength];
        valToCompare = val;
        String result = initArrayAndFindMinValue(arr, valToCompare);
        return result;
    }

    private static String initArrayAndFindMinValue(double[] arr, double valToCompare) {
        double minVal = 0;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1 / Math.pow((2 + i), 2);
            if (arr[i] < valToCompare) {
                minVal = arr[i];
                index = i;
            }
        }
        if (minVal != 0 && index != 0) {
            return "Наименьший элемент - a " + index + " : " + minVal;
        } else {
            return "Все элементы последовательности больше заданного числа";
        }
    }

    public static void printArray() {
        System.out.println("Элементы последовательности :");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("a " + (i + 1) + " : " + arr[i]);
        }
    }
}
