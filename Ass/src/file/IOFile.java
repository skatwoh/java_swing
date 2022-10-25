/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package file;

import entity.NhanVien;
import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class IOFile {
    public void writeNV(ArrayList<NhanVien> listNhanVien){
        try (PrintWriter pw = new PrintWriter(new File("list.txt"))) {
            for (NhanVien x : listNhanVien) {
                pw.println(x.getMaNV());
                pw.println(x.getHoTen());
                pw.println(x.getTuoi());
                pw.println(x.getEmail());
                pw.println(x.getLuong());
            }
        } catch (Exception e) {
            System.out.println("got an exception");
        }
    }
    
    
    public ArrayList readNV(){
        ArrayList<NhanVien> listNhanVien = new ArrayList<>();
        try (Scanner sc = new Scanner(new File("list.txt"))){
            while(sc.hasNext()){
                NhanVien nv = new NhanVien();
                nv.setMaNV(sc.nextLine());
                nv.setHoTen(sc.nextLine());
                nv.setTuoi(Integer.parseInt(sc.nextLine()));
                nv.setEmail(sc.nextLine());
                nv.setLuong(Double.parseDouble(sc.nextLine()));
                
                listNhanVien.add(nv);
            }
        } catch (Exception e) {
            System.out.println("got an exception");
        }
        return listNhanVien;
    }
}
