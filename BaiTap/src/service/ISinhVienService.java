/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.List;

/**
 *
 * @author Admin
 */
public interface ISinhVienService<T> {

    public List<T> getList();

    public Boolean add(T t);

    public Boolean remove(T t);

}
