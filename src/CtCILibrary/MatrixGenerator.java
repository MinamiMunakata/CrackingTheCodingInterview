package CtCILibrary;

import java.util.Random;

/**
 * Created by minami_munakata on 2018-10-08.
 */
public class MatrixGenerator {

    public static int[][] intMatrix(int row, int col) {
        int[][] matrix = new int[row][col];
        for (int nRow = 0; nRow < row; nRow++) {
            for (int nCol = 0; nCol < col; nCol++) {
                matrix[nRow][nCol] = randomNum();
            }
        }
        return matrix;
    }

    public static int randomNum() {
        Random random = new Random();
        return random.nextInt(10);
    }

    public static void printMatrix(int[][] matrix) {
        String horizen = "";
        for (int col = 0; col < matrix[0].length; col++) {
            horizen += "+---";
        }
        horizen += "+";
        System.out.println(horizen);
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                System.out.printf("| %d ", matrix[row][col]);
            }
            System.out.println("|");
            System.out.println(horizen);
        }
    }
}
