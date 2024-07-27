//Question 1. Create an abstract class Pen with methods write() and refill() as abstract methods. 
//Question 2. Use the Pen class from Qn.1 to create a concreate class  foundationPen with additional methods changeNib

abstract class Pen{
    abstract void write();
    abstract void refill();
}

//Creating concreate class 
class foundationPen extends Pen{
    @Override
    public void write(){
        System.out.println("Write");
    }

    @Override
    public void refill(){
        System.out.println("Refilled");
    }

    public void changeNib(){
        System.out.println("Nib changed");
    }
}

public class RS_21_Exercise {
    public static void main(String[] args) {
        foundationPen fpen = new foundationPen();
        fpen.refill();
        fpen.write();
        fpen.changeNib();
    }
}
