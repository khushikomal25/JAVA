//to print odd, even number and their sum too 

import java.util.Scanner;
public class sum_oddeven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,i,s=0;
        System.out.println("Enter the range");
        n=sc.nextInt();
         for(i=0; i<=n; i=i+2){
                System.out.println(i);
                s=s+i;
            }
            System.out.println("Sum of even number = "+s);
        for(i=1; i<=n; i=i+2){
            System.out.println(i);
            s=s+i;
         }
         System.out.println("sum of odd number ="+s);
     }
}
