// Arranging an array in descending order...

import java.util.Scanner;
public class Descending_order {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,j,temp;
        int num[] = new int[5];
        System.out.print("Enter elements of array : ");
        for(i=0; i<num.length; i++);{
             num[i] = sc.nextInt();
        }
        for(i=0; i<num.length;i++){
            for(j=i+1; j<num.length; j++){
                if(num[i]<num[j]){
                    temp = num[i]; 
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
        for(i=0; i<num.length;i++){
            System.out.print("Descending order = ");
            System.out.print(num[i]+" ");
        }
    }
}
