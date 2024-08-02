
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class Menu {
    private int luachon;
    private Scanner input = new Scanner(System.in);
    
    public int int_getChoice(ArrayList<String> options){
        int n = options.size();
        for (int i = 0; i < n; i++) {
            System.out.println(options.get(i));
        }
        System.out.println("Enter selection:");
        luachon = input.nextInt();
        input.nextLine();
        return luachon;
    }
}
