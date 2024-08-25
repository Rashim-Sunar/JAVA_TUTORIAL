/*
 Java TreeSet class implements the Set interface that uses a tree for storage. It inherits AbstractSet class and implements the NavigableSet interface. The objects of the TreeSet class are stored in ascending order.
 Java TreeSet class doesn't allow null elements.
Java TreeSet class is non-synchronized.
Java TreeSet class maintains ascending order.

TreeSet is being implemented using a binary search tree.
 search, remove, and add consume O(log(N)) time.

 Declaration.... 
 public class TreeSet<E> extends AbstractSet<E> implements NavigableSet<E>, Cloneable, Serializable    

 */

import java.util.TreeSet;
import java.util.Iterator;

public class Java_TreeSet {
    public static void main(String[] args) {
    TreeSet<String> tree = new TreeSet<String>(); 
    tree.add("Ravi");
    tree.add("Vijay");
    tree.add("Ravi");
    tree.add("Ajay");
    System.out.println(tree); //[Ajay, Ravi, Vijay] in sorted order...

    //Traversing elements in descendign order... 
    Iterator<String> itr = tree.descendingIterator();
    System.out.println("Traversing element through Iterrator in descending order....");
    while(itr.hasNext()){
        System.out.print(itr.next()+" "); // Vijay Ravi Ajay
    }

    System.out.println(tree); ////[Ajay, Ravi, Vijay]

    // Retrieve highest and lowest value.... 
    System.out.println(tree.pollFirst()); //Ajay
    System.out.println(tree.pollLast()); // Vijay

    //---------------------------------------------------------------------------------------------- 
    //---------------------------------------------------------------------------------------------- 
    
    //NavigableSet operations....... 
    TreeSet<String> set = new TreeSet<>();
    set.add("A");
    set.add("C");
    set.add("D");
    set.add("B");
    set.add("E");

    System.out.println(set); //[A, B, C, D, E]
    System.out.println(set.descendingSet()); //[E, D, C, B, A]
    System.out.println(set.headSet("C", true)); // Boolean value is for inclusive or not [A, B, C]
    System.out.println(set.headSet("C", false)); // [A, B]

    System.out.println(set.subSet("A", false, "E", true)); // [B, C, D, E] exclude A include E
    }
}
