// to find minimum integer of array

import java.util.Scanner;
public class Minimum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, min=0;
        int num[] = new int[5];
        System.out.print("Enter elements of array : ");
        for(i=0; i<num.length; i++){
        num[i] = sc.nextInt();
        }
        min = num[0];
        for(i=0; i<num.length; i++){
            if(num[i] < min){
                min = num[i];
             }
        }
        System.out.print("Maximum no. = "+min);
    }
}

        
    
