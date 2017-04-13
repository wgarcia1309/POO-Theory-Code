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
public class MatrixI {

    private Vector v;
    private MatrixI Link;

    public MatrixI(Vector v) {
        this.v = v;
        this.Link = null;
    }

    public MatrixI() {
        this.v = null;
        this.Link = null;
    }

    public Vector getV() {
        return v;
    }

    public MatrixI getLink() {
        return Link;
    }

    public void setV(Vector v) {
        this.v = v;
    }

    public void setLink(MatrixI Link) {
        this.Link = Link;
    }

    public void add(Vector v) {
        if (this.getV() == null) {
            this.setV(v);
        } else {
            MatrixI temp = this;
            while (temp.getLink() != null) {
                temp = temp.getLink();
            }
            temp.setLink(new MatrixI(v));
        }
    }

    public Vector getPos(int k) {
        MatrixI temp = this;
        int i=0;
        while (temp != null && k!=i) {
            temp = temp.getLink();
            i++;
        }
        return temp.getV();
    }
    public void mostarM() {
        MatrixI temp = this;
        while (temp!= null) {
            temp.getV().mostrarV();
            temp = temp.getLink();
        }
    }
}
