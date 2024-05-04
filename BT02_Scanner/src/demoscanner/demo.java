/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demoscanner;

import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class demo {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        //nhap ten nguoi dung
        System.out.println("Name: ");
        String name = sc.nextLine();
        //nhap tuoi nguoi dung
        System.out.println("Age: ");
        int age = sc.nextInt();
        sc.nextLine();// fix loi
        //nhap dia chi nguoi dung
        System.out.println("Address: ");
        String address = sc.nextLine();
        //nhap so dien thoai cua nguoi dung
        System.out.println("Phone Number: ");
        String phone = sc.nextLine(); //tranh loi mat so 0
        //nhap chuyen nganh cua nguoi dung
        System.out.println("Major: ");
        String major = sc.nextLine();
        //in ra toan bo thong tin
        System.out.println("=======Personal Information======");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("Phone Number: " + phone);
        System.out.println("Major: " + major);
        System.out.println("=======End======");
    }
    
}
