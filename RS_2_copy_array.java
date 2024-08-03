/*
 Copying a Java Array
We can copy an array to another by the arraycopy() method of System class.

Syntax: 
public static void arraycopy(Object src, int srcPos,Object dest, int destPos, int length )  
 */

 /*
  Cloning an Array in Java
Since, Java array implements the Cloneable interface, we can create the clone of the Java array. 
If we create the clone of a single-dimensional array, it creates the deep copy of the Java array. 
It means, it will copy the actual value. But, if we create the clone of a multidimensional array, 
it creates the shallow copy of the Java array which means it copies the references.
  */

public class RS_2_copy_array {
    public static void main(String[] args) {
        //Decalring source arrar...
        char[] arr1 = {'a', 'b', 'c', 'd','e', 'f', 'g', 'h', 'i', 'j', 'k'};

        //Declaring destination array.... 
        char[] arr2 = new char[5];

        //Copying array using System.arraycopy(source, source_range, destination, dest_pos, length(range))
        System.arraycopy(arr1, 2, arr2, 0, 4 );
        System.out.println(String.valueOf(arr2));

        //Clonning a array
        int arr3[] = {1,2,3,4,5};
        int arr4[] = arr3.clone(); 
        for(int elem : arr4){
            System.out.print(elem+"\t");
        }

    }
}
