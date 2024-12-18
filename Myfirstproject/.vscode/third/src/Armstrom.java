// Armstrom number = 153= 1+125+27=153
// code is only valid for 3 digit number

import java.util.Scanner;
public class Armstrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int n,d,x,s=0;
        System.out.println("Enter any number");
        n = sc.nextInt();
        x=n;
        while(n>0){
            d = n%10;
            n = n/10;
            s = s + d*d*d;
        }
        if (x==s)
        System.out.println("Armstrom number");
        else
        System.out.println("Not Armstrom number");
    }
}
