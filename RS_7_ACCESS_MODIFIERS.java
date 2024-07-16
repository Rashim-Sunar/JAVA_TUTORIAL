/*FOur types of access modifiers
1. Private    2.Default   3. Protected   4.Public
*/
class Employee7{
    private int id;
    private String name;
    //getters and setters access.. 
    public void setName(String n){
        this.name = n;
        //name = n; This will also work...
    }

    public void setId(int ID){
        this.id = ID; 
    }

    public String getName(){
        return this.name;
        // return name;  Thi wil also run...
    }

    public int getId(){
        return this.id;
    }
}

public class RS_7_ACCESS_MODIFIERS {
    public static void main(String[] args) {
        Employee7 e = new Employee7();

        // e.id = 101;
        // e.name = "aakash";  Throws an error due to private access modfifier... 

        e.setName("Aakash");
        e.setId(101);
        System.out.println(e.getName());
        System.out.println(e.getId());
    }
}
