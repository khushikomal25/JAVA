import java.util.Scanner;
public class Arithmatic_Error {
    public static void main(String[] args) {
        int a,b,c=0;
        System.out.println("Enter two numbers");
        Scanner sc=new Scanner (System.in);
        try{
            a=sc.nextInt();
            b=sc.nextInt();
            c=a/b;
            System.out.println(c);
        }
        catch(ArithmeticException ex)
        {
            System.out.println("Error in decision");
        }
    }
}
