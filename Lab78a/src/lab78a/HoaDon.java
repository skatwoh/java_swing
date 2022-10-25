/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab78a;

/**
 *
 * @author Admin
 */
public class HoaDon {
    private String tenKH;
    private String loaiVe;
    private int soLuong;

    public HoaDon() {
    }

    public HoaDon(String tenKH, String loaiVe, int soLuong) {
        this.tenKH = tenKH;
        this.loaiVe = loaiVe;
        this.soLuong = soLuong;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getLoaiVe() {
        return loaiVe;
    }

    public void setLoaiVe(String loaiVe) {
        this.loaiVe = loaiVe;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    
    
}
