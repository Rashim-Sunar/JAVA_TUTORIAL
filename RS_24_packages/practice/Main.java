package practice;

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle(10);
        Rectangle rect = new Rectangle(10, 20);
        Square sq = new Square(10);
        System.out.println(c.area());
        System.out.println(rect.area());
        System.out.println(sq.area());
    }
}
