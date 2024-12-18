// use of sort function -->
// This function arrange the entries in ascending order

import java.util.Scanner;
import java.util.Arrays;
public class Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int num[] = new int[5];
        System.out.print("Enter data in array ");
        for(int i=0; i<num.length; i++){
            num[i] = sc.nextInt();
        }
        
        Arrays.sort(num);
        System.out.print("Sorted elements are : ");
        for(int i=0; i<num.length; i++){
            System.out.print(num[i]+" ");
        }
    }
}

