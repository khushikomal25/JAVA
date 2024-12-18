//  add 1 to each number...123 --> 234

import java.util.Scanner;
public class add_1_toeach {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int n,x,i=1;
        System.out.println("Enter any number");
        n = sc.nextInt();   //123
        x=n;   //123

        while(n!=0){
            x=x+1*i;    // 123+1*1=124     
            n=n/10;    // 123/10=12     
            i=i*10;    // i=1*10        
        }
        System.out.println(x);

     }
}
