// find sum of ARRAY elements...

import java.util.Scanner;
public class Array_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int sum=0;
        int num[] = new int[5];
        System.out.print("Enter elements of array : ");
        for(int i=0; i<num.length; i++){
            num[i] = sc.nextInt();
        }
        System.out.print("Elements of num[i] = ");
        for (int i=0; i<num.length; i++){
        System.out.print(num[i]+" ");
        }

        System.out.println(" ");
        for(int i=0; i<num.length; i++){
            sum = sum + num[i];
        }
        System.out.println("Sum of array elements = "+sum);
    }
    
}
