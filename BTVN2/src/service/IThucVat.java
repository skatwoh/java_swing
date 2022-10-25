/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import entity.ThucVat;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public interface IThucVat {

    public ThucVat nhap();

    public ArrayList<ThucVat> timTheoKhoangCan(ArrayList<ThucVat> listThucVat);
}
