package codetheory.Models;

import java.util.ArrayList;
<<<<<<< HEAD

public class Campo {

    private int v[], n;
    private ArrayList<Vector> vectores = new ArrayList();

    public Campo(int q, int n) {
        v = new int[q];
        for (int i = 0; i < q; i++) {
            v[i] = i;
        }
        this.n = n;

        for (int i = 0; i < q; i++) {
            for (int j = 0; j < q; j++) {
                for (int l = 0; l < q; l++) {
                    vectores.add(new Vector(v[i], v[j], v[l]));
                }
            }
        }
    }

    public String Conjunto() {
        String str = "{";
        for (int i = 0; i < v.length; i++) {
            str += i;
            str += (i == v.length - 1) ? "" : ",";
        }
        str += "}";
        return str;
    }

    public String Vectores() {
        String str = "{";
        int i = 0;
        while (i < vectores.size()) {
            str += "(" + vectores.get(i).getX() + "," + vectores.get(i).getY() + "," + vectores.get(i).getZ() + ")";
            str += (i == vectores.size() - 1) ? "" : ",";
            i++;
        }
        str += "}";
        return str;
    }
=======
>>>>>>> refs/remotes/origin/Fq-n

public class Campo {

<<<<<<< HEAD
    public int getQ() {
        return v.length;
    }

    public ArrayList<Vector> getVectores() {
        return vectores;
    }

=======
//    ArrayList<ArrayList<String>> permutationResult;
//    private final int n;
//    public Campo(ArrayList zq, int n) {
//       this.n=n;
//    }
//  public ArrayList generatePermutations(ArrayList zq,int depth,int depthM, int val,int size,ArrayList temp,ArrayList pos){
//      
//    if(val==size){
//          temp.add(val);
//          pos.add(temp);
//          return pos;
//      } else {
//         temp.add(val);
//        generatePermutations(zq,depth,depthM,val+1,size,temp,pos);
//      }
//    }
>>>>>>> refs/remotes/origin/Fq-n
}
