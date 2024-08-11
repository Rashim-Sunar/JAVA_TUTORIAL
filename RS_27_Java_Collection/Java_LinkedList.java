//The LinkedList class in Java provides us with the doubly linked list data structure.
/*
 Linked lists are preferred over the Array list because the insertion & deletion in the linked lists can be done in a constant time. 
 But, in arrays, if we want to add or delete an element in between then, we need to shift all the other elements.
 In a linked list, it is impossible to directly access an element because we need to traverse the whole linked list to get the desired element.
*/

import java.util.LinkedList;

public class Java_LinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<Integer>();
        l1.add(20);
        l1.add(30);
        l1.add(40);
        l1.addFirst(10); //Add element at the first position
        l1.addLast(50); // add element to the last position
        System.out.println(l1); // 10 20 30 40 50

        System.out.println(l1.peek()); // returns 10, head element
        System.out.println(l1.peekLast()); //returns 50, the tail element
        System.out.println(l1.peekFirst()); // returns 10 
        
        l1.set(0, 100); // replaces 0th element by given element
        System.out.println(l1); // 100 20 30 40 50

        l1.remove(4); //removes element at 4th index
        System.out.println(l1); // 100 20 30 40

        System.out.println(l1.isEmpty()); //false

        l1.forEach(el -> {
            System.out.print(el+" "); // 100 20 30 40
        });

        int a = l1.pollFirst(); //retrieves and removes the first element of the list, returns null if the list is empty
        System.out.println(a); // 100
        System.out.println(l1); // 20 30 40 

        int lastElem = l1.pollLast(); // retruieves and removes last element of the list
        System.out.println(lastElem); // 40
        System.out.println(l1); // 20 30 
    }
}
