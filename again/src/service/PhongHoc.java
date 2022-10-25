/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import entity.Phong;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class PhongHoc {
    public Phong nhap(){
        Scanner sc = new Scanner(System.in);
        Phong p = new Phong();
        System.out.println("Nhập tên: ");
        String ten = sc.nextLine();
        System.out.println("Nhập diện tích: ");
        int dienTich = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập trạng thái: ");
        int trangThai = Integer.parseInt(sc.nextLine());
        
        p.setTen(ten);
        p.setDienTich(dienTich);
        p.setTrangThai(trangThai);
        return p;
    }
    
    public ArrayList<Phong> timTheoTrangThai(ArrayList<Phong> listPhong,
    int trangThaiTim){
        ArrayList<Phong> outPut = new ArrayList<>();
        for (Phong phong : listPhong) {
            if(phong.getTrangThai() == trangThaiTim){
                outPut.add(phong);
            }
            
        }
        return outPut;
    }
}
