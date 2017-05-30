package Modelo;

public class Validador {

    String[] campo;
    String[] comb;
    String[][] control;
    int n, k, q, d;

    /**
     *
     * @param campo
     * @param comb las combinaciones de el indice del vector campo
     * @param n
     * @param k
     * @param q
     * @param matrixI
     */
    public Validador(String[] campo, String[] comb, int d, int n, int k, int q, String[][] matrixI, String[] vecEscalares, String[] vecColumnas) {
        this.n = n;
        this.k = k;
        this.q = q;
        this.d = d;
        this.campo = campo;
        this.comb = comb;
        this.control = new String[n - k][n];
        llenarMatrizDeControl(d, n, k, comb, campo, matrixI, vecEscalares, vecColumnas);
    }

    public void llenarMatrizDeControl(int d, int n, int k, String[] comb, String[] campo, String[][] identidad, String[] vecEscalares, String[] vecColumnas) {
        String[] Pos = null;
        int h = 0;
        for (int i = 0; i < n; i++) {
            if (i < k) {
                Pos = campo[Integer.parseInt(comb[i])].split("");
            }
            for (int j = 0; j < n - k; j++) {
                if (i < k) {
                    control[j][i] = Pos[j];
                } else {
                    control[j][i] = identidad[h][j];
                }
            }
            if (i >= k) {
                h++;
            }
        }
        see();
        System.out.println("AQUI PUEDO REALIZAR EL PROCESO");
        double limite = (int)(factorial(n)/(factorial(d-1)*factorial((n)-(d-1))));
        boolean observador = true;
        int l = 0;
        while (observador == true && l < limite) {//si observador es falso no cumple que el subconjunto que analizo fue LI
            String columnas = vecColumnas[l];
            observador = comprobarLI(control, vecEscalares, columnas, n - k, d, q);
            l++;
        }
        if (observador == true) {//si paso la prueba asi que buscamos la segunda condicion un subconjunto de D columnas LD.
            System.out.println("__________________________________________PASO LA PRUEBA");
            //Aqui debo crear la funcion que verifique la segunda condicion
        } else {
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++No Paso");
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
            System.out.println("h:" + h);
            System.out.println("____escalares:" + vecEscalares[h]);
            System.out.println("----Columnas:" + columnas);
            String[] escalar = vecEscalares[h].split("");
            contador = 0;
            for (int i = 0; i < filas; i++) {
                resultado = 0;
                for (int j = 0; j < d - 1; j++) {
                    resultado = resultado + (Integer.parseInt(escalar[j]) * Integer.parseInt(control[i][Integer.parseInt(posColumnas[j])]) % q);
                    System.out.print("(alfa" + escalar[j] + "*" + control[i][Integer.parseInt(posColumnas[j])] + ") mod " + q);
                    if (j < d - 2) {
                        System.out.print(" + ");
                    }
                }
                System.out.println(" = " + resultado);
                if (resultado == 0) {// el resutlado de las tres columnas es cero es el vector nulo
                    contador++;
                }
            }
            h++;
        }
        if (contador == filas) {
            System.out.println("Pelo el bollo");
            return false;// no paso la prueba
        } else {
            return true;// si son LI
        }
    }

    public void see() {
        for (int i = 0; i < n - k; i++) {//limite filas que es n-k
            for (int j = 0; j < n; j++) {//limite de las columnas es n
                System.out.print(control[i][j] + "|");
            }
            System.out.println("");
        }

    }
}
