/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hector;

import Modelo.*;
import java.util.Scanner;

public class Hector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite distancia minima d:");
        int d = sc.nextInt();
        System.out.println("Digite K:");
        int k = sc.nextInt();

        Combinaciones o = new Combinaciones(k-1, d);
        o.mostrarMatrizI();
        MatrixI i = new MatrixI(d);
        i.see();
        Matrixh h = new Matrixh(d, k, o.getCom(), i.getMatrix());
        h.see();
    }
}