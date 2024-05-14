/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import model.GiaoVien;
import model.MonHoc;
import model.Student;

/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) {
        
        // tao 3 object cua 3 class
        GiaoVien TuanVm = new GiaoVien("tuanVM", "Tuan", "123456789", "Hanoi");
        Student ElvisNg = new Student("HE191056", "Thao", "0337738366", "Hanoi", "BeDue");
        MonHoc Sem2 = new MonHoc ("PRO192", "JaVa OOP");
        
        // tuong tac voi getter/setter
        System.out.println("Tuong tac voi 3 objects");
        // object GiaoVien
        System.out.println("Truoc khi tuong tac: " + TuanVm.getIdGV());
        TuanVm.setIdGV("Tuan Thien Than");
        System.out.println("Sau khi tuong tac: " + TuanVm.getIdGV());
        // object Student
        System.out.println("Truoc khi tuong tac: " + ElvisNg.getAddressS());
        ElvisNg.setAddressS("HoLa");
        System.out.println("Sau khi tuong tac: " + ElvisNg.getAddressS());
        // object MonHoc
        System.out.println("Mon hoc yeu thich nhat la: " + Sem2.getTenMonhoc());
        Sem2.setTenMonhoc("Toan roi rac");
        System.out.println("Mon hoc kho nhat la: " + Sem2.getTenMonhoc());
        
        // in thong tin
        System.out.println(TuanVm.toString());
        System.out.println(ElvisNg.toString());
        System.out.println(Sem2.toString());
    }
}
