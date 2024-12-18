// Square root of any number!!!

import java.util.Scanner;
public class Square_root {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int n;
        double m;
        System.out.println("Enter any number");
        n=sc.nextInt();
        m=Math.sqrt(n);
        System.out.println("Square root of "+n+" is "+m);
    }
    
}
