package codetheory.Models;
import java.util.ArrayList;
public class Campo {
    int v[],n;
    ArrayList <Vector> vectores=new ArrayList();
    public Campo(int q,int n) {
        v = new int[q];
        for (int i = 0; i < q; i++) {
            v[i]=i;
        }
        this.n=n;
        
        for (int i = 0; i < q; i++) {
            for (int j = 0; j < q; j++) {
                for (int l = 0; l < q; l++) {
                    vectores.add(new Vector(v[i],v[j],v[l]));
                }
            }
        }
    }
    public void adicion(){
    }
    public void multiplicacion(){
        
    }
    public String Conjunto(){
        String str="{";
        for (int i = 0; i < v.length; i++) {
            str+=i;
            str+=(i==v.length-1)?"":",";                  
        }
        str+="}";
        return str;
    }
    public String Vectores(){
        String str="{";
        int i=0;
        while(i<vectores.size()){
            str+="("+vectores.get(i).getX()+","+vectores.get(i).getY()+","+vectores.get(i).getZ()+")";
            str+=(i==vectores.size()-1)?"":",";
            i++;
        }
        str+="}";
        return str;
    }
}
