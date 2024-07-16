class Employee{
    //Attributes
    int id;
    String name;
    int salary;

    //Methods
    public void myDetails(){
        System.out.println("Hi I'm "+name+" with id : "+id);
    }

    public int getSalary(){
        return salary;
    }
}


class Square{
    int side;
    public int area(){
        return side*side;
    }

    public int perimeter(){
        return 4*side;
    }

}

public class RS_6_CUSTOM_CLASS {
    public static void main(String[] args) {
        Employee aakash = new Employee(); //Instantiating new Employee object. 
        Employee bivek = new Employee();
        //Setting attributes...
        aakash.id = 100;
        aakash.name = "Aakash Chaurasiya"; 
        aakash.salary = 100000;
        bivek.name = "Bivek";
        bivek.id = 101;
        bivek.salary = 200000;
        //Calling methods 
        aakash.myDetails();
        System.out.println(aakash.getSalary());
        bivek.myDetails();
        System.out.println(bivek.getSalary());


        Square sq = new Square();
        sq.side = 4;
        System.out.println("Area = "+ sq.area());
        System.out.println("Perimeter = "+sq.perimeter());
    }
}
