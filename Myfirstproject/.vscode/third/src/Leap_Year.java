   //  leap year program

import java.util.Scanner;
public class Leap_Year {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int y;
        System.out.println("Enter the year");
        y = sc.nextInt();

        if(y%100==0 && y%400==0 || y%100!=0 && y%4==0){
            System.out.println("Leap year");
        }
        else{
            System.out.println("Not a leap year");
        }
    }
}
