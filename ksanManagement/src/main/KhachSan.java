/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.ArrayList;
import java.util.Scanner;
import model.KSan;

/**
 *
 * @author DELL
 */
public class KhachSan {
    
    public static final ArrayList<KSan> listKSan = new ArrayList<>();
    
     public static void themKhach(KSan[] newKhach, int n) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Ho va ten: ");
            String hoTen = sc.nextLine();
            System.out.print("Tuoi: ");
            int tuoi = sc.nextInt();
            sc.nextLine();
            System.out.print("CMND: ");
            String CMND = sc.nextLine();
            System.out.print("So ngay thue: ");
            int soNgayThue = sc.nextInt();
            sc.nextLine();
            System.out.print("Loai phong: ");
            String loaiPhong = sc.nextLine();
            newKhach[i] = new KSan(loaiPhong, soNgayThue, hoTen, tuoi, CMND);
        }
    }
     
    public static void thongTinKhach() {
        for (int i = 0; i < listKSan.size(); i++) {
            System.out.println(listKSan.get(i).toString());
        }
    }
    
    public static void xoaKhach(String CMND) {
        int flag = 0;
        for (int i = 0; i < listKSan.size(); i++) {
            if (listKSan.get(i).getCMND().equalsIgnoreCase(CMND)) {
                listKSan.remove(i);
                flag = 1;
            }
        }
        if (flag == 0) {
            System.out.println("Khong ton tai CMND!");
        }
    }
    
     public static void tongTien(String CMND) {
        int flag = 0;
        int soTienPhong = 0;
        String name = null;
        for (int i = 0; i < listKSan.size(); i++) {
            if (listKSan.get(i).getCMND().equalsIgnoreCase(CMND)) {
                int a = listKSan.get(i).getSoNgayThue();
                name = listKSan.get(i).getHoTen();
                if (listKSan.get(i).getLoaiPhong().equalsIgnoreCase("A")) 
                {
                    soTienPhong = 500 * a;
                } 
                else if (listKSan.get(i).getLoaiPhong().equalsIgnoreCase("B")) 
                {
                    soTienPhong = 300 * a;
                } 
                else if (listKSan.get(i).getLoaiPhong().equalsIgnoreCase("C")) 
                {
                    soTienPhong = 100 * a;
                }
                flag = 1;
            }
        }
        if (flag == 1) 
        {
            System.out.println("So tien cua " + name + " la: " + soTienPhong + "VND");
        } 
        else 
        {
            System.out.println("Khong ton tai CMNd!");
        }
    }
    
    public static void main(String[] args) {
        KSan khach_1 = new KSan("A", 3, "Nguyen Phuong Thao", 20, "123456789");
        KSan khach_2 = new KSan("B", 4, "Truong Ngoc Anh", 18, "012345678");
        KSan khach_3 = new KSan("C", 7, "Nguyen Van A", 19, "234567891");
        listKSan.add(khach_1);
        listKSan.add(khach_2);
        listKSan.add(khach_3);
        
        int choice;
        Scanner input = new Scanner(System.in);
        do{
           System.out.println("==============MENU==============");
            System.out.println("1. Them thong tin ");
            System.out.println("2. In thong tin");
            System.out.println("3. Xoa thong tin");
            System.out.println("4. Tong tien");
            System.out.println("5. Exit");
            System.out.print("Lua chon: ");
            choice = input.nextInt();
            input.nextLine();
            switch (choice) {
                case 1:
                    Scanner sc = new Scanner(System.in);
                    System.out.print("So khach hang muon them ");
                    int n = sc.nextInt();
                    KSan[] newKhach = new KSan[n];
                    themKhach(newKhach, n);
                    for (int i = 0; i < n; i++) {
                        listKSan.add(newKhach[i]);
                    }
                    break;
                case 2:
                    thongTinKhach();
                    break;
                case 3:
                    Scanner nhapvao = new Scanner(System.in);
                    System.out.print("CMND: ");
                    String s = nhapvao.nextLine();
                    xoaKhach(s);
                    break;
                case 4:
                    Scanner dienvao = new Scanner(System.in);
                    System.out.print("Nhập CMND: ");
                    String string = dienvao.nextLine();
                    tongTien(string);
                    break;

                case 5:
                    System.out.println("Exit.");
                    break;
                default:
                    System.out.println("vui long chon tu 1 - 5.");
            }
            
        }while(choice != 5);
    }
}
