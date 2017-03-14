package codetheory.Controls;

import codetheory.Models.Campo;
import codetheory.Models.Conjunto;
import java.util.ArrayList;//Elimineme si estoy aqui
import java.util.List;
import java.util.Scanner;

public class CodeTheory {

    public static ArrayList<List<Integer>> pos = new ArrayList<List<Integer>>();

    public static void main(String[] args) {

        /*
        int q,n,k,d;
        Scanner sc =new Scanner(System.in);
        System.out.println("Q");
        q=sc.nextInt();
        System.out.println("n k d\n");
        n=sc.nextInt();
        k=sc.nextInt();
        d=sc.nextInt();
        Campo c1 =new Campo(q,n);
        System.out.println(c1.Vectores());*/
        Conjunto z = new Conjunto(2);
        //Campo ZqN= new Campo(z.getPuntos(),3);
        List<Integer> as = new ArrayList();
        int ncom = 3;//
        //obtener tamaño, aqui sera 2^3=8
        //q=2
        generatePermutations(z.getPuntos(), 1, 8, 1, ncom, 0, 0, as);
        for (int i = 0; i < pos.size(); i++) {
            System.out.println(pos.get(i));
        }
    }

    public static void generatePermutations(ArrayList zq, int yi, int yf, int xi, int xf, int valori, int valorf, List<Integer> temp) {
        if (pos.size() < Math.pow(zq.size(), xf)) {
            if (yi == yf && xi == xf) {//Ultima posibilidad //Falta mejorar
                temp.add(valorf);
                List<Integer> temp1 = new ArrayList();
                temp1.addAll(temp);
                pos.add(temp1);
                System.out.println("yup");//para probar
                temp.size();
                System.out.println(":)");//para probar
                System.out.println(yi == yf);
            } else if (yi != yf && xi == xf) {//ultima componente de desde el vector 0 hasta el vector n-1
                if (valorf < zq.size()) {
                    temp.add(valorf);//agrego el valor
                    System.out.println(":(");//para probar
                    List<Integer> temp1 = new ArrayList();//lista de enteros
                    temp1.addAll(temp);//lo agrego a una lista temporal
                    pos.add(temp1);//añado las 3 componentes a pos
                    temp.remove(temp.size() - 1);//elimino la ultima componente del temporal
                    generatePermutations(zq, yi, yf, xi, xf, valori, valorf + 1, temp);//lo envio con el fin de añadir la proxima componente +1
                } else {//si no se cumple ya puso todas las ultimas componentes con valores validos
                    temp.remove(temp.size() - 1);//elimino la ultima componente
                    System.out.println("¿?");//para probar
                    generatePermutations(zq, yi + zq.size(), yf, xi - 1, xf, valori + 1, 0, temp);//valor inicial +1 y siguiente componente seteada a 0
                }
            } else if (xi != xf) {//inicio de la recursividad
                if (valori < zq.size()) {//si no estoy en el limite maximo
                    temp.add(valori);//añado valor i
                    System.out.println(":|");//para probar
                    generatePermutations(zq, yi, yf, xi + 1, xf, valori, valorf, temp);//componente en x aumenta en 1
                } else{
                //falta analizar mas esta porcion de codigo
                    if (temp.size() != 1) {
                        temp.remove(temp.size() - 1);//elimino 
                        generatePermutations(zq, yi, yf, xi - 1, xf, valori + 1, 0, temp);
                    } else {
                        System.out.println("¿?");//para probar
                        temp.set(0, temp.get(0) + 1);
                        System.out.println("DATOS IMPORTANTES");//para probar
                        System.out.println("Temp.size=" + temp.size());//para probar
                        for (int i = 0; i < temp.size(); i++) {
                            System.out.println(temp.get(i));
                        }
                        System.out.println("pos.size=" + pos.size());//para probar
                        for (int i = 0; i < pos.size(); i++) {
                            System.out.println(pos.get(i));
                        }
                        generatePermutations(zq, yi, yf, 1, xf, valori + 1, valorf, temp);
                    }
                }
            }
        }
    }

}
