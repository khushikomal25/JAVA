// to print even number of mentioned range
import java.util.Scanner;
public class even {
    public static void main(String[] args)
     {
        Scanner sc=new Scanner(System.in);
        int n;
       
        System.out.println("Enter range");
        n=sc.nextInt();
       
        for(int i=2; i<=n; i=i+2){
            System.out.println(i);
        }

    }
    
}
