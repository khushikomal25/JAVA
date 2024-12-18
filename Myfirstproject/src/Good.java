import java.util.Scanner;
public class Good{
	public static void main (String[] args) {
		Scanner sc=new Scanner (System.in);
		int x,y,s=0;
        System.out.println("Enter value of x and y");
		x=sc.nextInt();
		y=sc.nextInt();
		s=x+y;
		if (s>6)
		    System.out.println("yes");
		else
		System.out.print("No");
	}
}
