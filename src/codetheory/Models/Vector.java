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

    public Vector() {
        this.x = -1;
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
        if (this.getX() == -1) {
            this.setX(s);
        } else {
            Vector d = new Vector(s);
            Vector temp = this;
            while (temp.getLink() != null) {
                temp = temp.getLink();
            }
            temp.setLink(d);
        }
    }

    public void mostrarV() {
        Vector temp = this;
        while (temp != null) {
            System.out.print(temp.getX() + " ");
            temp = temp.getLink();
        }
        System.out.println("");
    }

    public int length() {
        int cont = 0;
        Vector temp = this;
        while (temp != null) {
            temp = temp.getLink();
            cont++;
        }
        return cont;
    }

    public int getPos(int k) {
        Vector temp = this;
        int i = 0;
        while (temp != null && k != i) {
            temp = temp.getLink();
            i++;
        }
        return temp.getX();
    }
}
