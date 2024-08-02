//Throwing checked exception....

public class TestThrow2 {
    public static void checkAge(int age) throws ArithmeticException{
        if(age<18){
            throw new ArithmeticException("Not eligible for voting");
        }else{
            System.out.println("Eligibe for voting");
        }
    }
    public static void main(String[] args) {
        try{
            checkAge(10);
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }

        System.out.println("This is the last line");
    }
}
