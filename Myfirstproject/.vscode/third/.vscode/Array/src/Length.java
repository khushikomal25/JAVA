//   Length of array...

import java.util.Scanner;
public class Length {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int num[] = new int [3];
        System.out.print("Enter elements in array: ");

        for(int i=0; i<num.length; i++){
            num[i] = sc.nextInt();
        }
        System.out.print("Array elements: ");
        for(int i=0; i<num.length; i++){
            System.out.print(num[i]+" ");
        }
        System.out.println(" ");
        System.out.println("Array length = "+num.length);
    }
    
}
