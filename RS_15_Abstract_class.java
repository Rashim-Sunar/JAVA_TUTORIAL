/*
 *Data abstraction is the process of hiding certain details and showing only essential information to the user.
Abstraction can be achieved with either abstract classes or interfaces 
*/

/*
  The abstract keyword is a non-access modifier, used for classes and methods:

Abstract class: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).

Abstract method: can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from).
An abstract class can have both abstract and regular methods:
*/

//Abstract class
abstract class Animal{
    //abstract method without method body.
    public abstract void sound();
    //Regular method
    public void sleep(){
        System.out.println("Zzzzzzzzzz");
    }
}
//We can't create an object of above abstract class. To access abstract class, it must be 
//inherited from another class ie. child

class Pig extends Animal{
    public void sound(){
        //The body of sound() is provided here.
         System.out.println("The pig says: wee wee");
    }
}

public class RS_15_Abstract_class {
    public static void main(String[] args) {
       Pig p = new Pig();
       p.sound();
       p.sleep(); 
    }
}
