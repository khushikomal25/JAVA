import java.util.Scanner;
public class String_index {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String str; char x; int i;
        System.out.println("Enter the String");
        str=sc.next();
        try{
            for(i=0; i<=str.length(); i++){
                x=str.charAt(i);
                System.out.println(x);
            }
        }catch(StringIndexOutOfBoundsException ex){
            System.out.println("String location is out of location");
        }
    }
    
}
