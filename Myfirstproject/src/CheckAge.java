class check extends Exception{
    public void CheckAge(String str){
        Super(str)
    }
}
class UserException{
    public static void verify(int age)throws check
    if(age<18)
    throw new CheckAge("Not the valid age");
}
public static void main(String[] args) {
    try{
        verify(15);
    }catch(Check ch){
        System.out.println("Error in age");
    }
}


    
}
