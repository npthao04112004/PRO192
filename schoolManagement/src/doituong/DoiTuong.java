/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doituong;

/**
 *
 * @author DELL
 */
public class DoiTuong {
    //dinh nghia
    protected String MaDoiTruong;
    protected String TenDoiTuong;
    protected boolean GioiTinhDoiTuong;
    protected String yob;
    //constructor
    public DoiTuong(String MaDoiTruong, String TenDoiTuong, boolean GioiTinhDoiTuong, String yob) {
        this.MaDoiTruong = MaDoiTruong;
        this.TenDoiTuong = TenDoiTuong;
        this.GioiTinhDoiTuong = GioiTinhDoiTuong;
        this.yob = yob;
    }
    //gettet/setter
    public String getMaDoiTruong() {
        return MaDoiTruong;
    }

    public void setMaDoiTruong(String MaDoiTruong) {
        this.MaDoiTruong = MaDoiTruong;
    }

    public String getTenDoiTuong() {
        return TenDoiTuong;
    }

    public void setTenDoiTuong(String TenDoiTuong) {
        this.TenDoiTuong = TenDoiTuong;
    }

    public boolean isGioiTinhDoiTuong() {
        return GioiTinhDoiTuong;
    }

    public void setGioiTinhDoiTuong(boolean GioiTinhDoiTuong) {
        this.GioiTinhDoiTuong = GioiTinhDoiTuong;
    }

    public String getYob() {
        return yob;
    }

    public void setYob(String yob) {
        this.yob = yob;
    }
    //toString
    @Override
    public String toString() {
        return "DoiTuong{" + "MaDoiTruong=" + MaDoiTruong + ", TenDoiTuong=" + TenDoiTuong + ", GioiTinhDoiTuong=" + GioiTinhDoiTuong + ", yob=" + yob + '}';
    }  
}
