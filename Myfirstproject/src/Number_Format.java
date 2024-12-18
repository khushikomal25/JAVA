public class Number_Format {
    public static void main(String[] args) {
        String str= "1234.56";
        int num;
        try{
            num = Integer.parseInt(str);
            System.out.println(num*num);
        }catch(NumberFormatException ex){
            System.out.println("Data type of the number is not correct");
        }
    }
}
    
