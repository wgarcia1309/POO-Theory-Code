/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

public class prueba {

    Matrixh1 ma;
    int h=0;

    public prueba(int k, int d) {
        ma = new Matrixh1(d, k);
        recur(k - 1, d, 1, 1, "", "");
    }

    public void recur(int k, int d, int k_1, int i, String act, String aux) {
        if (k_1 <= k && h!=k+1) {
            while (i <= d && h!=k+1) {
                aux = act;
                if (k_1 != k) {
                    act = act + i + ",";
                } else {
                    act = act + i;
                }
                if (k_1 == k) {
                    String[] Pos = act.split(",");
                    ma.suma(Pos);
                    h++;
                } else {
                    recur(k, d, k_1 + 1, i + 1, act, aux);
                }
                act = aux;
                i++;
            }
            k_1++;
        }
    }

    public Matrixh1 getMa() {
        return ma;
    }
    
}
