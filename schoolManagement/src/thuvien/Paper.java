/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuvien;

/**
 *
 * @author DELL
 */
public class Paper extends ThuVien {
    
    int taiBan;

    public Paper(String MaTaiLieu, String tenTL, String NXB, int taiBan) {
        super(MaTaiLieu, tenTL, NXB);
        this.taiBan = taiBan;
    }

    public void setTaiBan(int taiBan) {
        this.taiBan = taiBan;
    }

    @Override
    public String toString() {
        return "Paper{" + " " + MaTaiLieu + " " + tenTL + " " + NXB + " " + taiBan + " " + '}';
    }
    
}
