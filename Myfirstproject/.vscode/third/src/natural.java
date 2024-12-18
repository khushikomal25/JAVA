// to print natural number

import java.util.Scanner;
public class natural {
    public static void main(String[] args) {
        int n;
        
        System.out.println("Enter number of terms");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        
        for(int i=1; i<=n; i++){
            
         System.out.println(i);
        }
     }
}
