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
        int ncom = 10;//
        //obtener tamaño, aqui sera 2^3=8
        //q=2
        generatePermutations(z.getPuntos(), 0, 8-1, 1, ncom, 0, 0, as);
        System.out.println("FINAL");
        for (int i = 0; i < pos.size(); i++) {
            System.out.println(pos.get(i));
        }
    }

    public static void generatePermutations(ArrayList zq, int yi, int yf, int xi, int xf, int valora, int valorpro, List<Integer> temp) {
//        System.out.println("temp = "+temp.size());
//        for (int i = 0; i < temp.size(); i++) 
//            System.out.print(temp.get(i)+",");
//        System.out.println();
        System.out.println("POS = "+pos.size());
         for (int i = 0; i < pos.size(); i++) {
            System.out.println(pos.get(i));
        }
        System.out.println("x= "+xi+" y= "+yi+" valora="+valora); 
        System.out.println((valora == zq.size()));
        System.out.println(valora <zq.size());
        System.out.println(temp.size());
        if (yi == yf && xi == xf) {//Ultima posibilidad 
            temp.add(valorpro);
            List<Integer> temp1 = new ArrayList();
            temp1.addAll(temp);
            pos.add(temp1);
            System.out.println("yup");//para probar
        } else if (yi != yf && xi == xf) {//ultima componente de desde el vector 0 hasta el vector n-1
                if (valorpro < zq.size()) {
                    temp.add(valorpro);//agrego el valor
                    System.out.println(":(");//para probar
                    List<Integer> temp1 = new ArrayList();//lista de enteros
                    temp1.addAll(temp);//lo agrego a una lista temporal
                    pos.add(temp1);//añado las 3 componentes a pos
                    temp.remove(temp.size() - 1);//elimino la ultima componente del temporal
                    generatePermutations(zq, yi+1, yf, xi, xf, valora, valorpro + 1, temp);//lo envio con el fin de añadir la proxima componente +1
                } else {//si no se cumple ya puso todas las ultimas componentes con valores validos
                    temp.remove(temp.size() - 1);//elimino la ultima componente
                    System.out.println("¿?");//para probar
                    generatePermutations(zq, yi, yf, xi - 1, xf, valora + 1, 0, temp);//valor inicial +1 y siguiente componente seteada a 0
                }
        } else if (xi != xf) {//inicio de la recursividad
                if (valora == zq.size()) {
                       temp.remove(temp.size()-1);
                       System.out.println(":|");//para probar
                       System.out.println("Valor de valora "+(valora));
                       System.out.println("Valor de zq "+zq.size());
                       generatePermutations(zq, yi, yf, xi - 1, xf, 1, 0, temp);//componente en x aumenta en 1
                   } else if(valora <zq.size()){
                       temp.add(valora);//añado valor i
                       System.out.println(":||");//para probar
                       generatePermutations(zq, yi, yf, xi + 1, xf, valora, valorpro, temp);//componente en x aumenta en 1
                   }else if(temp.isEmpty()){
                        generatePermutations(zq, yi, yf, xi, xf, valora, 0, temp);//componente en x aumenta en 1
                   }
            }
        }
    }
