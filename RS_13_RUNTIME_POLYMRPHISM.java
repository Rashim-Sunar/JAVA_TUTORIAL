
/*Polymorphism in Java
Polymorphism in Java is a concept by which we can perform a single action in different ways. Polymorphism is derived 
from 2 Greek words: poly and morphs. The word "poly" means many and "morphs" means forms. So polymorphism means many forms.

There are two types of polymorphism in Java: compile-time polymorphism and runtime polymorphism. We can perform polymorphism 
in java by method overloading and method overriding.

If you overload a static method in Java, it is the example of compile time polymorphism. Here, we will focus on runtime polymorphism in java. 
*/


/*
  Runtime Polymorphism (Dynamic Method Dispatch) in Java...

-->Runtime polymorphism or Dynamic Method Dispatch is a process in which a call to an overridden method is resolved at runtime rather than compile-time.
   In this process, an overridden method is called through the reference variable of a superclass. The determination of the method to be called is 
   based on the object being referred to by the reference variable.
 */


 //Lets take an example for runtime polymorphism with multi-level inheritance.. 

 class Animal1{
    public void eat(){
        System.out.println("Animal is eating");
    }

    public void run(){
        System.out.println("Animal is running");
    }
 }

 class Dog extends Animal1{
    @Override
    public void eat(){
        System.out.println("Dog is running from derived class");
    }

    public void bark(){
        System.out.println("Dog is barking");
    }
 }

public class RS_13_RUNTIME_POLYMRPHISM {
    public static void main(String[] args) {
        Animal1 d1 = new Dog(); // UPCASTING --> If the reference variable of Parent class refers to the object of Child class, it is known as upcasting
        d1.eat();  
        // Above, We are calling the eat() method by the reference variable of Parent class. Since it refers to the subclass object and subclass method overrides the Parent class method, the subclass method is invoked at runtime.
        // d1.bark();  This is not valid. Throws an error
        d1.run();
    }
}
