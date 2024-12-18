// perfect no= when factors of number is equal to the number.
// eg- 6=1+2+3,  28=1+2+4+7+14

import java.util.Scanner;
public class Perfect_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int n,i,s=0;
        System.out.println("Enter any number");
        n = sc.nextInt();
        for(i=1; i<n; i++){
            if (n%i==0){
                s = s+i;
            }
        }
        if(n==s)
        System.out.println("Perfect number");
        else
        System.out.println("Not perfect number");
    }
}
