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
        this.matrix=matrix;
    }
    public  void crearH() throws IOException{
    String r="",m[][]=matrix.getControlH();
        for (int i = 0; i < matrix.getFilas; i++) {
            for (int j = 0; j < matrix.getN; j++) {
                r=m[i][j] +" & ";
            }
            r="\r\r"+r+"\\\\\n";
        }
    bw.write("\\documentclass{article}\n\\usepackage{amsmath}\\begin{document}\\[\\begin{bmatrix}"+r+"\\end{bmatrix}\\]\\end{document}");
    }
    
}
