package codetheory.Models;
import java.util.ArrayList;
public class Conjunto {
    /*
    Conatructor del conjunto
    Zq 
    Sera por el momento un ArrayList,
    con la posibilidad de cambiar a una lista
    se pide solamente q.
    */
    private ArrayList puntos;
    private int q;
    public Conjunto(int q) {
        this.q = q;
        puntos = new ArrayList<Integer>();
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
    public String mostrar() {
        if (q != 0) {
            String str = "{";
            for (int i = 0; i <= q - 1; i++) {
                str += i + ",";
            }
            return str.substring(0,str.length()-1 )+ "}";
        }
        return "{}";
    }
    public ArrayList getPuntos() {
        return puntos;
    }
}
