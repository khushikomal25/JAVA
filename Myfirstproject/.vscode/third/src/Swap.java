// Swap of two numbers...

import java.util.Scanner;
public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int a,b,temp;
        System.out.println("Enter two numbers for swaping");
        a=sc.nextInt();  // 100
        b=sc.nextInt();  //200
        System.out.println("Before swaping "+a+" "+b);   // 100 200

        temp=a;  // temp=100
        a=b;     // a=200
        b=temp;   // b=100
         System.out.println("After swaping "+a+" "+b);  // 200  100

    }
    
}
