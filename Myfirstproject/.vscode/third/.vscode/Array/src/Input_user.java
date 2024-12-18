//   Taking input from user for array

import java.util.Scanner;
public class Input_user {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int i,size;
        System.out.print("Enter size of array : ");
        size = sc.nextInt();
        int num[] = new int[size];
        for (i=0; i<size; i++){
            num[i] = sc.nextInt();
        }
        System.out.print("Array elements are : ");
         for (i=0; i<size; i++){
            System.out.print(num[i]+" ");
         }





        
    


        
        
        
    }
}
