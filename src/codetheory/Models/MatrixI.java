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
        MatrixI temp = this;
        while (temp.getLink() != null) {
            temp = temp.getLink();
        }
        temp.setLink(new MatrixI(v));
    }

}
