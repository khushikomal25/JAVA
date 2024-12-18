//To find maximum number...

import java.util.Scanner;
public class Maximum 
{
    public static void main(String[] args)
     {
        Scanner sc = new Scanner (System.in);
        
        int num,i,max=0;
       System.out.println("Enter 10 numbers");
       
       for(i=1; i<=10; i++){
            num=sc.nextInt();
            if (num > max){
                 max = num;
            }
        }
        System.out.println("Maximum no. = "+ max);
    }
}
