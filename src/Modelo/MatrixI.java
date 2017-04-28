package Modelo;

public class MatrixI {

    int[][] matrix;
int d;
    public MatrixI(int d) {
        this.d=d;
        matrix = new int[d][d];
        for (int i = 0; i < d; i++) {
            for (int j = 0; j < d; j++) {
                if (i == j) {
                    matrix[i][j] = 1;
                }
            }
        }
    }

    public void see() {
        for (int i = 0; i < d; i++) {
            for (int j = 0; j < d; j++) {
                System.out.print(matrix[i][j] + "|");
            }
            System.out.println("");
        }

    }

    public int[][] getMatrix() {
        return matrix;
    }

}
