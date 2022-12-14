/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import entity.DongVat;
import java.util.ArrayList;
import java.util.Scanner;
import service.DongVatService;

public class Main {
    
    public static void main(String[] args) {
        DongVatService dongvatService = new DongVatService();
        ArrayList<DongVat> listDongVat = new ArrayList();
        Scanner sc = new Scanner(System.in);
        int chon;
        while (true) {
            menu();
            chon = Integer.parseInt(sc.nextLine());
            switch (chon) {
                case 1:
                    while (true) {                        
                        DongVat dongvatInput = dongvatService.nhapDongVat();
                        listDongVat.add(dongvatInput);
                        
                        System.out.println("Ban co nhap tiep khong?(Y/N)");
                        String nhapTiep = sc.nextLine();
                        
                        if (nhapTiep.equalsIgnoreCase("N")) {
                            break;
                        }
                    }
                    
                    break;
                case 2:
                    for (DongVat dongVat : listDongVat) {
                        dongVat.display();
                    }
                    break;
                case 3:
                    ArrayList<DongVat> outPut = dongvatService.timKiemTheoKhoangCan(listDongVat);
                    for (DongVat dongVat : outPut) {
                        dongVat.display();
                    }
                    break;
                case 4:
                    ArrayList<DongVat> outPutt = dongvatService.timKiemTheoChuCaiDau(listDongVat);
                    for (DongVat dongVat : outPutt) {
                        dongVat.display();
                    }
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    throw new AssertionError();
            }
        }
        
    }
    
    public static void menu() {
        System.out.println("+-------------------------------------------------------+");
        System.out.println("|1. Nh???p ?????ng v???t                                       |");
        System.out.println("|2. Xu???t danh s??ch ?????ng v???t                             |");
        System.out.println("|3. T??m ki???m ?????ng v???t theo kho???ng c??n                   |");
        System.out.println("|4. Xu???t ?????ng v???t c?? t??n b???t ?????u b???ng 'me'              |");
        System.out.println("|5. Tho??t                                               |");
        System.out.println("+-------------------------------------------------------+");
        System.out.println("M???i ch???n ch???c n??ng: ");
    }
    
}
