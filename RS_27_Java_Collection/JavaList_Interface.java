import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Arrays;
import java.util.Collections;

public class JavaList_Interface {
    public static void main(String[] args) {

       //Creating list of type String using ArrayList, in similar way we can create list using LinkedList. 
       List<String> list = new ArrayList<>();
       list.add("Mango");
       list.add("Apple"); 
       list.add("Banana");
       
       for(String fruit : list){
        System.out.println(fruit);
       }

       //---------------------------------------------------------------------------------------------------------
       //---------------------------------------------------------------------------------------------------------

       //How to convert array to list....??
       String[] array = {"Java", "Python", "PHP", "C++"};
       System.out.println(array); //returns the object id....
       System.out.println(Arrays.toString(array)); // ["Java", "Python", "PHP", "C++"]

       List<String> list1 = new ArrayList<>();
       for(String elem : array){
        list1.add(elem);
       }

       System.out.println(list1);// ["Java", "Python", "PHP", "C++"]
        //System.out.println(array.get(1)); throws errror
        System.out.println(list1.get(1)); // Python

        //-------------------------------------------------------------------------------------------------------
        //-------------------------------------------------------------------------------------------------------

        // HOW TO CONVERT LIST TO ARRAY... 
        List<String> list2 = new ArrayList<>();
        list2.add("Java");
        list2.add("Python");
        list2.add("PHP");
        list2.add("C++");

        String[] arr2 = list2.toArray(new String[list2.size()]);
        System.out.println(Arrays.toString(arr2));  // ["Java", "Python", "PHP", "C++"]

        // .get() and .set() method 
        list2.set(1, "setter1");
        System.out.println(list2); //// ["Java",  "setter1","Python", "PHP", "C++"]
        System.out.println(list2.get(1)); //setter1

        // .sort() --> sort the list
        Collections.sort(list2);
        System.out.println(list2); // ["C++", "Java", "PHP", "setter1"]

        // ListIterator iterface --> used to iterate through each list element
       ListIterator<String> itr = list2.listIterator();
       while(itr.hasNext()){
        System.out.print(itr.next()+" "); // C++ Java PHP setter1
       }

       System.out.println();

       while(itr.hasPrevious()){
        System.out.print(itr.previous()+" ");
       }

    }
}
