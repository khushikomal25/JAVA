// Print ASCII value of character

import java.util.Scanner;
public class value_ASCII 
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        char ch;
        System.out.println("Enter any character");
        ch=sc.next().charAt(0);

        int a =ch;
        System.out.println("ASCII value of " +ch+ " is " +a);
        
    }
}