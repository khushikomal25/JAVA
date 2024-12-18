//   copy elements of array into another array...

import java.util.Scanner;
public class Copy_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a[] = new int [5];
        int b[] = new int[5];
        System.out.print("Enter elements of a[] : ");
         for(int i=0; i<5; i++){
            a[i] = sc.nextInt();
        }
        System.out.print("a[] = ");
        for(int i=0; i<5; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println(" ");
        System.out.print("b[] = ");
        for(int i=0; i<5; i++){
            b[i]=a[i];
            System.out.print(b[i]+" ");
        }
    }
}
