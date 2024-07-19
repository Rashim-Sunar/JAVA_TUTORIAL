/*
 Multiple Inheritance in Java Using Interface
 -->  Multiple Inheritance is an OOPs concept that can’t be implemented in Java using classes. 
But we can use multiple inheritances in Java using Interface. let us check this with an example.
 */

 //Imterface-1 
 interface API{
    default void show(){
        System.out.println("Default API");
    }
 }

 //Interface-2
 //Extending the above interface
 interface Interface1 extends API{
    //Abstract method
    abstract void display();
 }

 //Interface3
 //Extending the above interface
 interface Interface2 extends API{
    //Abstract method
    abstract void print();
 }

//You have to override the abstract method form both interface
 class MultipleInheritance implements Interface1, Interface2{
    //Overriding the abstract method from Interface-2
    @Override
    public void display(){
        System.out.println("Display from interface-2");
    }
    @Override
    public void print(){
        System.out.println("Print from Interface-3");
    }
 }

public class RS_17_Multiple_Inheritance_byInterface {
    public static void main(String[] args) {
        MultipleInheritance m = new MultipleInheritance();
        m.display();
        m.print();
    }
}
