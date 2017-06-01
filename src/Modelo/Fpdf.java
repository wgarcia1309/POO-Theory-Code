/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
import com.itextpdf.text.Font;
import java.io.FileOutputStream;
import java.io.IOException;

public class Fpdf {

    private Font fuenteBold = new Font(Font.FontFamily.COURIER, 20, Font.BOLD);
      
    /**
     * Construye un tipo Ffpdf y a partir del cual exporta a .pdf.
     *
     * @param site informacion de proceso
     * @param matrix informacion a exportar

     */

    public Fpdf(String site, MatrizH matrix) throws IOException, DocumentException {
        FileOutputStream archivo = new FileOutputStream(site + "\\answer.pdf");
        Document doc = new Document();
        PdfWriter.getInstance(doc, archivo);
        doc.open();
        String m[][] = matrix.getMatrixG(), mc[][] = matrix.getControlH();
        //control C//H
        doc.add(gettittle("Matriz de control"));
        doc.add(new Paragraph("\n"));
        PdfPTable table = new PdfPTable(matrix.getN());
        for (int i = 0; i < matrix.getFilas(); i++) {
            for (int j = 0; j < matrix.getN(); j++) {//inicializacion de casillas
                table.addCell(mc[i][j]);
            }
        }
        doc.add(table);
        doc.add(new Paragraph("\n"));
        doc.add(gettittle("Matriz generadora"));
        doc.add(new Paragraph("\n"));
        //matriz G//G
        table = new PdfPTable(matrix.getN());
        for (int i = 0; i < matrix.getK(); i++) {
            for (int j = 0; j < matrix.getN(); j++) {//inicializacion de casillas
                table.addCell(m[i][j]);
            }
        }
        doc.add(table);
        doc.close();
    }
          
    /**
     * Establece el formato del texto a ingresar en el archivo .pdf.
     *
     * @param texto informacion a exportar
     */

    private Paragraph gettittle(String texto) {
        Paragraph p = new Paragraph();
        Chunk c = new Chunk();
        p.setAlignment(Element.ALIGN_CENTER);
        c.append(texto);
        c.setFont(fuenteBold);
        p.add(c);
        return p;
    }
}
