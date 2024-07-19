/*
 *The interface in Java is a mechanism to achieve abstraction. There can be only abstract 
 methods in the Java interface, not method body. It is used to achieve abstraction and multiple inheritance in Java.
 */

 interface Vehicle{
    // All the abstract methods. 
    void changeGear(int a);
    void speedUp(int a);
 }

 //implemtnting interface --> You have to implement all abstract methods of interface with a body
 class Bicycle implements Vehicle{
    int speed;
    int gear;
    //to change gear.
    @Override
    public void changeGear(int newGear){
        this.gear += newGear;
    }
    // To change speed.
    @Override
    public void speedUp(int newSpeed){
        this.speed += newSpeed;
    }

    public void printState(){
        System.out.println("Speed: "+this.speed+ "\tGear: "+this.gear);
    }

 }

public class RS_16_INTERFACE {
    public static void main(String[] args) {
        //Creating instance of bicycle... 
        Bicycle b = new Bicycle();
        b.changeGear(10);
        // b.speedUp(20);
        // b.speed(10); You cannot modify the properties in interface as they are final
        b.printState();
    }
}
