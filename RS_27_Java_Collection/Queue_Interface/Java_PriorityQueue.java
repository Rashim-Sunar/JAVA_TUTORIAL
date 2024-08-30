import java.util.PriorityQueue;
import java.util.Iterator;

class Java_PriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<String>();
        queue.add("E");
        queue.add("A");
        queue.add("B");
        queue.add("C");
        queue.add("D");

        Iterator<String> itr = queue.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next()); // A C B E D
        }

        queue.remove();
        System.out.println(queue); //[B, C, D, E]
        queue.poll();
        System.out.println("After removing :");
        Iterator<String> itr2 = queue.iterator();
        while(itr2.hasNext()){
            System.out.println(itr2.next()); // C E D
        }
    }
}