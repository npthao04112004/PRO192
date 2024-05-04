/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchienscanner;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class BT02 
{
    //ham ve hinh vuong
    static void vehinhvuong (int a)
    {
        for (int i = 0; i < a; i++)
        {
            for (int j = 0; j < a; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    //ham ve hinh tam giac
    static void vehinhtamgiac (int a)
    {
        for (int i = 1; i <= a; i += 2)
        {
            for (int j = 0; j < (a - i)/ 2; j++)
            {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }   
       
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        int a;
        do
        {
            System.out.println("A = ");
            a = sc.nextInt();
        } while (a <= 0);
        
        if (a % 2 == 0)
        {
            vehinhvuong(a);
        }
        else
        {
            vehinhtamgiac(a);
        }
    }
}
