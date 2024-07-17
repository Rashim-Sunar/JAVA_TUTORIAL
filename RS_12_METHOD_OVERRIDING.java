/*If subclass (child class) has the same method as declared in the parent class, it is known as method overriding in Java.
  If the object of subclass is created and the overrided method is called, the method which has been
  implemented in the subclass is called and its code is executed...
 */
class Base12{
    public void method1(){
        System.out.println("I am method 1 of base class");
    }

    public void method2(){
        System.out.println("I am method 2 of base class");
    }
}

class Derived12 extends Base12{
    @Override
    public void method2(){
        System.out.println("I am method 2 of derived class");
    }
    public void method3(){
        System.out.println("I am method 3 of derived class");
    }
}

public class RS_12_METHOD_OVERRIDING {
    public static void main(String[] args) {
        Derived12 d12 = new Derived12();
        d12.method2(); //Here the method2() of derived class is called but not of the main class due to method overriding
    }
}
