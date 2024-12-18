// to print  even number and their sum

import java.util.Scanner;
public class sum_even {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,i,s=0;
        System.out.println("Enter range");
        n=sc.nextInt();
        for(i=2; i<=n; i=i+2){
            System.out.println(i);
            s=s+i;
        }
        System.out.println("Sum of even number ="+s);
    }
    
}
