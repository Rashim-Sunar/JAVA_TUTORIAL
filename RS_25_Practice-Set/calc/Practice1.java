/*
 *Create three classes Calculator, ScCalculator adn HybridCalculator
 and group them into a package.  
 */

 package calc;

 class Calculator{
    public void calculate(int a, int b){
        System.out.println("Result: "+(a+b));
    }
 }

 class ScCalculator{
    public void calculate(int a, int b){
        System.out.println("Result"+(a*b));
    }
 }

 class HybridCalculator{
    public void calculate(int a, int b){
        System.out.println("Result: "+Math.sin(a+b));
    }
 }

 public class Practice1 {
     public static void main(String[] args) {
        System.out.println("I am a main method");
        Calculator c = new Calculator();
        c.calculate(10, 30);
     }
 }