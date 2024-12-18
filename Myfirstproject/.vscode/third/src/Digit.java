//   To count number of digits in a number...

import java.util.Scanner;
public class Digit 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int n,c=0;
        System.out.println("Enter any number");
        n=sc.nextInt();

        while(n>0){
            n=n/10;
            c= c+1;
        }
         System.out.println("Number of digit = " +c);
    }
    
}
