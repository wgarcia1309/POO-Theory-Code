package Controlador;

import Modelo.MatrizH;
import Vistas.Principal;
//exportar a latex
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
//exportar a pdf
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
import com.itextpdf.text.Font;
import java.io.IOException;
//exportar a exel
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;
import javax.swing.JTable;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class Control {

    private static Font fuenteBold = new Font(Font.FontFamily.COURIER, 20, Font.BOLD);

    public static void main(String[] args) {
        Principal p = new Principal();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            JOptionPane.showMessageDialog(null, "Error" + e, "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error" + e, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        p.setVisible(true);
    }

    /**
     * Este metodo exporta la informacion mediante la creacion de archivo Latex.
     *
     */
    public static void crearLatex(String site, MatrizH matrix) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(site + "\\answer.tex"));

            String r = "", m[][] = matrix.getMatrixG(), mc[][] = matrix.getControlH();
            //control C//H
            for (int i = 0; i < matrix.getFilas(); i++) {
                for (int j = 0; j < matrix.getN(); j++) {//inicializacion de casillas
                    r += mc[i][j] + " & ";
                    System.out.print(mc[i][j] + " ");
                }
                System.out.println("");
                r = r.substring(0, r.length() - 2);
                r += "\\\\ \n";
            }
            bw.write("\\documentclass{article}\n\\usepackage{amsmath}\\begin{document}" + "\\section{Matriz control}\n" + "\\[\n\\begin{bmatrix}" + r + "\\end{bmatrix}\\]\n");

            //matriz G//G
            r = "";
            System.out.println("\n");
            for (int i = 0; i < matrix.getK(); i++) {
                for (int j = 0; j < matrix.getN(); j++) {//inicializacion de casillas
                    r += m[i][j] + " & ";
                }
                r = r.substring(0, r.length() - 2);
                r += "\\\\ \n";
            }
            bw.write("\\section{Matriz generadora}\n" + "\\[\\begin{bmatrix}" + r + "\\end{bmatrix}\\]\\end{document}");
            bw.close();
            JOptionPane.showMessageDialog(null, "Los datos fueron exportados a latex en el directorio seleccionado", "Mensaje de Informacion", JOptionPane.INFORMATION_MESSAGE);

        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "ruta no encontrada o sin permisos para escribir", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error " + ex, "Error", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(Control.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error " + e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Construye un tipo Ffpdf y a partir del cual exporta a .pdf.
     *
     * @param site informacion de proceso
     * @param matrix informacion a exportar
     */
    public static void Crearpdf(String site, MatrizH matrix) throws IOException, DocumentException {
        try {
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
            JOptionPane.showMessageDialog(null, "Los datos fueron exportados a pdf en el directorio seleccionado", "Mensaje de Informacion", JOptionPane.INFORMATION_MESSAGE);

        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "ruta no encontrada o sin permisos para escribir", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error " + e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Establece el formato del texto a ingresar en el archivo .pdf.
     *
     * @param texto informacion a exportar
     */
    private static Paragraph gettittle(String texto) {
        Paragraph p = new Paragraph();
        Chunk c = new Chunk();
        p.setAlignment(Element.ALIGN_CENTER);
        c.append(texto);
        c.setFont(fuenteBold);
        p.add(c);
        return p;
    }

    /**
     * Crea un tipo Exporter para facilitar el manejo de datos a exportar.
     *
     * @param file archivo a convertir.
     * @param tablas informacion a convertir.
     * @param nom_files informacion de utilidad.
     */
    public static void Crearexcel(File file, List<JTable> tablas, List<String> nom_files) {
        try {
            if (nom_files.size() != tablas.size()) {
                throw new Exception("Error");
            } else {
                System.out.println("proceso");
                DataOutputStream out = new DataOutputStream(new FileOutputStream(file));
                WritableWorkbook w = Workbook.createWorkbook(out);
                for (int index = 0; index < tablas.size(); index++) {
                    JTable table = tablas.get(index);
                    WritableSheet s = w.createSheet(nom_files.get(index), 0);
                    for (int i = 0; i < table.getColumnCount(); i++) {
                        for (int j = 0; j < table.getRowCount(); j++) {
                            Object object = table.getValueAt(j, i);
                            s.addCell(new Label(i, j, String.valueOf(object)));
                        }
                    }
                }
                w.write();
                w.close();
                JOptionPane.showMessageDialog(null, "Los datos fueron exportados a excel en el directorio seleccionado", "Mensaje de Informacion", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "ruta no encontrada o sin permisos para escribir", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error " + e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
