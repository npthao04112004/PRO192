/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author DELL
 */
public class GiaoVien {
    
    //dinh nghia enity
    private String idGV, nameGV, phoneNumberGV, addressGV;
    
    //constructor
    public GiaoVien(String idGV, String nameGV, String phoneNumberGV, String addressGV) {
        this.idGV = idGV;
        this.nameGV = nameGV;
        this.phoneNumberGV = phoneNumberGV;
        this.addressGV = addressGV;
    }
    
    //getter/setter
    public String getIdGV() {
        return idGV;
    }

    public void setIdGV(String idGV) {
        this.idGV = idGV;
    }

    public String getNameGV() {
        return nameGV;
    }

    public void setNameGV(String nameGV) {
        this.nameGV = nameGV;
    }

    public String getPhoneNumberGV() {
        return phoneNumberGV;
    }

    public void setPhoneNumberGV(String phoneNumberGV) {
        this.phoneNumberGV = phoneNumberGV;
    }

    public String getAddressGV() {
        return addressGV;
    }

    public void setAddressGV(String addressGV) {
        this.addressGV = addressGV;
    }
    
    //in thong tin
    @Override
    public String toString() {
        return "GiaoVien" + "-" + idGV + " :" + nameGV;
    }
    
}
