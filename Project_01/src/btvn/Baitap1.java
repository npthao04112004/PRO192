package btvn;

/**
 *
 * @author DELL
 */


public class Baitap1 {
    
    //ham kiem tra so nguyen to
    static boolean checkSonguyento(int a) 
    {
        if (a <= 1) 
        {
            return false;
        }
        for (int i = 2; i * i <= a; i++) 
        {
            if (a % i == 0) 
            {
                return false;
            }
        }
        return true;
    }
    
    //ham kiem tra so le
    static boolean checkSole(int b) 
    {
        return b % 2 != 0;
    }
    
    //ham kiem tra ca hai truong hop
    static boolean checkHaitruonghop(int a, int b) 
    {
        return checkSonguyento(a) && checkSole(b);
    }
    
    public static void main(String[] args) 
    {
        int[] numbersA = {4, 19, 17, 13, 22, 31}; 
        int[] numbersB = {11, 6, 4, 7, 12, 3};   
        
        for (int i = 0; i < numbersA.length; i++) 
        {
            int a = numbersA[i];
            int b = numbersB[i];
            
            if (checkHaitruonghop(a, b)) 
            {
                System.out.println(a + " la so nguyen to va " + b + " la so le");
            } 
            else 
            {
                System.out.println(a + " khong phai la so nguyen to hoac " + b + " khong phai la so le");
            }
        }
    }
}
