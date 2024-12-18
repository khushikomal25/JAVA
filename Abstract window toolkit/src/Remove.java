// to remove item from list

import java.util.Scanner;
public class Remove {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, item, loc, size;
        System.out.print("Enter size of array : ");
        size = sc.nextInt();

        int a[] = new int[size];
        System.out.print("Enter elements of array : ");
        for(i=0; i<size; i++){
            a[i] = sc.nextInt();
        }
        System.out.print("Enter Array location : ");
        loc = sc.nextInt();
        
        for(i=loc; i<size-1; i++){
            a[i] = a[i+1];
        }
        size--;
        for(i=0; i<size; i++){
            System.out.print(a[i]+" ");
        }
    }
}
