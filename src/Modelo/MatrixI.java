package Modelo;

public class MatrixI {

    int[][] matrix;

    public MatrixI(int n) {
        matrix = new int[n][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i == j) {
                    matrix[i][j] = 1;
                }

            }
        }
    }

    public void see() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + "|");
            }
            System.out.println("");
        }

    }

    public int[][] getMatrix() {
        return matrix;
    }

}
