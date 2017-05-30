package Modelo;

public class MatrixI {

    private String[][] matrix;
    private int tamaño;

    public MatrixI(int tamaño) {
        this.tamaño = tamaño;
        matrix = new String[tamaño][tamaño];
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                if (i == j) {
                    matrix[i][j] = "1";
                } else {
                    matrix[i][j] = "0";
                }
            }
        }
    }

    public void see() {
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                System.out.print(matrix[i][j] + "|");
            }
            System.out.println("");
        }

    }

    public String[][] getMatrix() {
        return matrix;
    }

}
