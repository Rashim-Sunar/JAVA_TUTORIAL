package Queue_Interface;
/*
 ArrayDeque in Java
ArrayDeque = Resizable array + Deque interface.
ArrayDeque implements the Queue & Deque interface.
There are no capacity restrictions for ArrayDeque, and it provides us the facility to add or remove any element from both sides of the queue.
Also known as Array Double Ended Queue.
It is faster than Linked list and stack.

 */

import java.util.ArrayDeque;

public class Java_ArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1 = new ArrayDeque<Integer>();
        // Adding elements
        ad1.add(30);
        ad1.add(40);
        ad1.addFirst(20); //exception throwing if error occurs.. 
        ad1.offerFirst(10); // ignore this line if error occurs
        
        // Inserting element at the last... 
        ad1.addLast(50);
        ad1.offerLast(60);
        System.out.println(ad1); //10 20 30 40 50 60

        // Accessing first element... 
        System.out.println(ad1.getFirst()); // 10
        System.out.println(ad1.peekFirst()); // 10

        // Accessing the last element
        System.out.println(ad1.getLast()); // 60
        System.out.println(ad1.peekLast()); // 60

        // Removing the first element.. 
        System.out.println(ad1.pollFirst()); // returns 10 and delete 10 from the list
        System.out.println(ad1); // 20 30 40 50 60

        ad1.removeFirst(); // deletes 20 from the list
        System.out.println(ad1); // 30 40 50 60

        // Removing last element
        System.out.println(ad1.pollLast()); // returns last element 60 and delete it from the list 
        System.out.println(ad1); // 30 40 50

        ad1.removeLast(); // deletes last element 50
        System.out.println(); // 30 40
    }
}
