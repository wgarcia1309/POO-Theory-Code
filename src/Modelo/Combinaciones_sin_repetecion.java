/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Estudiante
 */
public class Combinaciones_sin_repetecion {

    static int z = 0;
    static String[] com = new String[100];

    public static void basic(int k, int x) {
        String[] com = new String[x];
        int i = 0;
        while (i < x) {
            com[i] = String.valueOf(i + 1);
            i++;
        }
        Perm2(com, "", k, x);
    }

    private static void Perm2(String[] elem, String act, int n, int r) {
        if (n == 0) {
            vector(act, n);
        } else {
            for (int i = 0; i < r; i++) {
                if (!act.contains(elem[i])) {
                    Perm2(elem, act + elem[i], n - 1, r);
                }
            }
        }
    }

    private static void vector(String h, int n) {
        int y = 0;
        for (int i = 0; i < z; i++) {
            if (com[i] == h) {
                y = 1;
            }
        }
        if (y == 0) {
            com[z] = h;
            z++;
        }
    }

    public static void mostrar() {
        for (int i = 0; i < z; i++) {
            System.out.println(com[i]);
        }
    }

}
