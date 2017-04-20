package Modelo;

public class Matrixh {

    int[][] matrix;
    int[] Vector;
    int d, k;

    /**
     *
     * @param d es la distancia minima
     * @param k es la antidad de vectores
     */
    public Matrixh(int d, int k, int q, int[][] a) {
        matrix = new int[d][k];
        Vector = new int[d];
        this.d = d;
        this.k = k;
        int i = 0, j = 0, j_1 = 1, c = 0;
        while (i < d) {
            while (j < k) {
                while (c < d) {
                    Vector[c] = (a[i][j] + a[i][j_1]) % q;
                    System.out.print(Vector[c]);
                    c++;
                }
                System.out.println("");
                j++;
            }
            i++;
        }
    }

    public void see() {
        for (int i = 0; i < d; i++) {
            for (int j = 0; j < k; j++) {
                System.out.print(matrix[i][j] + "|");
            }
            System.out.println("");
        }
    }
}
