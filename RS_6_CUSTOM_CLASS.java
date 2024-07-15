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
        aakash.myDetails();
        System.out.println(aakash.getSalary());
        bivek.myDetails();
        System.out.println(bivek.getSalary());


    }
}
