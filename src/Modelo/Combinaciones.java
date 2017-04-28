package Modelo;

public class Combinaciones {

    static int z = 0;
    static int n_1;
    static String[] com = new String[1000];

    public static String[] getCom() {
        return com;
    }

    /**
     * metodo que crea las combinaciones que en teoria sera las columnas que
     * sumaremos para generar la matriz H
     *
     * @param k el numero de elemntos que contendra la combinacion
     * @param x numero de columnas
     */
    public Combinaciones(int k, int x) {
        String[] com = new String[x];
        int i = 0;
        n_1=k;
        while (i < x) {
            com[i] = String.valueOf(i + 1);
            i++;
        }
        Perm2(com, "", k, x);
    }

    /**
     *
     * @param elem envia el numero
     * @param act guarda los valores y los concatena
     * @param n numero de columnas o elemntos de la combinacion
     * @param r
     */
    private static void Perm2(String[] elem, String act, int n, int r) {
        if (n == 0) {
            vector(act, n_1);
        } else {
            for (int i = 0; i < r; i++) {
                if (!act.contains(elem[i])) {
                    if (n == 1) {
                        Perm2(elem, act + elem[i], n - 1, r);
                    } else {
                        Perm2(elem, act + elem[i] + ",", n - 1, r);
                    }
                }
            }
        }
    }

    /**
     *
     * @param h es el string que viene con la conbinacion
     * @param n numero de elementos que trae la combinacion
     */
    private static void vector(String h, int n) {
        if (z == 0) {
            com[z] = h;
            z++;
        } else {
            int validador = 0;
            boolean sw = false;
            String[] comAcual = separar(h);
            int i = 0;
            while (i < z && sw == false) {
                validador = 0;
                String[] anteriorCom = separar(com[i]);
                for (int j = 0; j < n_1; j++) {
                    for (int k = 0; k < n_1; k++) {
                        if (comAcual[j].equals(anteriorCom[k])) {
                            validador++;
                        }
                    }
                }
                if (validador == n) {
                    sw = true;
                }
                i++;
            }
            if (sw == false) {
                com[z] = h;
                z++;
            } else {
            }
        }
    }

    private static String[] separar(String h) {
        String[] vector = h.split(",");
        return vector;
    }

    public static void mostrarMatrizI() {
        for (int i = 0; i < z; i++) {
            System.out.println(com[i]);
        }
    }

}
