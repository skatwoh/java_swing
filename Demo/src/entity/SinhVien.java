/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author Admin
 */
public class SinhVien extends Nguoi{
    private String maSV;
    private double diem;

    public SinhVien() {
    }

    public SinhVien(String maSV, double diem) {
        this.maSV = maSV;
        this.diem = diem;
    }

    public SinhVien(String maSV, double diem, String ten, int tuoi, String diaChi) {
        super(ten, tuoi, diaChi);
        this.maSV = maSV;
        this.diem = diem;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }
    
    @Override
    public void display(){
        System.out.println("Mã SV: "+maSV);
        System.out.println("Điểm: "+diem);
    }
    
}
