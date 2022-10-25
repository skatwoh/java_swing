/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author Admin
 */
public class Phong {

    private String ten;
    private int dienTich;
    private int trangThai;

    public Phong() {
    }

    public Phong(String ten, int dienTich, int trangThai) {
        this.ten = ten;
        this.dienTich = dienTich;
        this.trangThai = trangThai;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getDienTich() {
        return dienTich;
    }

    public void setDienTich(int dienTich) {
        this.dienTich = dienTich;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    public void display() {
        System.out.println("Tên: " + ten);
        System.out.println("Diện tích: " + dienTich);
        System.out.println("Trạng thái: " + trangThai);
    }
}
