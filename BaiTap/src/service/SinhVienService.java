/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class SinhVienService<T> implements ISinhVienService<T> {

    List<T> lstT = new ArrayList<>();

    @Override
    public List<T> getList() {
        return lstT;
    }

    @Override
    public Boolean add(T t) {
        if (t == null) {
            return false;
        }
        lstT.add(t);
        return true;
    }

    @Override
    public Boolean remove(T t) {
        lstT.remove(t);
        return true;
    }

}
