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
public class BT01 {
    
    //ham kiem tra so hoan hao
    static boolean sohoanhao (int n)
    {
        int sum = 0;
        for (int i = 1; i <= n/2; i++)
        {
            if (n % i == 0)
            {
                sum = sum + i;
            }
        }
        return sum == n;
    }
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        int a,b;
        do
        {
            System.out.println("A = ");
            a = sc.nextInt();
            System.out.println("B = ");
            b = sc.nextInt();
            System.out.println("A = " + a + " B = " + b);
        } while (a <= 0 || b <= 0);
        
        //kiem tra so thu 1
        if (sohoanhao(a))
            {
                System.out.println("A - True");
            } 
            else 
            {
                System.out.println("A - False");
            }
        
        //kiem tra so thu 2
        if (sohoanhao(b))
            {
                System.out.println("B - True");
            } 
            else 
            {
                System.out.println("B - False");
            }
    }
}
