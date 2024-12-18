//    U r eligible for vote or not!!!...

import java.util.Scanner;
public class Elegibility 
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        int age, limit=0;
        System.out.println("Enter your age : ");
        age = sc.nextInt();
        limit = 18- age;

        if(age>=18){
            System.out.println(" you are eligible for voting");
        }
        else
        System.out.println("u r not eligible for voting. u have to wait for "+limit+ " years.");
    }
}
