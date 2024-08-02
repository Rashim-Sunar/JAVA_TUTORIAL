
/*
 Create a package named practice . This package should have individuals 
 classes for Rectangle, Square, Circle, Cylinder, Sphere. These classes should use inheritance
 to properly manage the code! Include methods like volume, surface area and getters/setters for dimensions
 */

package practice;

public class Rectangle extends Shape{
    Rectangle(int dim1, int dim2){
        super(dim1, dim2);
    }

    public int area(){
        return this.getDim1()*this.getDim2();
    }
}
