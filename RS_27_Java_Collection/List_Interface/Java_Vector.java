package List_Interface;

import java.util.List;
import java.util.Vector;
import java.util.Collections;

public class Java_Vector {
    public static void main(String[] args) {
        Vector<Integer> vec = new Vector<Integer>(5); //capacity doubles when size exceeds the initial capacity...
        vec.add(10);
        vec.add(20);
        vec.add(30);
        vec.add(40);
        vec.add(50);
        vec.add(4,60);
        System.out.println(vec); //[10, 20, 30, 40,60, 50]
        System.out.println(vec.size()); // 6
        System.out.println(vec.capacity()); // 10 
        System.out.println(vec.hashCode());

        // .subList(from, to) method
        List<Integer> list = vec.subList(0,4);
        System.out.println(list); // [10,20,30,40]

        // .Collections.replaceAll(vec, e1, e2) --> replaces all e1 by e2
        Collections.replaceAll(vec, 60, 50);
        System.out.println(vec); // [10 20, 30, 40, 50, 50]

    }
}
