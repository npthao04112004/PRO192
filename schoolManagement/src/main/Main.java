/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import doituong.Student;
import doituong.Teacher;
import java.util.ArrayList;
import java.util.Scanner;
import thuvien.Book;
import thuvien.Paper;

/**
 *
 * @author DELL
 */
public class Main {
    
    private static final ArrayList <Teacher> listTeacher = new ArrayList <> ();
    private static final ArrayList <Student> listStudent = new ArrayList <> ();
    private static final ArrayList <Book> listBook = new ArrayList <> ();
    private static final ArrayList <Paper> listPaper = new ArrayList <> ();
    private static final Scanner sc = new Scanner (System.in);
    
    //chuc nang them hoc sinh
    public static void themHocSinh(ArrayList<Student> listStudent, Scanner scanner) {
        //bat dau nhap
        System.out.println("Nhap ma hoc sinh");
        String maHocSinh = sc.nextLine();
        //kiem tra hoc sinh da co trong danh sach chua
        for (Student i : listStudent)
        {
            if (i.getMaDoiTruong().equals(maHocSinh))
            {
                System.out.println("Hoc sinh da ton tai trong danh sach");
                return;
            }
        }
        System.out.println("Nhap ten hoc sinh ");
        String tenHocSinh = sc.nextLine();
        System.out.println("Nhap gioi tinh hoc sinh (True: Nu/ False: Nam");
        boolean gioitinhHocSinh = sc.nextBoolean();
        sc.nextLine();
        System.out.println("Nhap yob hoc sinh");
        String yob = sc.nextLine();
        System.out.println("Nhap lop hoc sinh");
        String lopHocSinh = sc.nextLine();
        System.out.println("Nhap ban hoc sinh");
        String banHocSinh = sc.nextLine();        
        // tao object hoc sinh
        Student HocSinhMoi = new Student(maHocSinh, tenHocSinh, gioitinhHocSinh, yob, lopHocSinh, banHocSinh);
        listStudent.add(HocSinhMoi);
        System.out.println("Them hoc sinh thanh cong");
    }
    
     //chuc nang them giao vien
    public static void themGiaoVien(ArrayList<Teacher> listTeacher, Scanner scanner) {
        //bat dau nhap
        System.out.println("Nhap ma giao vien");
        String maGiaoVien = sc.nextLine();
        //kiem tra xem giao vien da co trong dah sach chua
        for (Teacher i : listTeacher)
        {
            if (i.getMaDoiTruong().equals(maGiaoVien))
            {
                System.out.println("Giao vien da ton tai trong danh sach");
                return;
            }
        }
        System.out.println("Nhap ten giao vien ");
        String tengiaoVien = sc.nextLine();
        System.out.println("Nhap gioi tinh giao vien (True: Nu/ False: Nam");
        boolean gioitinhGiaoVien = sc.nextBoolean();
        sc.nextLine();
        System.out.println("Nhap yob hoc sinh");
        String yob = sc.nextLine();
        System.out.println("Nhap mon day");
        String monGiaoVien = sc.nextLine();
        System.out.println("Nhap trinh do");
        String trinhdoGiaoVien = sc.nextLine();        
        // tao object giao vien
        Teacher GiaoVienMoi = new Teacher(maGiaoVien, tengiaoVien, gioitinhGiaoVien, yob, monGiaoVien , trinhdoGiaoVien);
        listTeacher.add(GiaoVienMoi);
        System.out.println("Them giao vien thanh cong");
    }
    
     //chuc nang them sach
    public static void themSach(ArrayList<Book> listBook, Scanner scanner) {
        //bat dau nhap
        System.out.println("Nhap ma sach");
        String maSach = sc.nextLine();
        //kiem tra xem sach da co trong danh sach chua
        for (Book i : listBook)
        {
            if (i.getMaTaiLieu().equals(maSach))
            {
                System.out.println("Sach da ton tai trong danh sach");
                return;
            }
        }
        System.out.println("Nhap ten sach ");
        String tenSach = sc.nextLine();
        System.out.println("Nhap so trang (so nguyen duong) ");
        int soTrang = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap NXB");
        String NXB_Sach = sc.nextLine();
        // tao object sach
        Book SachMoi = new Book(maSach, tenSach, NXB_Sach, soTrang);
        listBook.add(SachMoi);
        System.out.println("Them sach thanh cong");
    }
    
     //chuc nang them sach
    public static void themTaiLieu(ArrayList<Paper> listPaper, Scanner scanner) {
        //bat dau nhap
        System.out.println("Nhap ma tai lieu");
        String maTaiLieu = sc.nextLine();
        //kiem tra xem tai lieu da co trong danh sach chua
        for (Paper i : listPaper)
        {
            if (i.getMaTaiLieu().equals(maTaiLieu))
            {
                System.out.println("Tai lieu da ton tai trong danh sach");
                return;
            }
        }
        System.out.println("Nhap ten sach ");
        String tenTaiLieu = sc.nextLine();
        System.out.println("Nhap nam tai ban (so nguyen duong) ");
        int namTaiBan = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap NXB");
        String NXB_TaiLieu = sc.nextLine();
        // tao object tai lieu
        Book SachMoi = new Book(maTaiLieu, tenTaiLieu, NXB_TaiLieu, namTaiBan);
        listBook.add(SachMoi);
        System.out.println("Them tai lieu thanh cong");
    }
    
    //hien thi toan bo DoiTuong
    private static void hienThiDoiTuong(ArrayList<Student> listStudent,ArrayList<Teacher> listTeacher) 
    {
        System.out.println("Toan bo hoc sinh");
        for (Student i : listStudent) 
        {
            System.out.println(i.toString());
        }

        System.out.println("Toan bo giao vien");
        for (Teacher j : listTeacher) 
        {
            System.out.println(j.toString());
        }
    }
    
    //hien thi thong tin sach hoac tai lieu co trong ThuVien
    private static void hienThiSachHoacTaiLieu(ArrayList<Book> listBook,ArrayList<Paper> listPaper, Scanner scanner) 
    {
        int choice;
        System.out.println("Nhap yeu cau (1. In sach / 2. In Tai Lieu)");
        choice = Integer.parseInt(sc.nextLine());
        //dung lenh if
        if (choice == 1)
        {
            System.out.println("Thong tin toan bo sach co trong du lieu");
            for (Book i : listBook )
            {
                System.out.println(i.toString());
                return;
            }
        }
        else if (choice == 2)
        {
            System.out.println("Thong tin toan bo tai lieu co trong du lieu");
            for (Paper i : listPaper)
            {
                System.out.println(i.toString());
            }
        }
    }
    
    public static void main(String[] args) {
        int choice;
        //tao menu
        do
        {
            System.out.println("======MENU LUA CHON TINH NANG======");
            System.out.println("1. Them Hoc Sinh ");
            System.out.println("2. Them Giao Vien");
            System.out.println("3. Them Book");
            System.out.println("4. Them Paper");
            System.out.println("5. Hien thi ra tat ca cac DoiTuong");
            System.out.println("6. Hien thi ra tat ca Book hoac Paper trong ThuVien");
            System.out.println("0. Thoat");
            System.out.println("Chon chuc nang");
            choice = Integer.parseInt(sc.nextLine());
            
            switch (choice)
            {
                case 1:
                    themHocSinh(listStudent, sc);
                    break;
                case 2:
                    themGiaoVien(listTeacher, sc);
                    break;
                case 3:
                    themSach(listBook, sc);
                    break;
                case 4:
                    themTaiLieu(listPaper, sc);
                    break;
                case 5:
                    hienThiDoiTuong(listStudent, listTeacher);
                    break;
                case 6:
                    hienThiSachHoacTaiLieu(listBook, listPaper, sc);
                    break;
                case 0:
                    System.out.println("Thoat");
                    break;
                default:
                    System.out.println("Lua chon khong phu hop, yeu cau nhap lai");
                    break;
            }
        }while (choice != 0);
    }
}
