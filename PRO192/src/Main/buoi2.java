/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import java.util.Scanner;
/**
 *
 * @author DELL
 */

public class buoi2 
{
    public static void main(String[] args) 
    {
        // khởi tạo 1 object đến từ class buoi2 -> object là tên của con chó -> class là con chó
        Scanner sc = new Scanner (System.in); //sc la objeact cua thang Scanner -> la class
        //System.in la mot cong cu de doc du lieu
        //dau cham la goi ra nhung tinh nang ma minh muon gan vao bien
        System.out.println("Input X: ");
        int x = Integer.parseInt(sc.nextLine());
        //System.out.println("x = " + x);
        // char = Character - 1 ki tu
        // string - 1 chuoi character
        //sc.nextLine(); //enter duoc hieu nhu la mot ki tu
        System.out.println("Name: ");
        String name = sc.nextLine(); // khong nhat thiet phai su dung thang nay
        System.out.println("Your name is " + name);
        //Parse -> chuyen doi string sang mot gia tri -> xu ly duoc thang troi lenh
        //vi du ve cach hoat dong cua parse
        //String c = "6";
        //int d = Integer.parseInt(c);
        //System.out.println(d);
        //tha vi nhap int thi nhap chuoi roi dung luon cai parse nay
    }
}
