/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.io.Serializable;

/**
 *
 * @author Admin
 */
public class PhieuMuon implements Serializable{
    private String tenSV;
    private String tenSach;
    private String boMon;
    private String gioiTinh;

    public PhieuMuon() {
    }

    public PhieuMuon(String tenSV, String tenSach, String boMon, String gioiTinh) {
        this.tenSV = tenSV;
        this.tenSach = tenSach;
        this.boMon = boMon;
        this.gioiTinh = gioiTinh;
    }

    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getBoMon() {
        return boMon;
    }

    public void setBoMon(String boMon) {
        this.boMon = boMon;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    
    
}
