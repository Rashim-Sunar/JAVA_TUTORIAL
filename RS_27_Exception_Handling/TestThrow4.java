
class NegativeException extends Exception{
    public NegativeException(String msg){
        super(msg);
    }
}

public class TestThrow4 {

    public static double area(double r) throws NegativeException{
        if(r < 0){
            throw new NegativeException("Radius is negative!!!!");
        }
        double A = Math.PI*r*r;
        return A;
    }

    public static void main(String[] args) {
        try{
            double A = area(-10);
            System.out.println(A);
        }catch(NegativeException e){
            // e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
