//to check vowel and consonent

import java.util.Scanner;
public class vowel {
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
        char ch;
       
        System.out.println("Enter the character");
        ch=sc.next().charAt(0);

        if( ch=='a' || ch=='e' || ch=='i'|| ch=='o' || ch=='u' || ch=='A' || ch=='E'|| ch=='I' ||
        ch=='O' || ch=='U'){
            System.out.println("The character is vowel");
        }
       
        else{
        System.out.println("The character is consonent");
       }
    }
}
