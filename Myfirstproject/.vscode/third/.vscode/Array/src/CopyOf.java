// CopyOf is uesd to one array into another...

import java.util.Scanner;
import java.util.Arrays;
public class CopyOf {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a[] = new int[5];
        System.out.print("Enter data in array : ");
        for(int i=0; i<a.length; i++){
            a[i] = sc.nextInt();
        }
        int a2[] = Arrays.copyOf(a, 5);
        System.out.print("Data of a2 array = ");
        for(int i=0; i<a.length; i++){
            System.out.print(a2[i]+" ");
        }
    }
}
