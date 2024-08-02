/*
Exercise 6: You have to create a custom calculator with following operations:
    1. + -> Addition
    2. - -> Subtraction
    3. * -> Multiplication
    4. / -> Division
    which throws the following exceptions:
    1. Invalid input Exception ex: 8 & 9
    2. Cannot divide by 0 Exception
    3. Max Input Exception if any of the inputs is greater than 100000
    4. Max Multiplier Reached Exception - Don't allow any multiplication input to be greater than 7000
 */

 class InvalidInputException extends Exception{
    public InvalidInputException(String msg){
        super(msg);
    }
 }

 class MaxInputException extends Exception{
    public MaxInputException(String msg){
        super(msg);
    }
 }

 class DivideByZeroException extends Exception{
    public DivideByZeroException(String msg){
        super(msg);
    }
 }

 class MaxMultiplyException extends Exception{
    public MaxMultiplyException(String msg){
        super(msg);
    }
 }

 class customCalculator{
    private int a,b;
    public customCalculator(int a, int b) throws MaxInputException, InvalidInputException{
        if(a>100000 || b>100000){
            throw new MaxInputException("Value for a or b is too large");
        }

        if(a==8 && b==9){
            throw new InvalidInputException("Invalid values for a & b");
        }
        this.a = a;
        this.b = b;
    }

    public int add(){
        return a + b;
    }

    public double divide() throws DivideByZeroException{
        if(b==0){
            throw new DivideByZeroException("Try to divide by zero");
        }

        return a/b;
    }

    public int muliply() throws MaxMultiplyException{
        if(a>7000 || b>7000){
            throw new MaxMultiplyException("Multiplication exception occured");
        }
        return a*b;
    }
 }


public class Practice {
    public static void main(String[] args) throws MaxInputException, InvalidInputException, MaxMultiplyException{
        
        // customCalculator cal = new customCalculator(8, 9);
        // int sum = cal.add();
        // System.out.println(sum);

        customCalculator cal = new customCalculator(10000, 9);
        int mul = cal.muliply();
        System.out.println(mul);
    }
}
