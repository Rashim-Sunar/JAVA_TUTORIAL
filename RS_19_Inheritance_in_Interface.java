/*We can inherit the abstract methods from a interface to another interface. 
 But inheriting abstract methods from a interface to a class is not possible, throws an error.*/
interface sampleInterface{
    void method1();
    void method2();
}
 
//Here, we can extend a interface by using concept of inheritance. i.e. an interface can extend another interface.
interface childSampleInterface extends sampleInterface{
    void method3();
    void method4();
}
// Note: Interface can not inplement another interface. Only class can implement a interface.
//Implenting the interface to a class
class sampleClass implements childSampleInterface{
    @Override
    public void method1() {
        System.out.println("I'm mehtod1"); 
    }

    @Override
    public void method2() {
        System.out.println("I'm method2");
    }
    @Override
    public void method3() {
        System.out.println("I'm method3");
    }

    @Override
    public void method4() {
        System.out.println("I'm method4");
    }
}

public class RS_19_Inheritance_in_Interface {
    public static void main(String[] args) {
        sampleClass s1 = new sampleClass();
        s1.method1();
        s1.method2();
        s1.method3();
        s1.method4();
    }
}
