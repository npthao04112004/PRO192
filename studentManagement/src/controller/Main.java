/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import java.util.Scanner;
import model.SinhVien;

/**
 *
 * @author DELL
 */
public class Main {
    private static ArrayList <SinhVien> listSinhVien = new ArrayList <> ();
    private static Scanner sc = new Scanner (System.in);
    
    //chuc nang them sinh vien
    public static void themSinhVien(ArrayList<SinhVien> listSinhVien, Scanner scanner) {
        //bat dau nhap
        System.out.println("Nhap ma sinh vien");
        String idStudent = sc.nextLine();
        System.out.println("Nhap ten sinh vien");
        String nameStudent = sc.nextLine();
        System.out.println("Nhap gioi tinh sinh vien");
        String genderStudent = sc.nextLine();
        System.out.println("Nhap nganh hoc sinh vien");
        String majorStudent = sc.nextLine();
        // tao object sinh vien
        SinhVien SinhVienMoi = new SinhVien(idStudent, nameStudent, genderStudent, majorStudent);
        listSinhVien.add(SinhVienMoi);
        System.out.println("Them sinh vien thanh cong");
    }
    
    //chuc nang xoa sinh vien
    public static void xoaSinhVien(ArrayList<SinhVien> listSinhVien, Scanner scanner) {
        //bat dau nhap
        System.out.println("Nhap ma sinh vien can xoa");
        String idStudent = sc.nextLine();
        boolean timDuoc = false;
        //tim sinh vien can xoa -> ham for - each
        for (SinhVien i : listSinhVien)
        {
            if(i.getIdStudent().equals(idStudent))
            {
                listSinhVien.remove(i);
                timDuoc = true;
                break;
            }
        }
        //khong tim duoc
        if (!timDuoc)
        {
            System.out.println("Khong tim thay ma sinh vien hop le");
        }
    }
    
    //chuc nang sua thong tin sinh vien
    public static void suaSinhVien(ArrayList<SinhVien> listSinhVien, Scanner scanner) {
        //bat dau nhap
        System.out.println("Nhap ma sinh vien can sua");
        String idStudent = sc.nextLine();
        boolean timDuoc = false;
        //tim sinh vien can sua -> ham for - each
        for (SinhVien i : listSinhVien)
        {
            if(i.getIdStudent().equals(idStudent))
            {
                System.out.println("Nhap ten moi");
                String nameStudent = sc.nextLine();
                System.out.println("Nhap gioi tinh moi");
                String genderStudent = sc.nextLine();
                System.out.println("Nhap nganh hoc moi");
                String majorStudent = sc.nextLine();
                
                //gan thong tin sua
                i.setNameStudent(nameStudent);
                i.setGenderStudent(genderStudent);
                i.setMajorStudent(majorStudent);
                
                timDuoc = true;
                break;
            }
        }
        //khong tim duoc
        if (!timDuoc)
        {
             System.out.println("Khong tim thay ma sinh vien hop le");
        }
    }
    
    //chuc nang in sinh vien theo gioi tinh
    public static void inSinhVienTheoGioiTinh(String genderStudent) {
        for (SinhVien i : listSinhVien)
        {
            if (i.getGenderStudent().equalsIgnoreCase(genderStudent))
            {
                System.out.println(i);
            }
        }
    }
    
    public static void main(String[] args) {
        //tao Menu de lua chon tinh nang
        int choice;
        do
        {
            System.out.println("======MENU LUA CHON TINH NANG======");
            System.out.println("1. Them sinh vien");
            System.out.println("2. Xoa sinh vien");
            System.out.println("3. Sua thong tin sinh vien");
            System.out.println("4. In thong tin sinh vien");
            System.out.println("5. In toan bo sinh vien nam");
            System.out.println("6. In toan bo sinh vien nu");
            System.out.println("0. Thoat");
            System.out.println("Chon chuc nang");
            choice = Integer.parseInt(sc.nextLine());
            
            //su dung switch - case
            switch (choice)
            {
                case 1:
                    themSinhVien(listSinhVien, sc);
                    break;
                case 2:
                    xoaSinhVien(listSinhVien, sc);
                    break;
                case 3:
                    suaSinhVien(listSinhVien, sc);
                    break;
                case 4:
                    for(SinhVien i : listSinhVien)
                    {
                        System.out.println(listSinhVien + " ");
                    }
                    break;
                case 5:
                    inSinhVienTheoGioiTinh("Nam");
                    break;
                case 6:
                    inSinhVienTheoGioiTinh("Nu");
                    break;
                case 0:
                    System.out.println("Thaot chuong trinh");
                    break;
                default:
                    System.out.println("Lua chon khong hop le");
            }
        }while (choice != 0);
    }
}
