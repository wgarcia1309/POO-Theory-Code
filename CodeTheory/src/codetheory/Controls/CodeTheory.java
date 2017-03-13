package codetheory.Controls;

import codetheory.Models.Campo;
import codetheory.Models.Conjunto;
import java.util.Scanner;

public class CodeTheory {

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
        Conjunto z = new Conjunto(3);
        Conjunto a = new Conjunto(2);
        Conjunto b = new Conjunto(1);
        Conjunto c = new Conjunto(0);
        Conjunto d = new Conjunto(500);
        System.out.println(z.mostrar());
        System.out.println(a.mostrar());
        System.out.println(b.mostrar());
        System.out.println(c.mostrar());
        System.out.println(d.mostrar());
    }
}
