package Modelo;

       
    /**
     * Clase que facilita el uso de la matriz Identidad
     */

public class MatrixI {

    private String[][] matrix;
    private int tamaño;
    
       
    /**
     * Crea una matriz identidad de tamaño n.
     * 
     * @param tamaño tamaño de la matriz.
     */
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

     /**
     *Ordena mostrar la matriz
     * 
     */
    public void see() {
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                System.out.print(matrix[i][j] + "|");
            }
            System.out.println("");
        }

    }
     /**
     *Getter de matrix
     *@return this matrix
     */
    public String[][] getMatrix() {
        return matrix;
    }

}
