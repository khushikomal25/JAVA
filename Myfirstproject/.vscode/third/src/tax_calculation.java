//    Tax calculation program...

import java.util.Scanner;
public class tax_calculation {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);

        int sal;
        double tax=0, net_sal;
        System.out.println("Enter your salary");
        sal=sc.nextInt();

        if(sal<10000){
            System.out.println("your salary after tax = " +sal );
            System.out.println("No Tax applied");
        }

        else if(sal>10000 && sal<=100000){
            tax = 0.10*sal;
            net_sal= sal-tax;
            System.out.println("ur salaray after tax = " +net_sal);
            System.out.println("Tax = "+tax);
        }

        else{
            tax = 0.20*sal;
            net_sal = sal-tax;
            System.out.println("ur salary after tax = " + net_sal);
            System.out.println("Tax = "+tax);
        }
    }
}
