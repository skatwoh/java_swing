/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package onluyen;

import java.io.Serializable;

/**
 *
 * @author Admin
 */
public class SinhVien  implements Serializable{
    private String maSV;
    private String tenSV;
    private String boMon;
    private String trangThai;

    public SinhVien() {
    }

    public SinhVien(String maSV, String tenSV, String boMon, String trangThai) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.boMon = boMon;
        this.trangThai = trangThai;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public String getBoMon() {
        return boMon;
    }

    public void setBoMon(String boMon) {
        this.boMon = boMon;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }
    
    
}
