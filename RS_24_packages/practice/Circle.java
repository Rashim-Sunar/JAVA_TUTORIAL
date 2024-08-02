package practice;

public class Circle extends Shape{
    public Circle(int dim1){
        super(dim1, -1);
    }

    public double area(){
        return Math.PI*this.getDim1()*this.getDim1();
    }
}
