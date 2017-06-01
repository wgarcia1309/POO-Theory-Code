/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * Files, encapsula e importa informacion a formato Latex.
 * @author PC
 */
public class Files {
    String site;
    MatrizH matrix;
    

    /**
     * Construye un tipo File necesario para exportar a Latex.
     *
     * @param site informacion de proceso
     * @param matrix informacion a exportar

     */
    public Files(String site,MatrizH matrix) {
        this.matrix = matrix;
        this.site=site;
    }
    

    /**
     * Este metodo exporta la informacion mediante la creacion de archivo Latex.
     * 
     */
    public void crearLatex(){
        try{
        BufferedWriter bw=new BufferedWriter(new FileWriter(site+"\\answer.tex"));
        
        String r="",m[][]= matrix.getMatrixG(),mc[][]=matrix.getControlH();
        //control C//H
        for (int i = 0; i < matrix.getFilas(); i++){
                for (int j = 0; j < matrix.getN(); j++){//inicializacion de casillas
                    r+=mc[i][j] +" & ";
                    System.out.print(mc[i][j]+" ");
                }
                System.out.println("");
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
        bw.close();
        }catch(FileNotFoundException e){
            JOptionPane.showMessageDialog(null, "ruta no encontrada o sin permisos para escribir", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error "+ex, "Error", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(Files.class.getName()).log(Level.SEVERE, null, ex);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error "+e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
}
