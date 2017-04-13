/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codetheory.Models;

/**
 *
 * @author hectordaniel
 */
public class Vector {

    private int x;
    private Vector link;

    public Vector(int x) {
        this.x = x;
        this.link = null;
    }

    public int getX() {
        return x;
    }

    public Vector getLink() {
        return link;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setLink(Vector link) {
        this.link = link;
    }
    
    public void add(int s) {
        Vector d=new Vector(s),temp=this;
        while(temp.getLink()!=null){
        temp=temp.getLink();
        }
        temp.setLink(d);
    }

}
