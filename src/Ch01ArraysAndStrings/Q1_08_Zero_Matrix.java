package Ch01ArraysAndStrings;

import CtCILibrary.MatrixGenerator;


/**
 * Created by minami_munakata on 2018-10-08.
 */
public class Q1_08_Zero_Matrix {

    public static void setZeros(int[][] matrix) {
        int[][] copy = copyMatrix(matrix);
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                if (zeroCoordinate(copy)[row][col]) {
                    nullRow(matrix, row);
                    nullCol(matrix, col);
                }
            }
        }
    }

    public static int[][] copyMatrix(int[][] matrix) {
        int[][] copy = new int[matrix.length][matrix[0].length];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                copy[row][col] = matrix[row][col];
            }
        }
        return copy;
    }

    public static void nullRow(int[][] matrix, int row) {
        for (int col = 0; col < matrix[0].length; col++) {
            matrix[row][col] = 0;
        }
    }

    public static void nullCol(int[][] matrix, int col) {
        for (int row = 0; row < matrix.length; row++) {
            matrix[row][col] = 0;
        }
    }

    public static boolean[][] zeroCoordinate(int[][] matrix) {
        boolean[][] zeroCoordinate = new boolean[matrix.length][matrix[0].length];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                zeroCoordinate[row][col] = matrix[row][col] == 0;
            }
        }
        return zeroCoordinate;
    }

    public static void main(String[] args) {
        int row = 3;
        int col = 5;
        int[][] matrix = MatrixGenerator.intMatrix(row, col);
        MatrixGenerator.printMatrix(matrix);
        setZeros(matrix);
        MatrixGenerator.printMatrix(matrix);
    }
}

