/*Create a class Circle and use inheritance to create another class Cylinder from it 
  Create methods for area and volume.
 */

 class Circle{
    private int radius;
    Circle(int r){
        this.radius = r;
    }

    public double area(){
        return Math.PI*this.radius*this.radius;
    }
 }

 //Class inheritance
 class Cylinder extends Circle{
    private int height;
    Cylinder(int r, int h){
        super(r); //Calling the constructor of base class with single parameter
        this.height = h;
    }  
    
    public double volume(){
        return this.area()*this.height;
    }
 }


public class RS_14_practice {
    public static void main(String[] args) {
        Cylinder c = new Cylinder(7, 2);
        System.out.println(c.volume());
    }
}
