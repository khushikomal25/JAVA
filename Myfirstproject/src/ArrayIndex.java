import java.util.Scanner;
public class ArrayIndex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num[]=new int [10];
        int i,s=0;
        System.out.println("Enter 10 numbers");
        try{
            for(i=0; i<10; i++)
            num[i]=sc.nextInt();
            for(i=0; i<=10; i++){
                s+=num[i];
            }
            System.out.println("sum = "+s);
        }catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("Index position out of range");
        }
    }
}
