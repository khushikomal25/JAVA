// to find Maximum integer of array

import java.util.Scanner;
public class Maximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, max=0;
        int num[] = new int[5];
        System.out.print("Enter elements of array : ");
        for(i=0; i<num.length; i++){
        num[i] = sc.nextInt();
        }
        max = num[0];
        for(i=0; i<num.length; i++){
            if(num[i] > max){
                max = num[i];
             }
        }
        System.out.print("Maximum no. = "+max);
    }
}
