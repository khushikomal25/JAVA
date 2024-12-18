import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int f=1,n,i;
        System.out.println("Enter any number");
        n= sc.nextInt();
         if (n>0){
            for (i=1; i<=n; i++) {
                f =f*i ;
                 }
             System.out.println(f);
            }

        else if (n==0) {
            System.out.println("1");
        }
        else
            System.out.println("invalid number");
    }
}

