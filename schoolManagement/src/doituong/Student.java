/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doituong;

/**
 *
 * @author DELL
 */
public class Student extends DoiTuong {
    String Lop;
    String Ban;
    
    public Student(String MaDoiTruong, String TenDoiTuong, boolean GioiTinhDoiTuong, String yob, String Lop, String Ban) {
        super(MaDoiTruong, TenDoiTuong, GioiTinhDoiTuong, yob);
        this.Lop = Lop;
        this.Ban = Ban;
    }

    public String getLop() {
        return Lop;
    }

    public void setLop(String Lop) {
        this.Lop = Lop;
    }

    public String getBan() {
        return Ban;
    }

    public void setBan(String Ban) {
        this.Ban = Ban;
    }

    
    public String toString() {
        return "Student{"+ " " + MaDoiTruong + " " + TenDoiTuong + " " + GioiTinhDoiTuong + " " + yob + " " + Lop + " " + Ban + '}';
    }
}
