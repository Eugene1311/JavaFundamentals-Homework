package task_4;

/**
 * Created by Евгений on 09.03.2016.
 */
class MaxSum {
    private static double[] values;
    public static void setValues(double[] arr) {
        values = arr;
    }

    public static double findMax() {
        double maxValue = values[0] + values[1];
        for(int i = 2; i < values.length; i++) {
            if (values[i] + values[i - 1] > maxValue) {
                maxValue = values[i] + values[i - 1];
            }
        }
        System.out.println(maxValue);
        return maxValue;
    }
}