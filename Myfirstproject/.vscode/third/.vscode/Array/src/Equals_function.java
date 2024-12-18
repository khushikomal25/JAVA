// equals funcion check weather both arrays are equal or not

import java.util.Scanner;
import java.util.Arrays;
public class Equals_function {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a1[] = new int[5];
        int a2[] = new int[5];

        System.out.print("Enter data in Array1 : ");
        for(int i=0; i<a1.length; i++){
            a1[i] = sc.nextInt();
        }

        System.out.print("Enter data in Array2 : ");
        for(int i=0; i<a2.length; i++){
            a2[i] = sc.nextInt();
        }
         
        boolean b = Arrays.equals(a1,a2);
        System.out.print("Are both arrays equal : "+b);
    }
}
