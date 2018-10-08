package Ch01ArraysAndStrings;

import java.util.Random;

/**
 * Created by minami_munakata on 2018-10-08.
 */
public class Q1_07_Rotate_Matrix {

    public static char[][] rotate(char[][] matrix) {
        int demens = matrix.length;
        char[][] newMatrix = new char[demens][demens];
        for (int col = 0, newRow = col; col < demens; col++, newRow++) {
            for (int row = demens - 1, newCol = 0; 0 <= row; row--, newCol++) {
                newMatrix[newRow][newCol] = matrix[row][col];
            }

        }
        return newMatrix;
    }

    public static void printMatrix(char[][] matrix) {
        String horizen = "";
        for (int col = 0; col < matrix[0].length; col++) {
            horizen += "+---";
        }
        horizen += "+";
        System.out.println(horizen);
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                System.out.printf("| %c ", matrix[row][col]);
            }
            System.out.println("|");
            System.out.println(horizen);
        }
    }

    public static void main(String[] args) {
        int n = 4;
        char[][] matrix = new MatrixGenerator(n, n).matrix;
        printMatrix(matrix);
        System.out.println();
        matrix = rotate(matrix);
        printMatrix(matrix);

    }
}

class MatrixGenerator {
    int row, col;
    public static char[][] matrix;

    public MatrixGenerator(int row, int col) {
        this.row = row;
        this.col = col;
        this.matrix = new char[row][col];
        for (int nRow = 0; nRow < row; nRow++) {
            for (int nCol = 0; nCol < col; nCol++) {
                matrix[nRow][nCol] = randomChar();
            }
        }
    }

    public static char randomChar() {
        int min = (int)'a';
        int max = (int)'z' - min;
        Random random = new Random();
        return (char)(random.nextInt(max + 1) + min);
    }
}
