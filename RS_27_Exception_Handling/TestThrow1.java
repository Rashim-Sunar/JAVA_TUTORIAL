// Throwing Unchecked Exception

public class TestThrow1 {
    public static void checkAge(int age){
        if(age<18){
            throw new ArithmeticException("Not eligible for voting");
        }else{
            System.out.println("Eligibe for voting");
        }
    }
    public static void main(String[] args) {
        checkAge(10);
        System.out.println("This is the last code.");  //This line won't be run since exception is not handled.
    }
}