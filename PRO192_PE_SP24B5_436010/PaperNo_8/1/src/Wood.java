/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class Wood {
    private String source;
    private int year;

    public Wood() {
    }

    public Wood(String source, int year) {
        this.source = source;
        this.year = year;
    }

    public String getSource() {
        int n = this.source.length();
        String s = "";
        s += this.source.substring(0, n - 1);
        return s;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        int newYear = this.year;
        this.year = year - newYear;
    }
    
}
