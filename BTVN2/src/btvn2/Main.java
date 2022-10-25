/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package btvn2;

import entity.CayAnQua;
import entity.ThucVat;
import java.util.ArrayList;
import java.util.Scanner;
import service.ThucVatService;

/**
 *
 * @author Admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ThucVatService thucVatService = new ThucVatService();
        ArrayList<ThucVat> listThucVat = new ArrayList();
        Scanner sc = new Scanner(System.in);
        int chon;
        while (true) {
            menu();
            chon = Integer.parseInt(sc.nextLine());
            switch (chon) {
                case 1:
                    ThucVat thucVatInput = thucVatService.nhap();
                    listThucVat.add(thucVatInput);

                    System.out.println("Bạn có muốn tiếp tục không? (Y/N)");
                    String traLoi = sc.nextLine();

                    if (traLoi.equalsIgnoreCase("N")) {
                        break;
                    }
                    break;
                case 2:
                    for (ThucVat thucVat : listThucVat) {
                        thucVat.display();
                    }
                    break;
                case 3:
                    ArrayList<ThucVat> outPut = thucVatService.timTheoKhoangCan(listThucVat);
                    for (ThucVat thucVat : outPut) {
                        thucVat.display();
                    }
                    break;
                case 4:
                    CayAnQua cayAnQua = new CayAnQua();
                    cayAnQua.setMuaRaQua(4);
                    cayAnQua.setMaTV("m10");
                    cayAnQua.setTen("NO");
                    cayAnQua.setKhuVuc("VN");
                    cayAnQua.setCanNang(10);
                    cayAnQua.display();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    throw new AssertionError();
            }
        }
    }

    public static void menu() {
        System.out.println("--------------------------------------");
        System.out.println("1. Thêm thực vật");
        System.out.println("2. Hiện thị danh sách");
        System.out.println("3. Tìm thực vật theo khoảng cân nặng");
        System.out.println("4. Kế thừa");
        System.out.println("0. Thoát");
        System.out.println("--------------------------------------");
        System.out.println("Mời chọn chức năng: ");
    }

}
