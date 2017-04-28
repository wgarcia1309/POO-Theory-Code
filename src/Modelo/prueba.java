/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

public class prueba {

    public prueba(int k, int x) {
        recur(k, x, 1, 1, "", "");
    }

    public void recur(int k, int d, int k_1, int i, String act, String aux) {
        if (k_1 <= k) {
            while (i <= d) {
                aux = act;
                if (k_1 != k) {
                    act = act + i + ",";
                } else {
                    act = act + i;
                }
                if (k_1 == k) {
                    System.out.println(act);
                } else {
                    recur(k, d, k_1 + 1, i + 1, act, aux);
                }
                act = aux;
                i++;
            }
            k_1++;
        }
    }
}
