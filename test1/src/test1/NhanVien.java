/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test1;

/**
 *
 * @author Admin
 */
public class NhanVien {
    private String ten;
    private String maNV;
    private int tuoi;
    private int luongTheoNgay;
    private boolean gioiTinh;

    public NhanVien() {
    }

    public NhanVien(String ten, String maNV, int tuoi, int luongTheoNgay, boolean gioiTinh) {
        this.ten = ten;
        this.maNV = maNV;
        this.tuoi = tuoi;
        this.luongTheoNgay = luongTheoNgay;
        this.gioiTinh = gioiTinh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public int getLuongTheoNgay() {
        return luongTheoNgay;
    }

    public void setLuongTheoNgay(int luongTheoNgay) {
        this.luongTheoNgay = luongTheoNgay;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    
    
}
