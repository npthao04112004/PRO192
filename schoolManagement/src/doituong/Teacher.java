/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doituong;

/**
 *
 * @author DELL
 */
public class Teacher extends DoiTuong {
    String MonDay, TrinhDo;
    
    public Teacher(String MaDoiTruong, String TenDoiTuong, boolean GioiTinhDoiTuong, String yob, String MonDay, String TrinhDo){
        super(MaDoiTruong, TenDoiTuong, GioiTinhDoiTuong, yob);
        this.MonDay = MonDay;
        this.TrinhDo = TrinhDo;
    }

    public String getMonDay() {
        return MonDay;
    }

    public void setMonDay(String MonDay) {
        this.MonDay = MonDay;
    }

    public String getTrinhDo() {
        return TrinhDo;
    }

    public void setTrinhDo(String TrinhDo) {
        this.TrinhDo = TrinhDo;
    }

    
    public String toString() {
        return "Teacher{" + " " + MaDoiTruong + " " + TenDoiTuong + " " + GioiTinhDoiTuong + " " + yob + " " + MonDay + " " + TrinhDo + '}';
    }
    
}
