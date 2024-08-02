package practice;

public class Square extends Shape{
    public Square(int dim1){
        super(dim1, -1);
    }

    public int area(){
        return this.getDim1()*this.getDim1();
    }
}
