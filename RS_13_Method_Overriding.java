class M1{
    int a;
    M1(){
        a = 100;
    }

    void Printing(){
        System.out.println("Base class: "+a);
    }
}

class M2 extends M1{
    int a;
    int b;
    M2(){
        super();
        a = 50;
        b = 100;
    }

    @Override
    void Printing(){
        System.out.println(super.a); // Using base class attribute even after overriding --> 100
        System.out.println(a); // 50
        super.Printing(); //Using base class method even after overriding --> Base class:100
    }
}

public class RS_13_Method_Overriding {
    public static void main(String[] args) {
        M2 obj = new M2();
        obj.Printing();
    }
}
