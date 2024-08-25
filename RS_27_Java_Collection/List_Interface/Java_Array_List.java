package List_Interface;
// The ArrayList class is the dynamic array found in the java.util package.
// The size of the normal array can not be changed, but ArrayList provides us the ability to increase or decrease the size.
// ArrayList is slower than the standard array, but it helps us to manipulate the data easily.

import java.util.ArrayList;
import java.util.Iterator;

public class Java_Array_List {
    public static void main(String[] args) {
        // ArrayList --> implements the list interface (non-synchronized)
        ArrayList <String> l1 = new ArrayList<String>(); //Creates an ArrayList object of String type
        l1.add("AAkash");
        l1.add("Bivek");
        l1.add("Aakash");
        l1.add("Piyush");

        System.out.println(l1);

        Iterator<String> itr = l1.iterator(); //Making the listArray iterable
        //Traversing through iterator
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println(itr.hasNext()); //false

        //------------------------------------------------------------------------------
        //------------------------------------------------------------------------------

        ArrayList<Integer> a1 = new ArrayList<>();
        ArrayList<Integer> a2 = new ArrayList<>(5); //Specify initial capacity
        a1.add(100);
        a1.add(200);
        a1.add(300);
        a1.add(400);
        a1.add(0,500);
        a1.add(0, 600); //Insert 600 at 0th index.. 

        System.out.println(a1.contains(100)); //true
        System.out.println(a1.contains(900)); //false
        
        for(int i=0; i<a1.size(); i++){
            System.out.print(a1.get(i)+","); //600,500,100,200,300,400
        }

        a1.remove(4); //removes element at given index
        for(int i=0; i<a1.size(); i++){
            System.out.print(a1.get(i)+","); //600,500,100,200,400
        }

        a2.add(2);
        a2.add(3);
        a2.add(4);

        a1.addAll(a2); //Spread a2 values to a1(merging a2 in a1)
        for(int i=0; i<a1.size(); i++){
            System.out.print(a1.get(i)+","); //600,500,100,200,400,2,3,4
        }

        System.out.println(a1.indexOf(10000)); //-1, since element not present in arrayList
        System.out.println(a1.indexOf(100)); // 2
    }
}
