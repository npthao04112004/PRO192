/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author DELL
 */
public class SinhVien {
    
    //dinh nghia enity
    private String idStudent, nameStudent, genderStudent, majorStudent;
    
    //constructor
    public SinhVien(String idStudent, String nameStudent, String genderStudent, String majorStudent) {
        this.idStudent = idStudent;
        this.nameStudent = nameStudent;
        this.genderStudent = genderStudent;
        this.majorStudent = majorStudent;
    }
    
    //getter/setter
    public String getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(String idStudent) {
        this.idStudent = idStudent;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public String getGenderStudent() {
        return genderStudent;
    }

    public void setGenderStudent(String genderStudent) {
        this.genderStudent = genderStudent;
    }

    public String getMajorStudent() {
        return majorStudent;
    }

    public void setMajorStudent(String majorStudent) {
        this.majorStudent = majorStudent;
    }

    //in thong tin ->t toString
    @Override
    public String toString() {
        return "SinhVien{" + "idStudent=" + idStudent + ", nameStudent=" + nameStudent + ", genderStudent=" + genderStudent + ", majorStudent=" + majorStudent + '}';
    }
    
}
