/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Modelo.Exporter;
import com.itextpdf.text.DocumentException;
import Modelo.Files;
import Modelo.Fpdf;
import static Vistas.Principal.a;
import java.awt.Cursor;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PC
 */
public class Final extends javax.swing.JFrame {

    /**
     * Creates new form Final
     */
    public String r;

    public Final() {
        initComponents();
        this.setTitle("Buscardor de Codigos lineales");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        String v[][] = a.getMatrixG(), vh[][] = a.getControlH();

        DefaultTableModel mcontrol = (DefaultTableModel) jTable1.getModel();
        DefaultTableModel mgen = (DefaultTableModel) jTable2.getModel();
        for (int i = 0; i < a.getN(); i++) {//columnas
            mcontrol.addColumn("v" + (i + 1));
            mgen.addColumn("v" + (i + 1));
        }

        for (int j = 0; j < a.getFilas(); j++)//inicializacion de casillas
        {
            mcontrol.addRow(new Object[]{});
        }

        for (int i = 0; i < a.getFilas(); i++) {
            for (int j = 0; j < a.getN(); j++) {//inicializacion de casillas
                mcontrol.setValueAt(vh[i][j], i, j);
            }
        }

        for (int j = 0; j < a.getK(); j++)//inicializacion de casillas
        {
            mgen.addRow(new Object[]{});
        }
        for (int i = 0; i < a.getK(); i++) {
            for (int j = 0; j < a.getN(); j++) {//inicializacion de casillas
                mgen.setValueAt(v[i][j], i, j);
            }
        }
        jLabel2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jLabel3.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jLabel4.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        filec = new javax.swing.JFileChooser();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        filec.setFileSelectionMode(javax.swing.JFileChooser.DIRECTORIES_ONLY);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(89, 89, 89));
        jButton1.setForeground(new java.awt.Color(229, 229, 229));
        jButton1.setText("Volver");
        jButton1.setContentAreaFilled(false);
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 251, -1, -1));

        jLabel1.setForeground(new java.awt.Color(229, 229, 229));
        jLabel1.setText("Exportar a");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 28, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/32pdf.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(572, 32, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/excel.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(622, 32, -1, -1));

        jTable1.setBackground(new java.awt.Color(152, 152, 152));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
            }
        ));
        jTable1.setEnabled(false);
        jTable1.setFocusable(false);
        jTable1.setGridColor(new java.awt.Color(152, 152, 152));
        jTable1.setOpaque(false);
        jTable1.setRequestFocusEnabled(false);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 28, -1, 150));

        jTable2.setBackground(new java.awt.Color(152, 152, 152));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
            }
        ));
        jTable2.setEnabled(false);
        jTable2.setFocusable(false);
        jTable2.setGridColor(new java.awt.Color(152, 152, 152));
        jTable2.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTable2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 209, 450, 150));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/64LaTeX_logo.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(672, 37, -1, -1));

        jLabel5.setForeground(new java.awt.Color(229, 229, 229));
        jLabel5.setText("Matriz de control");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        jLabel6.setBackground(new java.awt.Color(229, 229, 229));
        jLabel6.setForeground(new java.awt.Color(229, 229, 229));
        jLabel6.setText("Matriz generadora");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 189, -1, -1));

        jLabel7.setBackground(new java.awt.Color(76, 76, 76));
        jLabel7.setOpaque(true);
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void archivos() throws IOException {
        Files d = new Files(r, a);
        int option = filec.showOpenDialog(this); //Abre el filechooser y almacena como se cerró la ventana
        if (option != 1) {
            r = (filec.getSelectedFile()).toString() + "\\";
        } else {
            r = "";
            JOptionPane.showMessageDialog(rootPane, "Error, seleccione un escritorio", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        Fpdf d=null;
        try {
            archivos();
            if(!r.equals(""))d=new Fpdf(r,a);//d=new Fpdf(r,a);
        } catch (IOException ex) {
            Logger.getLogger(Final.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(Final.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(r);
        System.out.println("ok");
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        //Files d = new Files(r, a);
        //archivos();
            JFileChooser chooser = new JFileChooser();
            FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de excel", "xls");
            chooser.setFileFilter(filter);
            chooser.setDialogTitle("Guardar archivo");
            chooser.setAcceptAllFileFilterUsed(false);
            //if (!r.equals("") && r != null) {
            if (chooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {    
                System.out.println("entro!");
                List<JTable> tb = new ArrayList<JTable>();
                List<String> nom = new ArrayList<String>();
                tb.add(jTable1);
                nom.add("Matriz H");
                tb.add(jTable2);
                nom.add("Matriz G");
                String file = chooser.getSelectedFile().toString().concat(".xls");
                try {
                    Exporter e = new Exporter(new File(file), tb, nom);
                    if (e.export()) {
                        JOptionPane.showMessageDialog(null, "Los datos fueron exportados a excel en el directorio seleccionado", "Mensaje de Informacion", JOptionPane.INFORMATION_MESSAGE);
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Hubo un error " + e.getMessage(), " Error", JOptionPane.ERROR_MESSAGE);
                }
            }
            //}
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        Files d = new Files(r, a);
        try {
            archivos();
            if (!r.equals("") && r != null) {
                d.crearLatex();
            }
        } catch (IOException ex) {
            Logger.getLogger(Final.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                        Principal p = new Principal();
        p.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JFileChooser filec;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
