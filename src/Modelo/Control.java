package Modelo;

import Vistas.Principal;
import javax.swing.JOptionPane;

public class Control {

    public static void main(String[] args) {
        Principal p= new Principal();
        try{
        Thread.sleep(3000);
        }catch(InterruptedException e){
            JOptionPane.showMessageDialog(null, "Error"+e, "ERROR",JOptionPane.ERROR_MESSAGE);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error"+e, "ERROR",JOptionPane.ERROR_MESSAGE);
        }
        p.setVisible(true);
    }

}
