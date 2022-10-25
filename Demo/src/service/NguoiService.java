/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import entity.Nguoi;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class NguoiService {

    public Nguoi nhapNguoi() {
        Scanner sc = new Scanner(System.in);

        Nguoi nguoi = new Nguoi("Nguyen Van A", 20, "Ha noi");

        return nguoi;
    }

    public ArrayList timKiemTheoTuoi(int min, int max,
            ArrayList<Nguoi> listNguoi) {

        ArrayList<Nguoi> outPut = new ArrayList<>();
        for (Nguoi nguoi : listNguoi) {
            if (nguoi.getTuoi() > 15 && nguoi.getTuoi() < 20) {
                outPut.add(nguoi);
            }
        }

        return outPut;
    }
}

