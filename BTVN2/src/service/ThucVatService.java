/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import entity.ThucVat;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ThucVatService implements IThucVat {

    @Override
    public ThucVat nhap() {
        Scanner sc = new Scanner(System.in);
        ThucVat tvat = new ThucVat();
        System.out.println("Nhập mã TV: ");
        String maTV = sc.nextLine();
        System.out.println("Nhập tên TV: ");
        String ten = sc.nextLine();
        System.out.println("Nhập khu vực: ");
        String khuVuc = sc.nextLine();
        System.out.println("Nhập cân nặng: ");
        int canNang = Integer.parseInt(sc.nextLine());

        tvat.setMaTV(maTV);
        tvat.setTen(ten);
        tvat.setKhuVuc(khuVuc);
        tvat.setCanNang(canNang);
        return tvat;

    }

    @Override
    public ArrayList<ThucVat> timTheoKhoangCan(ArrayList<ThucVat> listThucVat) {
        ArrayList<ThucVat> outPut = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Min: ");
        int min = Integer.parseInt(sc.nextLine());
        System.out.println("Max: ");
        int max = Integer.parseInt(sc.nextLine());
        for (ThucVat thucVat : listThucVat) {
            if (thucVat.getCanNang() >= min && thucVat.getCanNang() <= max) {
                outPut.add(thucVat);
            }
        }
        return outPut;
    }

}
