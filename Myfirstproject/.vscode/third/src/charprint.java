//to print a character


import java.util.Scanner;
public class charprint {
    public static void main(String[] args)
     {
        Scanner sc=new Scanner (System.in);
        char ch;
        
        System.out.println("Enter the character");
        ch=sc.next().charAt(4);
      
        System.out.println(ch);
    }
    
}
