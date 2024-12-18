//    weekend using switch...

import java.util.Scanner;
public class weekend {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);

        int n;
        System.out.println("Enter code of day");
        n = sc.nextInt();

        switch(n){
            case 0 : System.out.println("Sunday");
            break;
            case 1 : System.out.println("Monday");
            break;
            case 2 : System.out.println("Tuesday");
            break;
            case 3 : System.out.println("Wedday");
            break;
            case 4 : System.out.println("Thursday");
            break;
            case 5 : System.out.println("Friday");
            break;
            case 6 : System.out.println("Saturday");
            break;
            default : System.out.println("Invalid code");
            break;
        }
    }
    
}
