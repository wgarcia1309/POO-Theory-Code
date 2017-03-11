package codetheory.Models;
public class Vector {
    int x,y,z;
    //3 componentes
    public Vector(int x, int y ,int z) {
      this.x=x;
      this.y=y;
      this.z=z;
    }
    //2 componentes
    public Vector(int x, int y) {
      this.x=x;
      this.y=y;  
      this.z=0;
    }
    //Vector nulo
    public Vector() {
      this.x=0;
      this.y=0;
      this.z=0;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }
    
}
