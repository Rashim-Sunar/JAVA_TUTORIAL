//Inheritance --> borrowing the attributes and methods of the base class to derived class... 
class Base{
    private int x;
    public void setX(int x){
        System.out.println("I am in base class and setting value for x");
        this.x = x;
    }

    public int getX(){
        return this.x;
    }
}

//inheriting base calss using "extend" keyword
class Derived extends Base{
    private int y;
    public void setY(int y){
        this.y = y;
    }
    public int getY(){
        return this.y;
    }
}

public class RS_10_INHERITANCE {
    public static void main(String[] args) {
        //Creating an object of derived class....
        Derived d = new Derived();
        d.setX(100);
        d.setY(200);
        System.out.println(d.getX());
        System.out.println(d.getY());
    }
}
