import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,s=0;
        System.out.println("Enter numbers");
        do{
        n = sc.nextInt();
        s=s+n;
        }while(n!=0);
        System.out.println("Sum = "+s);
        }
}
