// to insert integer b/w array
// a[3]= {2,45,67}
//   a[1] = 56
// a[3+1] = {2,56,45,67}

import java.util.Scanner;
public class Insert {
    public static void main(String[] args) {
        int size,locatin,item,i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        size = sc.nextInt();

        int a[] = new int[size+1];
        System.out.print("Enter elements of array : ");
        for(i=0; i<size; i++){
            a[i] = sc.nextInt();
        }
        System.out.print("Enter Array location : ");
        locatin = sc.nextInt();
        System.out.print("Enter new item : ");
        item = sc.nextInt();
        for(i=size; i>locatin;i--){
            a[i] = a[i-1];
        }
        a[locatin] = item;
        size++;
        for(i=0; i<size; i++){
            System.out.print(a[i]+" ");
        }
    }
}
