package task_5;

/**
 * Created by Евгений on 06.03.2016.
 */
public class Matrix {
    private static byte[][] matrix;

    public static void setMatrix(int a, int b) {
        matrix = new byte[b][a];
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                if (j == i) {
                    matrix[i][j] = 1;
                    matrix[i][a - j - 1] = 1;
                } else if (matrix[i][j] != 1) {
                    matrix[i][j] = 0;
                }
            }

        }
    }

    public static void setMatrix(int a) {
        setMatrix(a, a);
    }

    public static void showMatrix() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        setMatrix(5);
        showMatrix();
    }
}
