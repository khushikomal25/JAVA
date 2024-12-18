// Swaping values without using third variable...

import java.util.Scanner;
public class Swap_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int a,b;
        System.out.println("Enter numbers for swaping");  
        a = sc.nextInt();   //100
        b = sc.nextInt();   //200
        
        System.out.println("Before Swaping "+a+" "+b);   // 100 200
        a = a+b;   // a=100+200=300
        b = a-b;   // b= 300-200=100
        a = a-b;   // a= 300-100=200
        System.out.println("After Swaping "+a+" "+b);   // 200 100
     }
}
