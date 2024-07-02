/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class MyString implements IString{
    
    public boolean checkChuoi(String s){
//       StringBuilder s1 = new StringBuilder();
//       s1 = s1.reverse();
//       if(s1.length() >= 2 && s1.equals(s1)){
//           return true;
//       }
//        int t = s.length();
//        int r = 0;
//        if(s.charAt(t) == s.charAt(r)){
//            return true;
//        }
//        else{
//            return false;
//        }
    String clean = s.replaceAll("\\s+", "").toLowerCase();
    int length = clean.length();
    int forward = 0;
    int backward = length - 1;
    while(backward > forward){
        char forwardChar = clean.charAt(forward++);
        char bachwardChar = clean.charAt(backward--);
        if(forwardChar != bachwardChar){
            return false;
        }
    }
    return true;
    }
    
    public static boolean ishas3Num(String s){
        int count = 0;
        char[]num = s.toCharArray();
        for (char c : num) {
            if(Character.isDigit(c)){
                count++;
                if(count >= 3){
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public int f1(String string) {
        int count = 0;
        String[] arr = string.split(" ");
        for (String string1 : arr) {
            if(checkChuoi(string1) && ishas3Num(string1)){
                count++;
            }
        }
        return count;
    }
    
    
//    public static boolean isOdd(char c){
//        return Character.isDigit(c) && ((c - '0') % 2 != 0);
//    }

    @Override
    public String f2(String string) {
//        int count = 0;
//        String s = "";
//        for(int i = 0; i < string.length(); i++){
//            char x = string.charAt(i);
//            if((x - '0') % 2 != 0){
//                count++;
//            }
//            if(count == 1 && Character.isAlphabetic(string.charAt(i))){
//                s += string.charAt(i);
//            }
//        }
        StringBuilder s = new StringBuilder();
        boolean odd = false;
        for (char c : string.toCharArray()) {
            if(Character.isDigit(c)){
                if ((c - '0') % 2 == 0){
                s.append(c);
                }
                //chu le dau tien xuat hien
                else{
                    if(!odd){
                        s.append(c);
                        odd = true;
                    }
                }
            }
            else{
                s.append(c);
            }
        }
        return s.toString();
    }
}
