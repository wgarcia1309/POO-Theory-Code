package codetheory.Controls;

import codetheory.Models.Campo;
import java.util.Scanner;

public class CodeTheory {
    public static void main(String[] args) {
        int q,n,k,d;
        Scanner sc =new Scanner(System.in);
        System.out.println("Q");
        q=sc.nextInt();
        System.out.println("n k d\n");
        n=sc.nextInt();
        k=sc.nextInt();
        d=sc.nextInt();
        Campo c1 =new Campo(q,n);
        System.out.println(c1.Vectores());
     //zsubq es un campo? 
    }
    
}
