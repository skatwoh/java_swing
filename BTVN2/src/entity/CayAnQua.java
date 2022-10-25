/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author Admin
 */
public class CayAnQua extends ThucVat {

    private int muaRaQua;

    public CayAnQua() {
    }

    public CayAnQua(int muaRaQua) {
        this.muaRaQua = muaRaQua;
    }

    public CayAnQua(int muaRaQua, String maTV, String ten, String khuVuc, int canNang) {
        super(maTV, ten, khuVuc, canNang);
        this.muaRaQua = muaRaQua;
    }

    public int getMuaRaQua() {
        return muaRaQua;
    }

    public void setMuaRaQua(int muaRaQua) {
        this.muaRaQua = muaRaQua;
    }

    @Override
    public String toString() {
        return super.toString() + "muaRaQua=" + muaRaQua + '}';
    }

    @Override
    public void display() {
        System.out.println(toString());
    }

}
