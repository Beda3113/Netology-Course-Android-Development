import java.util.Random;

public class MatrixRotation {

    public static final int SIZE = 8;

    public static void main(String[] args) {
        int[][] colors = new int[SIZE][SIZE];
        Random random = new Random();


        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                colors[i][j] = random.nextInt(256);
            }
        }


        System.out.println("Исходная матрица:");
        printMatrix(colors);


        int[][] rotatedColors = new int[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {

                rotatedColors[j][SIZE - 1 - i] = colors[i][j];
            }
        }


        System.out.println("\nМатрица после поворота на 90° по часовой стрелке:");
        printMatrix(rotatedColors);
    }


    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.format("%4d", matrix[i][j]);
            }
            System.out.println();
        }
    }
}
