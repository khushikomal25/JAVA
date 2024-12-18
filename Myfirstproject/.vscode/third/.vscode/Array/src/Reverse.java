//   Reversing an array...

import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int i,size;
        System.out.print("Enter size of array: ");
        size = sc.nextInt();
        int num [] = new int [size];
        for(i=0; i<size; i++){
          num [i] = sc.nextInt();  
        }

        System.out.print("Printing array elements: ");
        for(i=0; i<size; i++){
            System.out.print(num[i]+" ");
        }
        
        System.out.println();
        System.out.print("Reverse array: ");
        for(i=size-1; i>=0; i--){
            System.out.print(num[i]+" ");
        }
    }
    
}
