//  Print A to Z Alphabet in both case capital and small...

public class Alphabet 
{
    public static void main(String[] args) 
    {
        for(char i='A'; i<='Z'; i++){
            System.out.print(i + "  ");
        }
        System.out.println();
       
        for (char i='a'; i<='z'; i++){
            System.out.print(i+ "  ");
        }
    }
}
