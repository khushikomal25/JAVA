// CALCULATOR using if, else-if condition ...

import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);

        int a,b,r=0;
        System.out.println("Enter two numbers");
        a=sc.nextInt();
        b=sc.nextInt();

        System.out.println("Select operation");
        r=sc.nextInt();

        if(r==1){
            r = a+b;
            System.out.println("Addition = "+r);
        }
         else if (r==2){
            r=a-b;
            System.out.println("Substraction = "+r);
        }
        else if (r==3){
            r=a*b;
            System.out.println("multiplication = "+r);
        }
        else if (r==4){
            r=a/b;
            System.out.println("Division = "+r);
        }
        else{
        r=a%b;
        System.out.println("remainder = "+r);
        }
     }
}
