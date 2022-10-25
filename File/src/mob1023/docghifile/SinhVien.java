/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mob1023.docghifile;

import java.io.Serializable;

/**
 *
 * @author nguyenvv
 */
public class SinhVien implements Serializable {

    private String ten;

    private String diaChi;

    public SinhVien(String ten, String diaChi) {
        this.ten = ten;
        this.diaChi = diaChi;
    }

    public SinhVien() {
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

}
