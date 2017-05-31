/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author PC
 */
public class Flat {
    BufferedWriter bw;
    MatrizH matrix;
    
    public Flat(String site,MatrizH matrix) throws IOException {
        bw=new BufferedWriter(new FileWriter(site+"\\answer.tex"));
        this.matrix = matrix;
        crearGH();
        bw.close();
    }
    public  void crearGH() throws IOException{
    String r="",m[][]= matrix.getMatrixG(),mc[][]=matrix.getControlH();
        //control C//H
        for (int i = 0; i < matrix.getFilas(); i++){
                for (int j = 0; j < matrix.getN(); j++){//inicializacion de casillas
                    r+=m[i][j] +" & ";
                }
                r=r.substring(0,r.length()-2);
                r+="\\\\ \n";
        }
        bw.write("\\documentclass{article}\n\\usepackage{amsmath}\\begin{document}"+"\\section{Matriz control}\n"+"\\[\n\\begin{bmatrix}"+r+"\\end{bmatrix}\\]\n");
        //matriz G//G
        r="";
        System.out.println("\n");
        for (int i = 0; i < matrix.getK(); i++){
                for (int j = 0; j < matrix.getN(); j++){//inicializacion de casillas
                    r+=m[i][j] +" & ";
                }
                r=r.substring(0,r.length()-2);
                r+="\\\\ \n";
        }
    bw.write("\\section{Matriz generadora}\n"+"\\[\\begin{bmatrix}"+r+"\\end{bmatrix}\\]\\end{document}");
    }
    
}
