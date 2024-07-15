public class RS_3_METHOD_OVERLOADING {
    //Two or more methods can have same name with different number of arguements, called method overloading
    //Only changing the return type is not valid overloading, gives error. (i.e int and void with same number of arguements gives error)

    static void foo(){
        System.out.println("Hello worold");
    }

    static void foo(int a){
        System.out.println("Hello world : "+a);
    }

    static void foo(int a, int b){
        System.out.println("Hello world: "+(a+b));
    }

    //This is not valid for method oveloading...
    // static int foo(int a, int b){
    //     return a+b;
    // }
    public static void main(String [] args){
        foo();
        foo(10);
        foo(10, 20);  //arguement means actual parameter...
    }
}
