/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codetheory.Models;

/**
 *
 * @author hectordaniel
 */
public class Metodos {

    /**
     *
     * @param k
     * @param d se debe mandar d-1
     */
    public static void MatrixH(int k, int d, MatrixI M, int q) {
        Vector temp;
        MatrixI aux;
        int cont = 1, contd;
        while (cont < k) {
            contd = 0;
            while (contd < d - 1) {

                contd++;
            }
        }
    }

    public Vector llenar(int d) {
        Vector aux = new Vector();
        for (int i = 1; i <= d; i++) {
            aux.add(i);
        }
        return aux;
    }

    /**
     *
     * @param k
     * @param d es d-1
     * @param q
     * @param cont comienza en 0
     * @param i inicia en 2
     * @param aux inicia en la primera pocisicion
     * @param con vector con las combinaciones
     * @param I matrix identidad
     * @param H matrix generada
     */
    public void recursivo(int k, int d, int q, int cont, int i, Vector aux, Vector con, MatrixI I, MatrixI H) {
        if (cont < d - 1) {
            aux = suma(aux, I.getPos(i), q);
            if (i==con.length()) {
                
            }
        }
    }

    public static Vector adiccion(Vector v,int d){
        if (v.getPos(v.length())== d) {
            
        }else{
        v.add(v.getPos(v.length())+1);
        }
        return v;
    }
    
    private static Vector suma(Vector v_1, Vector v_2, int q) {
        int x = 0;
        Vector ret = null;
        for (int i = 0; i < v_1.length(); i++) {
            x = (v_1.getX() + v_2.getX()) % q;
            ret.add(x);
            v_1 = v_1.getLink();
            v_2 = v_2.getLink();
        }
        return ret;
    }
}
