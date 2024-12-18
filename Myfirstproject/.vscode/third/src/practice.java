// aaltu faltu program

import java.util.Scanner;
public class practice {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++){
            int x =sc.nextInt();
            int y=sc.nextInt();
            int a=sc.nextInt();
            if (a >=x && a<y)
            System.out.println("yes");
            else
            System.out.println("no");

        }
    }
}
