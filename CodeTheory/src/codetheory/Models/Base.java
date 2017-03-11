package codetheory.Models;

import java.util.ArrayList;

public class Base {

    private final int k;
    private final Campo p;

    public Base(int k, Campo p) {
        this.k = k;
        this.p = p;
    }

    /*
    public String LI(){
        
    }
     */
    public ArrayList<Vector> GetCodigo() {
        ArrayList<Vector> v = new ArrayList();
        for (int i = 0; i < p.getQ(); i++) {
            for (int j = 0; j < p.getQ(); j++) {
                
            }
        }
        return v;
    }

    public Vector suma(Vector v1, Vector v2) {
        Vector temp=new Vector( (v1.getX()+v2.getX())%p.getQ() , (v1.getY()+v2.getY())%p.getQ() ,(v1.getZ()+v2.getZ())%p.getQ());
        return temp;
    }

    public Vector mul(int x,Vector v) {
        Vector temp=new Vector( (v.getX()*x)%p.getQ() , (v.getY()*x)%p.getQ() ,(v.getZ()*x)%p.getQ());
        return temp;
    }
}
