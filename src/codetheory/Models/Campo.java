package codetheory.Models;

import java.util.ArrayList;
import java.util.List;

public class Campo extends Conjunto {

    public ArrayList<List<Integer>> vectores = new ArrayList<List<Integer>>();
    public int ncom;
    /**
     *Crea el campo completo y los vectores los guarda en el array vectores
     * @param ncom el numero de componentes de cada vector
     * @param q el numero de maximo del conjunto con el cual son creado los vectores
     */
    public Campo(int ncom, int q) {
        super(q);
        this.ncom = ncom;
        setPos(Math.pow(q, ncom));

    }
    /**
     * Genera las combinaciones 
     * @param x  
     */
    public void setPos(double x) {
        for (int i = 0; i < x; i++) {
            String temp = Integer.toString(i, q);
            int tam = temp.length();
            if (tam < ncom) {
                for (int j = 0; j < ncom - tam; j++) {
                    temp = "0" + temp;
                }
            }
            ArrayList<Integer> ltemp = new ArrayList();
            for (int j = 0; j < ncom; j++) {
                ltemp.add(Integer.parseInt(temp.substring(j, j + 1)));
            }
            vectores.add(ltemp);
        }
    }

    public void mostrarVec() {
        for (int i = 0; i < vectores.size(); i++) {
            System.out.println((i+1)+": "+vectores.get(i));
        }
    }
}
