// calculate power of a number

import java.util.Scanner;
public class Power 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
         int p,n,i,result=1;

        System.out.println("Enter any number");
        n=sc.nextInt();
       
        System.out.println("Enter the power");
        p=sc.nextInt();
       
       
        for(i=1; i<=p; i++)
        {
            result = n*result;
        }
        System.out.println(result);
    }
    
}
