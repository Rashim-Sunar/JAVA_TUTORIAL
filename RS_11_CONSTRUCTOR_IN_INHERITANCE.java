//Inherting the base class constructor in derived class.. -->First base class constructor is called then only the derived class constructor is run.
/*If there is constructor overloading in base class then by default, the constructor without any parameter
    is inherited, if we want to inherit the specific contructor from base class then, we have to use "super(parameters)" keyword in the constructor of the derived class. 
    Example: super(val1, val2); In this case, among the overloaded constructors in base class the constructor with two parameters is called..
 */

 class Base1{
    Base1(){
        System.out.println("This is base class constructor");
    }
    //Constructor overloading.... 
    Base1(int n){
        System.out.println("This is base class constructor with single parameter "+n);
    }
 }

 class Derived1 extends Base1{
    Derived1(){
        // super();  This will call the Base1() constructor..
        super(1);   //This is calling the Base1(int n) constructor of Base1 class
        System.out.println("This is derived class constructor");
    }

    Derived1(int n){
        super(n);
        System.out.println("This is derived class constructor with single parameter "+n);
    }

    Derived1(int n, int m){
        super();
        System.out.println("This is derived class constructor with 2 parameter "+n+ "and"+m);
    }

 }

 //In above, we have done the single inheritance. In similar way we can do multi-level inheritance by defining a derive class for Derived1 class as below... 
 class Derived2 extends Derived1{
    Derived2(){
       System.out.println("This is multi-level inheritance example"); 
    }
    Derived2(int a){
        super(a);
        System.out.println("This is multi-level inheritance example with 1 parameter "+a); 
     }
     Derived2(int a, int b){
        super(a,b);
        System.out.println("This is multi-level inheritance example with 2 parameter "+a+" and "+b); 
     }
     Derived2(int a, int b, int c){
        super(a);
        System.out.println("This is multi-level inheritance example with 3 parameters "+a+","+b+" and "+c); 
     }
 }

public class RS_11_CONSTRUCTOR_IN_INHERITANCE {
    public static void main(String[] args) {
        // Derived1 d1 = new Derived1();
        // Derived1 d1 = new Derived1(1, 2);  //Constructor are run at the moment of instantiation...
        Derived2 d2 = new Derived2(1, 2);
        // Derived2 d2 = new Derived2(1, 2, 3);
        System.out.println(d2);

    }
}
