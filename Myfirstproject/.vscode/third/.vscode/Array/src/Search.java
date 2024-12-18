// to search weather an number is present in array or not....

import java.util.Scanner;
public class Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int num[] = new int [10];
        int i,s,c=0;
        System.out.print("Enter the numbers : ");
        for(i=0; i<10; i++){
            num[i] = sc.nextInt();
        }
        System.out.print("Enter the no. to search : ");
        s = sc.nextInt();
        for(i=0; i<10; i++){
            if(num[i] == s){
                c=1;
                break;
            }
        }
        if (c==0)
        System.out.println("Not Found");
        else
        System.out.println("Found");
    }
    
}
