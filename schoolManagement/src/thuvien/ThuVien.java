/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuvien;

/**
 *
 * @author DELL
 */
public class ThuVien {
    
    protected String MaTaiLieu, tenTL, NXB;

    public ThuVien(String MaTaiLieu, String tenTL, String NXB) {
        this.MaTaiLieu = MaTaiLieu;
        this.tenTL = tenTL;
        this.NXB = NXB;
    }

    public String getMaTaiLieu() {
        return MaTaiLieu;
    }

    public void setMaTaiLieu(String MaTaiLieu) {
        this.MaTaiLieu = MaTaiLieu;
    }

    public String getTenTL() {
        return tenTL;
    }

    public void setTenTL(String tenTL) {
        this.tenTL = tenTL;
    }

    public String getNXB() {
        return NXB;
    }

    public void setNXB(String NXB) {
        this.NXB = NXB;
    }

    @Override
    public String toString() {
        return "ThuVien{" + "MaTaiLieu=" + MaTaiLieu + ", tenTL=" + tenTL + ", NXB=" + NXB + '}';
    }
    
}
