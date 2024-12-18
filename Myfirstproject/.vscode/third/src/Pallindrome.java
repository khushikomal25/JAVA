//  pallindrome = 12321,121,1456541...

import java.util.Scanner;
public class Pallindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int n,d,c,s=0;
        System.out.println("Enter any number");
        n = sc.nextInt();  // 121
        c=n;  //121   ?? why this line is imp..
        while(n>0){
            d = n%10;  // 1   2  1
            n = n/10;   // 12  1  0 
            s = (s*10)+d;  // 1  12  121
        }
        System.out.println(s);

        if (c==s){
            System.out.println("Pallindrome");}
        else
             System.out.println("Not pallindrome");
            
    }
    
}
