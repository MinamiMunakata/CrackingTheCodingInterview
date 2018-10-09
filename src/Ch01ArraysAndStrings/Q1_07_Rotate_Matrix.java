package Ch01ArraysAndStrings;

import CCILibrary.MatrixGenerator;

/**
 * Created by minami_munakata on 2018-10-08.
 */
public class Q1_07_Rotate_Matrix {

    public static int[][] rotate(int[][] matrix) {
        int demens = matrix.length;
        int[][] newMatrix = new int[demens][demens];
        for (int col = 0, newRow = col; col < demens; col++, newRow++) {
            for (int row = demens - 1, newCol = 0; 0 <= row; row--, newCol++) {
                newMatrix[newRow][newCol] = matrix[row][col];
            }

        }
        return newMatrix;
    }

    public static void main(String[] args) {
        int n = 4;
        int[][] matrix = MatrixGenerator.intMatrix(n, n);
        MatrixGenerator.printMatrix(matrix);
        System.out.println();
        matrix = rotate(matrix);
        MatrixGenerator.printMatrix(matrix);

    }
}
