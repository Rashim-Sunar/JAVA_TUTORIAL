/*
 Java provides three classes to represent a sequence of characters: String, StringBuffer, and StringBuilder. 
The String class is an immutable class whereas StringBuffer (synchronized) and StringBuilder (non-synchronized) classes are mutable.
All the methods for StringBuffer and StringBuilder are same. StringBuffer available since JDK 1.0 and StringBuilder since JDK 1.5.
 */

//Codes to demonstrate the use StringBuffer as a mutable 

public class String_Buffer {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("Hello");
        str.append(" World");
        System.out.println(str); // Hello World --> Original string is changed or modified

        // .insert() method --> inserts the given String with this string at the given position. 
        StringBuffer s1 = new StringBuffer("Hello");
        s1.insert(1, "Java");
        System.out.println(s1); // HJavaello

        // .replace() --> replaces given string from the specified beginIndex and endIndex. 
        StringBuffer s2 = new StringBuffer("Hello");
        s2.replace(1, 3, "Java");
        System.out.println(s2); //HJavalo


        // .delete(beginIndex, endIndex) --> deletes the string from the specified beginIndex to endIndex. 
        StringBuffer s3 = new StringBuffer("Hello");
        s3.delete(1,3);
        System.out.println(s3); //Hlo

        //.reverse() --> reverses the current string
        StringBuffer s4 = new StringBuffer("Hello");
        s4.reverse();
        System.out.println(s4); //olleH

        //The capacity() method of the StringBuffer class returns the current capacity of the buffer. 
        //The default capacity of the buffer is 16. If the number of character increases from its current capacity, it increases the capacity by (oldcapacity*2)+2. 
        StringBuffer s5 = new StringBuffer();
        System.out.println(s5.capacity()); // default 16
        s5.append("Hello");
        System.out.println(s5.capacity()); //now 16
        s5.append(" is the best world"); 
        System.out.println(s5.capacity()); // (16*2)+2 = 34

        // .ensureCapacity() --> ensures that the given capacity is the minimum to the current capacity. If it is greater than the current capacity, it increases the capacity by (oldcapacity*2)+2
        s5.ensureCapacity(10);
        System.out.println(s5.capacity()); // now no change i.e 34
        s5.ensureCapacity(50); // now (34*2)+2
        System.out.println(s5.capacity()); // now 70
    }
}
