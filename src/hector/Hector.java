/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hector;

import static Modelo.Combinaciones_sin_repetecion.basic;
import static Modelo.Combinaciones_sin_repetecion.mostrar;

public class Hector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        MatrixI a = new MatrixI(5);
//        Matrixh h = new Matrixh(4, 3,1,a.getMatrix());
        basic(3,100);  
        mostrar();
    }

}
