// Find area of triangle...

import java.util.Scanner;
import java.lang.Math;
public class Area_Triangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int a,b,c,sp;
        double area;
        System.out.println("Enter sides of triangle");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        sp = (a+b+c)/2;
        area = Math.sqrt(sp*(sp-a)*(sp-b)*(sp-c));
        
        System.out.println("Area of Triangle = "+ area);

    }
    
}
