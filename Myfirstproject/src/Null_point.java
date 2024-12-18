public class Null_point {
    public static void main(String[] args) {
        String str= null;
        try{
            int len= str.length();
            System.out.println("Length = "+len);
        }catch(NullPointerException ex){
            System.out.println("Variable dont have value");
        }
    }
    
}
