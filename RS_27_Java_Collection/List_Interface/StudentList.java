package List_Interface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Comparator;

//Creating user defined ArrayList class

class Student{
    private int roll, age;
    private String name;
    Student(int roll, String name, int age){
        this.roll = roll;
        this .name = name;
        this.age = age; 
    }

    public int getRoll(){
        return this.roll;
    }

    public int getAge(){
        return this.age;
    }

    public String getName(){
        return this.name;
    }
}
 
public class StudentList {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Bivek", 20);
        Student s2 = new Student(102, "Aarav", 21);
        Student s3 = new Student(103, "Aakash", 23);

        ArrayList<Student> al1 = new ArrayList<Student>();
        al1.add(s1);
        al1.add(s2);
        al1.add(1, s3);

        al1.sort(Comparator.comparing(Student::getName));

        Iterator<Student> itr = al1.iterator();

        while(itr.hasNext()){
            Student st = itr.next();
            System.out.println(st.getRoll()+" "+st.getName()+" "+st.getAge());
        }

        ArrayList<Student> al2 = new ArrayList<Student>();
        al2.add(s1);
        al2.add(s2);

        al1.removeAll(al2);
        System.out.println("Array list after removeAll() operation....");
        for(Student student : al1){
            System.out.println(student.getRoll()+" "+student.getName()+" "+student.getAge());
        }
    }
}
