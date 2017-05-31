/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;
import javax.swing.JTable;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

/**
 *
 * @author IdlhDeveloper
 */
public class Exporter {

    private File file;
    private List<JTable> tablas;
    private List<String> nom_files;

    public Exporter(File file, List<JTable> tablas, List<String> nom_files) throws Exception {
        this.file = file;
        this.tablas = tablas;
        this.nom_files = nom_files;
        if (nom_files.size() != tablas.size()) {
            throw new Exception("Error");
        }
    }

    public boolean export() {
        try {
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
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
