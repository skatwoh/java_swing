/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class DongVat {

    private String maDV;
    private String tenDV;
    private double canNang;

    public DongVat() {
    }

    public DongVat(String maDV, String tenDV, double canNang) {
        this.maDV = maDV;
        this.tenDV = tenDV;
        this.canNang = canNang;
    }

    public String getMaDV() {
        return maDV;
    }

    public void setMaDV(String maDV) {
        this.maDV = maDV;
    }

    public String getTenDV() {
        return tenDV;
    }

    public void setTenDV(String tenDV) {
        this.tenDV = tenDV;
    }

    public double getCanNang() {
        return canNang;
    }

    public void setCanNang(double canNang) {
        this.canNang = canNang;
    }

    public void display() {
        System.out.println("Mã DV: " + maDV);
        System.out.println("Tên DV: " + tenDV);
        System.out.println("Cân nặng: " + canNang);
    }
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã dv: ");
        maDV = sc.nextLine();
        System.out.println("Nhập tên dv: ");
        tenDV = sc.nextLine();
        System.out.println("Nhập cân nặng: ");
        canNang = Double.parseDouble(sc.nextLine());
    }
}
