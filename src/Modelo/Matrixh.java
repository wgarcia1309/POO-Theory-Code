package Modelo;

public class Matrixh {

    int[][] matrix;
    int[] Vacum;
    int d, k;

    /**
     *
     * @param d
     * @param k
     * @param comb vector de combinaciones
     * @param Mi matrix identidad
     */
    public Matrixh(int d, int k, String[] comb, int[][] Mi) {
        matrix = new int[d][k];
        int z = 0;
        for (int i = 0; i < k; i++) {
            String[] Pos = comb[z].split(",");
            suma(Pos, Mi, d);
            for (int j = 0; j < d; j++) {
                matrix[j][i] = Vacum[j];
            }
            Pos = null;
            Vacum = null;
            z++;
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

    private void suma(String[] pos, int[][] Mi, int d) {
        Vacum = new int[d];
        for (int i = 0; i < pos.length; i++) {

            for (int j = 0; j < d; j++) {
            int h=Integer.parseInt(pos[i]);
                System.out.println("h="+h);
                System.out.println(Mi[j][h]);
                Vacum[j] = Vacum[j] + Mi[j][h];
            }
        }
    }
}
