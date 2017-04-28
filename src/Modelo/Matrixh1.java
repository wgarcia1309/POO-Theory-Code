package Modelo;

public class Matrixh1 {

    int[][] matrix;
    int[][] Mi;
    int[] Vacum;
    int d, k;
    MatrixI i;
    int h = 0;

    /**
     *
     * @param d
     * @param k
     * @param comb vector de combinaciones
     * @param Mi matrix identidad
     */
    public Matrixh1(int d, int k) {
        this.d = d;
        this.k=k;
        matrix = new int[d][k];
        i = new MatrixI(d);
        Mi = i.getMatrix();
    }

    public void see() {
        for (int i = 0; i < d; i++) {
            for (int j = 0; j < k; j++) {
                System.out.print(matrix[i][j] + "|");
            }
            System.out.println("");
        }
    }

    public void suma(String[] pos) {
        Vacum = new int[d];
        for (int i = 0; i < pos.length; i++) {

            for (int j = 0; j < d; j++) {
                int h = Integer.parseInt(pos[i]) - 1;
                System.out.println("h=" + h);
                System.out.println(Mi[j][h]);
                Vacum[j] = Vacum[j] + Mi[j][h];
                System.out.println(Vacum[j]);
            }
        }
        add(Vacum);
    }

    private void add(int[] V) {

        for (int j = 0; j < d; j++) {
            matrix[j][h] = Vacum[j];
        }
        Vacum = null;
        h++;
    }

    public MatrixI getI() {
        return i;
    }


    
}
