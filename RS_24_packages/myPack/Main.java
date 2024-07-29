/*
 *Step followed: From main folder RS_24_PACKAGES,
  (1) javac -d . pack/A.java
  (2)  javac -d . myPack/Main.java

  To run main class:  java myPack.Main
 */

package myPack;
import pack.A;

public class Main {
    public static void main(String[] args) {
        System.out.println("This is the main class");
        A obj = new A();
        obj.print();
    }
}
