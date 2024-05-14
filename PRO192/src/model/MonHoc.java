/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author DELL
 */
public class MonHoc {
    
    //ding nghia enity
    private String idMonHoc, tenMonhoc;
    
    //constructor
    public MonHoc(String idMonHoc, String tenMonhoc) {
        this.idMonHoc = idMonHoc;
        this.tenMonhoc = tenMonhoc;
    }
    
    //getter/setter
    public String getIdMonHoc() {
        return idMonHoc;
    }

    public void setIdMonHoc(String idMonHoc) {
        this.idMonHoc = idMonHoc;
    }

    public String getTenMonhoc() {
        return tenMonhoc;
    }

    public void setTenMonhoc(String tenMonhoc) {
        this.tenMonhoc = tenMonhoc;
    }
    
    //in thong tin
    @Override
    public String toString() {
        return "MonHoc" + "-" + idMonHoc + " :" + tenMonhoc;
    }
}
