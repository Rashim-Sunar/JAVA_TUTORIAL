class Employee9{
    private int id;
    private String name;
    private int salary;
    //contructor is made by using the class name... 
    public Employee9(){
        this.id = 4;
        this.name = "Aakash";
        this.salary = 10000;
    }

    //We can do constructor overloading just like the methods overloading in java
    public Employee9(int id, String name){
        this.id = id;
        this.name = name;
        this.salary = 10000;
    }

    public Employee9(int id, String name, int sal){
        this.id = id;
        this.name = name;
        this.salary = sal;
    }

    public void getDetails(){
        System.out.println("Name: "+this.name+" \nID: "+this.id+" \nSalary: "+this.salary);
    }
}

public class RS_9_CONSTRUCTORS {
    public static void main(String[] args) {
        Employee9 e = new Employee9(101, "Aarav");
        e.getDetails();
        Employee9 e1 = new Employee9(102, "Nabin", 20000);
        e1.getDetails();
    }
}
