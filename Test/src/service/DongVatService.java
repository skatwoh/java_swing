/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import entity.DongVat;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class DongVatService {

    public DongVat nhapDongVat() {
        Scanner sc = new Scanner(System.in);

        DongVat dongvat = new DongVat();
        dongvat.nhap();

        return dongvat;
    }

    public ArrayList<DongVat> timKiemTheoKhoangCan(
            ArrayList<DongVat> listDongVat) {
        Scanner sc = new Scanner(System.in);
        System.out.println("min: ");
        int min = Integer.parseInt(sc.nextLine());
        System.out.println("max: ");
        int max = Integer.parseInt(sc.nextLine());
        ArrayList<DongVat> outPut = new ArrayList<>();
        for (DongVat dongVat : listDongVat) {
            if (dongVat.getCanNang() > min && dongVat.getCanNang() < max) {
                outPut.add(dongVat);
            }
        }
        return outPut;
    }

    public ArrayList<DongVat> timKiemTheoChuCaiDau(
            ArrayList<DongVat> listDongVat) {
        boolean check = false;
        ArrayList<DongVat> outPut = new ArrayList<>();
        for (DongVat dongVat : listDongVat) {
            if (dongVat.getTenDV().startsWith("me")) {
                check = true;
                outPut.add(dongVat);
            }
        }
        if(check == false){
            System.out.println("khong ton tai");
        }
        return outPut;
    }

}
