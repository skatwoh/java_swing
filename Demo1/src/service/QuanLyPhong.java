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
public class QuanLyPhong {

    ArrayList<Phong> listPhong = new ArrayList<>();

    public void nhapDoiTuong() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            Phong p = new Phong();
            p.nhap();
            listPhong.add(p);
            System.out.println("Bạn có muốn tiếp tục không?(Y/N)");
            String chonTiep = sc.nextLine();

            if (chonTiep.equalsIgnoreCase("N")) {
                break;
            }
        }

    }

    public void xuatDoiTuong() {
        for (Phong phong : listPhong) {
            phong.inThongTin();
        }
    }

    public void xuatDSTheoTT() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập trạng thái muốn xuất: ");
        int trangThaiXuat = Integer.parseInt(sc.nextLine());
        for (Phong phong : listPhong) {
            if (phong.getTrangThai() == trangThaiXuat) {
                phong.inThongTin();
            }
        }
    }

}
