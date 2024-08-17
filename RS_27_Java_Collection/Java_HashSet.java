/*
 Java HashSet class is used to create a collection that uses a hash table for storage. It inherits the AbstractSet class and implements Set interface.
 public class HashSet<E> extends AbstractSet<E> implements Set<E>, Cloneable, Serializable 

 HashSet stores the elements by using a mechanism called hashing
 contains unique elements only
  allows null value.
  HashSet class is non synchronized.
  HashSet doesn't maintain the insertion order. Here, elements are inserted on the basis of their hashcode. 
  The initial default capacity of HashSet is 16, and the load factor is 0.75.
  HashSet is the best approach for search operations.

  Time complexity for insert, search and delete is O(1).
 */

 import java.util.HashSet;
 import java.util.Iterator;

public class Java_HashSet {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(11);
        set.add(90);
        set.add(6);
        set.add(11);
        System.out.println(set); // [6, 10, 90, 11]

        // .contains() --> returns boolean
        System.out.println(set.contains(10)); //true

        // .remove() removes the element from the set
        set.remove(11);
        System.out.println(set.contains(11)); //false

        Iterator<Integer> itr = set.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" "); // 6 10 90
        }

        set.clear(); // deletes all data of the set
        System.out.println(set); //[]
    }
}
