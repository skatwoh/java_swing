/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package demo;

import entity.Nguoi;
import java.util.ArrayList;
import java.util.Scanner;
import service.NguoiService;

/**
 *
 * @author Admin
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NguoiService nguoiService = new NguoiService();
        ArrayList<Nguoi> listNguoi = new ArrayList();

        Scanner sc = new Scanner(System.in);

        while (true) {
            Nguoi nguoiInput = nguoiService.nhapNguoi();
            listNguoi.add(nguoiInput);

            System.out.println("Ban co nhap tiep khong(No/Yes)?");
            String nhapTiep = sc.nextLine();

            if (nhapTiep.equals("No")) {
                break;
            }
        }

        for (Nguoi nguoi : listNguoi) {
            nguoi.display();
        }

        ArrayList<Nguoi> outPut = nguoiService.timKiemTheoTuoi(15, 20,
                listNguoi);

        for (Nguoi nguoi : outPut) {
            nguoi.display();
        }
    }

}
