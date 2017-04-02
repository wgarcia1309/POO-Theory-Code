package codetheory.Controls;

import codetheory.Models.Campo;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CodeTheory {

    public static ArrayList<String> vectoresLI = new ArrayList<>();

    public static void main(String[] args) {
        //ncom //q
        Scanner sc = new Scanner(System.in);
        int q = 5;
        Campo x = new Campo(2, q); //new Campo(ncom, q)
        //x.mostrarCon(); //muestra el conjunto
        System.out.println("---");
        x.mostrarVec(); // muetra los vectores generados 
        //System.out.println("Digite K:");
        //  int k = sc.nextInt();
        System.out.println("---");
        //System.out.println(buscarIndependencia(x, 3));
        vectoresLI = buscarIndependencia2(x, 0, q);
        System.out.println("----");
        System.out.println("La Lista de LI:");
        for (int i = 0; i < vectoresLI.size(); i++) {
            System.out.println((i + 1) + ": " + vectoresLI.get(i));
        }
    }

    public static String buscarIndependencia(Campo campo, int k) {
        if (k == campo.ncom && 3 == k) {
            String str = "";
            for (int i = 1; i < campo.vectores.size(); i++) {
                for (int j = i + 1; j < campo.vectores.size(); j++) {
                    for (int l = j + 1; l < campo.vectores.size(); l++) {
                        if ((campo.vectores.get(i).get(0) * campo.vectores.get(j).get(1) * campo.vectores.get(l).get(2)
                                + campo.vectores.get(j).get(0) * campo.vectores.get(l).get(1) * campo.vectores.get(i).get(2)
                                + campo.vectores.get(l).get(0) * campo.vectores.get(i).get(1) * campo.vectores.get(j).get(2))
                                - (campo.vectores.get(i).get(2) * campo.vectores.get(j).get(1) * campo.vectores.get(l).get(0)
                                + campo.vectores.get(j).get(2) * campo.vectores.get(l).get(1) * campo.vectores.get(i).get(0)
                                + campo.vectores.get(l).get(2) * campo.vectores.get(i).get(1) * campo.vectores.get(j).get(0)) == 0) {
                            str += campo.vectores.get(i) + " " + campo.vectores.get(k) + campo.vectores.get(l) + "\n";
                        }
                    }
                }
            }
            return "Vectores LI\n" + str;
        }
        return "no encontro independientes";
    }

    public static ArrayList buscarIndependencia2(Campo campo, int k, int q) {

        ArrayList<String> str = new ArrayList<>();
        boolean sw;
        int com = 1;

        for (int i = 1; i < campo.vectores.size(); i++) {
            for (int j = i + 1; j < campo.vectores.size(); j++) {
                System.out.println("Combinacion no:" + com++);
                //System.out.println("comprobando:"+ campo.vectores.get(i)+" con "+ campo.vectores.get(j));
                sw = escalares(campo.vectores.get(i).get(0), campo.vectores.get(i).get(1), campo.vectores.get(j).get(0), campo.vectores.get(j).get(1), q);
                if (sw == false) {
                    //System.out.println("SON L.I. !!!!!");
                    str.add(campo.vectores.get(i) + " " + campo.vectores.get(j));
                } else {
                    //System.out.println("No lo son...");
                }
            }
        }
        return str;
    }

    public static boolean escalares(int x1, int y1, int x2, int y2, int q) {
        boolean sw = false;
        int l, m, varX, varY, result;

        l = 0;
        while (l < q && sw == !true) {
            m = 0;
            while (m < q && sw == !true) {
                varX = (l * x1  + m * x2 )% q;//Operaciones en x
                varY = (l * y1  + m * y2 )% q;//Operaciones en y
                

                System.out.println(l + "(" + x1 + "," + y1 + ")" + " + " + m + "(" + x2 + "," + y2 + ")" + " = (" + varX +"," + varY+")");

                if ((varX == 0  && varY == 0) && (l != 0 || m != 0)) {
                    sw = true;
                    System.out.println("entro!, descalificado");
                }
                m++;
            }
            l++;
        }

        return sw;
    }

}
