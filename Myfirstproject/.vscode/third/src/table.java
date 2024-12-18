// write table of any number...

import java.util.Scanner;
public class table 
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner (System.in);
        int n,i,t=0;
        System.out.println("Enter the number");
        n = sc.nextInt();

        for(i=1; i<=10; i++){
            t=n*i;
            System.out.println(n+" * "+i+" = "+t);
        }
     }
}
