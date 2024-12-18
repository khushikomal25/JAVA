//   checking Prime number

import java.util.Scanner;
public class Prime_number {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int n,i,c=0;
        System.out.println("Enter any number");
        n=sc.nextInt();
        for(i=1; i<=n; i++){
            if(n%i==0){
                c++;
            }
         }
         if (c==2)
         System.out.println("Prime number");
         else
         System.out.println("Not a prime number");
    }
}
