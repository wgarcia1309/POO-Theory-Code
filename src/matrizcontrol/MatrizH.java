package matrizcontrol;

public class MatrizH {

    private int filas, columnas, q, k, d, ncom, contadorCampo = 0, qSubfila;
    private String[] campo, vecEscalares, vecColumnas;
    private String[][] matrixI;
    int hector = 0;

    /**
     *
     * @param n
     * @param k
     * @param q pues q
     */
    public MatrizH(int n, int k, int q, int d) {
        this.filas = n - k;
        this.k = k;
        this.d = d;
        this.columnas = n;
        this.ncom = filas;
        this.q = q;
        this.qSubfila = (int) Math.pow(q, filas);
        this.campo = new String[qSubfila];
        this.vecEscalares = new String[(int) Math.pow(q, d - 1)];
        this.vecColumnas = new String[(int) Math.pow(d - 1,columnas)];
        MatrixI matrixI = new MatrixI(n - k);
        this.matrixI = matrixI.getMatrix();
        crearCampo();
        System.out.println("Escalares:______________");
        combinadorDeEscalares(filas, q, 1, 0, "", "");
        System.out.println("Columnas:______________");
        combinarColumnas(d - 1, n, 1, 0, "", "");
        System.out.println("Matrices de control:________________");
        crearMatrizControl(filas, qSubfila - 1, 1, 1, "", "", vecEscalares, vecColumnas);
    }

    private void crearCampo() {
        for (int i = 0; i < qSubfila; i++) {
            String temp = Integer.toString(i, q);
            int tam = temp.length();
            if (tam < ncom) {
                for (int j = 0; j < ncom - tam; j++) {
                    temp = "0" + temp;
                }
            }
            campo[contadorCampo] = temp;
            contadorCampo++;
        }
    }

    public void combinadorDeEscalares(int cantidadDeDatos, int ListaDePosibles, int recorreCanDatos, int i, String act, String aux) {
        if (recorreCanDatos <= cantidadDeDatos) {
            while (i <= ListaDePosibles) {
                aux = act;
                if (recorreCanDatos != cantidadDeDatos) {
                    act = act + i + ",";
                } else {
                    act = act + i;
                }
                if (recorreCanDatos == cantidadDeDatos) {
                    vecEscalares[i] = act;
                    System.out.println(vecEscalares[i]);
                } else {
                    combinadorDeEscalares(cantidadDeDatos, ListaDePosibles, recorreCanDatos + 1, i, act, aux);
                }
                act = aux;
                i++;
            }
            recorreCanDatos++;
        }
    }

    public void crearMatrizControl(int cantidadDeDatos, int ListaDePosibles, int k_1, int i, String act, String aux, String[] vecEscalares, String[] vecColumnas) {
        if (k_1 <= cantidadDeDatos && hector == 0) {
            while (i <= ListaDePosibles && hector == 0) {
                aux = act;
                if (k_1 != cantidadDeDatos && hector == 0) {
                    act = act + i + ",";
                } else {
                    act = act + i;
                }
                if (k_1 == cantidadDeDatos && hector == 0) {
                    String[] Pos = act.split(",");
                    System.out.println(act);
                    Validador h = new Validador(campo, Pos, d, columnas, this.k, q, matrixI, vecEscalares, vecColumnas);
                    Pos = null;
                } else {
                    crearMatrizControl(cantidadDeDatos, ListaDePosibles, k_1 + 1, i + 1, act, aux, vecEscalares, vecColumnas);
                }
                act = aux;
                i++;
            }
            k_1++;
        }
    }

    public void combinarColumnas(int cantidadDeDatos, int ListaDePosibles, int k_1, int i, String act, String aux) {
        if (k_1 <= cantidadDeDatos) {
            while (i <= ListaDePosibles) {
                aux = act;
                if (k_1 != cantidadDeDatos) {
                    act = act + i + ",";
                } else {
                    act = act + i;
                }
                if (k_1 == cantidadDeDatos) {
                    vecColumnas[i] = act;
                    System.out.println(vecColumnas[i]);
                } else {
                    combinarColumnas(cantidadDeDatos, ListaDePosibles, k_1 + 1, i + 1, act, aux);
                }
                act = aux;
                i++;
            }
            k_1++;
        }
    }

    public int getqSubfila() {
        return qSubfila;
    }

    public void mostrarCampo() {
        for (int i = 0; i < contadorCampo; i++) {
            System.out.println(campo[i]);
        }
    }

}
