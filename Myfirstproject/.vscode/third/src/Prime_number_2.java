// prime number between two numbers...

import java.util.Scanner;
public class Prime_number_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1,n2,i,j,c=0;
        System.out.println("Enter two numbers");
        n1 = sc.nextInt();   
        n2 = sc.nextInt();   

        for(i=n1; i<=n2; i++){    
            for(j=2; j<=i; j++){   
                if(i%j==0)
                break;
            }
            if(i==j){
                c=c+1;
            System.out.print(j +" ");
            }
        }
        System.out.println();
        System.out.print("Total no. of prime no. = " +c);
    }
}
