/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class MyString implements IString{

    @Override
    public int f1(String string) {
        int count = 0;
        String[]word = string.split("\\s+");
        for (String string1 : word) {
            if(string1.matches(".*[a-zA-Z]+.*")){
                count++;
            }
        }
        return count;
    }

    @Override
    public String f2(String string) {
        String[] str = string.split("\\s+");
        String result = "";
        for(int i = 0; i < str.length - 1; i++){
            result += str[i] + "";
        }
        return result;
    }
}
