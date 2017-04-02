package codetheory.Models;

import java.util.ArrayList;

public abstract class Conjunto {

    /*
    Conatructor del conjunto
    Zq 
    Sera por el momento un ArrayList,
    con la posibilidad de cambiar a una lista
    se pide solamente q.
     */
    protected ArrayList<Integer> puntos;
    protected int q;

    /**
     * Constructor.
     *
     * @param q numero del conjunto
     */
    public Conjunto(int q) {
        this.q = q;
        puntos = new ArrayList<>();
        if (q > 0) {
            if (primo()) {
                for (int i = 0; i < q; i++) {
                    puntos.add(i);
                }
            }
        }
    }

    //verificacion si q es primo
    private boolean primo() {
        for (int i = 2; i < q - 1; i++) {
            if (q % i == 0) {
                return false;
            }
        }
        return true;
    }

    //String  que muestra el conjunto de vectores, si q es 0 sera un conjunto vacio
    public void mostrarCon() {
        if (q != 0) {
            String str = "{";
            for (int i = 0; i <= q - 1; i++) {
                str += i + ",";
            }
            System.out.println(str.substring(0, str.length() - 1) + "}");
            return;
        }
        System.out.println("{}");
    }

    public ArrayList getPuntos() {
        return puntos;
    }
}
