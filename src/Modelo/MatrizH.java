package Modelo;

public class MatrizH {

    private int filas, columnas, n, q, k, d, ncom, contadorCampo = 0, contadorEscalares, contadorColumnas, qSubfila;
    private String[] campo, vecEscalares, vecColumnas;
    private String[][] matrixI, controlH, matrixG;
    private int hector = 0;

    public String MatrizL() {
        return matrixG[0][0];
    }

    public int getK() {
        return k;
    }

    public String[][] getMatrixG() {
        return matrixG;
    }

    /**
     * n-8,k-3,q-2,d-5
     *
     * @param n
     * @param k
     * @param q pues q
     */
    public MatrizH(int n, int k, int q, int d) {
        this.n = n;
        this.filas = n - k;
        this.k = k;
        this.d = d;
        this.columnas = n;
        this.ncom = filas;
        this.q = q;
        this.qSubfila = (int) Math.pow(q, filas);
        this.campo = new String[qSubfila];
        this.vecEscalares = new String[(int) Math.pow(q, d - 1)];
        this.vecColumnas = new String[(int) Math.pow(d - 1, columnas)];
        MatrixI matrixI = new MatrixI(n - k);
        this.matrixI = matrixI.getMatrix();
        this.controlH = new String[n - k][n];
        this.matrixG = new String[k][n];
        crearCampo();
        System.out.println("Escalares:______________");
        combinarEscalares((int) Math.pow(q, d - 1));
        System.out.println("Columnas:______________");
        combinarColumnas(d - 1, columnas - 1, 1, 0, "", "");
        System.out.println("Matrices de control:________________");
        crearMatrizControl(filas, qSubfila - 1, 1, 1, "", "", vecEscalares, vecColumnas);
    }

    public int getFilas() {
        return filas;
    }

    public int getN() {
        return n;
    }

    public String[][] getControlH() {
        return controlH;
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

    private void combinarEscalares(int limite) {
        for (int i = 0; i < limite; i++) {
            String temp = Integer.toString(i, q);
            int tam = temp.length();
            if (tam < d - 1) {
                for (int j = 0; j < (d - 1) - tam; j++) {
                    temp = "0" + temp;
                }
            }
            vecEscalares[contadorEscalares] = temp;

            System.out.println(vecEscalares[contadorEscalares]);
            contadorEscalares++;
        }
    }

    public void combinarColumnas(int cantidadDeDatos, int ListaDePosibles, int recorreCanDatos, int i, String act, String aux) {
        if (recorreCanDatos <= cantidadDeDatos) {
            while (i <= ListaDePosibles) {
                aux = act;
                if (recorreCanDatos != cantidadDeDatos) {
                    act = act + i + ",";
                } else {
                    act = act + i;
                }
                if (recorreCanDatos == cantidadDeDatos && contadorColumnas < vecColumnas.length) {
                    vecColumnas[contadorColumnas] = act;
                    System.out.println(vecColumnas[contadorColumnas]);
                    contadorColumnas++;
                } else {
                    combinarColumnas(cantidadDeDatos, ListaDePosibles, recorreCanDatos + 1, i + 1, act, aux);
                }
                act = aux;
                i++;
            }
            recorreCanDatos++;
        }
    }

    public void combinarEscalares(int cantidadDeDatos, int ListaDePosibles, int recorreCanDatos, int i, String act, String aux) {
        if (recorreCanDatos <= cantidadDeDatos) {
            while (i <= ListaDePosibles) {
                aux = act;
                if (recorreCanDatos != cantidadDeDatos) {
                    act = act + i + ",";
                } else {
                    act = act + i;
                }
                if (recorreCanDatos == cantidadDeDatos) {
                    vecEscalares[contadorEscalares] = act;
                    System.out.println(vecEscalares[contadorEscalares]);
                    contadorEscalares++;
                } else {
                    combinarEscalares(cantidadDeDatos, ListaDePosibles, recorreCanDatos + 1, i, act, aux);
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
                    System.out.println("combinacion= " + act);
                    //Validador h = new Validador(campo, Pos, d, columnas, this.k, q, matrixI, vecEscalares, vecColumnas);
                    llenarMatrizDeControl(d, n, k, Pos, campo, vecEscalares, vecColumnas);
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

    public void llenarMatrizDeControl(int d, int n, int k, String[] comb, String[] campo, String[] vecEscalares, String[] vecColumnas) {
        String[] Pos = null;
        int h = 0;
        for (int i = 0; i < n; i++) {
            if (i < n - k) {
                Pos = campo[Integer.parseInt(comb[i])].split("");
            }
            for (int j = 0; j < n - k; j++) {
                if (i < k) {
                    controlH[j][i] = Pos[j];
                } else {
                    controlH[j][i] = matrixI[h][j];
                }
            }
            if (i >= k) {
                h++;
            }
        }
        verControl();
        //System.out.println("AQUI PUEDO REALIZAR EL PROCESO");
        double limite;
        if (d - 1 == 1) {
            limite = 1;
        } else {
            limite = (int) (factorial(n) / (factorial(d - 1) * factorial((n) - (d - 1))));
        }
        boolean observador = true;
        int l = 0;
        while (observador == true && l < limite) {//si observador es falso no cumple que el subconjunto que analizo fue LI
            String columnas = vecColumnas[l];
            observador = comprobarLI(controlH, vecEscalares, columnas, n - k, d, q);
            l++;
        }
        if (observador == true) {//si paso la prueba asi que buscamos la segunda condicion armar la matriz G_traspuesta
            verControl();
            System.out.println("__________________________________________PASO LA PRUEBA");
            hector = 1;
            //Aqui debo crear la funcion que arme la Matriz G
            MatrixI I2 = new MatrixI(filas);
            String identidad[][] = I2.getMatrix();
            h = 0;
            for (int i = 0; i < n; i++) {
                if (i < k) {
                    Pos = campo[Integer.parseInt(comb[i])].split("");
                }
                for (int j = 0; j < k; j++) {
                    if (i < k) {
                        matrixG[j][i] = identidad[j][i];
                    } else {
                        matrixG[j][i] = (-1 * Integer.parseInt(controlH[h][j]) + q) % q + "";
                    }
                }
                if (i >= k) {
                    h++;
                }
            }
            verG();
        } else {

            //System.out.println("+++No Paso");
        }
    }

    public int factorial(int numero) {
        if (numero == 0) {
            return 1;
        } else {
            return numero * factorial(numero - 1);
        }
    }

    /*Varios vectores libres del plano se dice que son linealmente dependientes 
    si hay una combinación lineal de ellos que es igual al vector cero, sin que 
    sean cero todos los coeficientes de la combinación lineal.*/
    /**
     * esta funcion recibe la matrizd de control y la combinacion de sus
     * columnas que debe verificar y tambien importar la lista de escalares
     *
     * @param control
     * @param vecEscalares
     * @param columnas
     * @param filas mandamos n-k
     * @param d
     * @param q
     * @return
     */
    public boolean comprobarLI(String[][] control, String[] vecEscalares, String columnas, int filas, int d, int q) {
        int contador = 0, resultado = 0;
        int h = 1;
        String[] posColumnas = columnas.split(",");
        while (h < vecEscalares.length && contador < filas) {
            //System.out.println("h:" + h);
            //System.out.println("____escalares:" + vecEscalares[h]);
            //System.out.println("----Columnas:" + columnas);
            String[] escalar = vecEscalares[h].split("");
            contador = 0;
            for (int i = 0; i < filas; i++) {
                resultado = 0;
                for (int j = 0; j < d - 1; j++) {
                    resultado = resultado + (Integer.parseInt(escalar[j]) * Integer.parseInt(control[i][Integer.parseInt(posColumnas[j])]) % q);
                    //System.out.print("(alfa" + escalar[j] + "*" + control[i][Integer.parseInt(posColumnas[j])] + ") mod " + q);
                    if (j < d - 2) {
                        //System.out.print(" + ");
                    }
                }
                resultado %= q;
                //System.out.println(" = " + resultado);
                if (resultado == 0) {// el resutlado de las tres columnas es cero es el vector nulo
                    contador++;
                }
            }
            h++;
        }
        if (contador == filas) {
            return false;// no paso la prueba
        } else {
            return true;// si son LI
        }
    }

    public void verControl() {
        for (int i = 0; i < n - k; i++) {//limite filas que es n-k
            for (int j = 0; j < n; j++) {//limite de las columnas es n
                System.out.print(controlH[i][j] + "|");
            }
            System.out.println("");
        }

    }

    public void verG() {
        for (int i = 0; i < k; i++) {//limite filas que es n-k
            for (int j = 0; j < n; j++) {//limite de las columnas es n
                System.out.print(matrixG[i][j] + "|");
            }
            System.out.println("");
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
