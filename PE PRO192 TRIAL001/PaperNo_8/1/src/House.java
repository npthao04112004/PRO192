/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class House {
    private String type;
    private int area;

    public House() {
    }

    public House(String type, int area) {
        this.type = type;
        this.area = area;
    }

    public String getType() {
        //StringBuilder s = new StringBuilder();
        String s = "";
        int n = type.length();
        s = type.substring(n - 3, n - 2) + type.substring(n - 2, n - 1) + type.substring(n - 1);
        StringBuilder str = new StringBuilder(s);
        str.reverse();
        return str.toString();
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area * 3;
    }
}
