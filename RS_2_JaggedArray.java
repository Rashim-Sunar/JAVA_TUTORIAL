/*
 A jagged array is an array of arrays such that member arrays can be of different sizes, i.e., we can create a 2-D array but with a variable number of columns in each row. 
 These types of arrays are also known as Jagged arrays. 
 */

// import java.util.Arrays;
import java.util.Scanner;
// import java.util.stream.Stream;

class RS_2_JaggedArray {
  public static void main(String[] args) {

    //JAGGED ARRAY USING ARRAY LITERAL
    // int[][] jaggedArray = {{1,2},{1,2,3},{1,2,3,4}};
    // for(int i=0; i<jaggedArray.length; i++){
    // for(int j=0;j<jaggedArray[i].length; j++){
    // System.out.print(jaggedArray[i][j]+"\t");
    // }
    // System.out.println();
    // }

    //-------------------------------------------------------------------
    //-------------------------------------------------------------------   

    //JAGGED ARRAY USING JAVA 8 STREAM
    // create a jagged array with three rows
    //     int[][] jaggedArray = Stream.of(  
    //        new int[]{1, 2},  
    //       new int[]{3, 4, 5},  
    //       new int[]{6, 7, 8, 9}
    //       ).toArray(int[][]::new);  

    // // loop through each row of the jagged array using streams
    // Arrays.stream(jaggedArray)
    //     .forEach(row -> {
    //       // loop through each element of the current row using streams
    //       Arrays.stream(row)
    //           .forEach(element -> System.out.print(element + " "));

    //       // move to the next line for the next row
    //       System.out.println();
    //     });

    //-------------------------------------------------------------------
    //-------------------------------------------------------------------   

    // CREATING DYNAMIC JAGGED ARRAY 
    // Create a Scanner object to get user input  
    Scanner scanner = new Scanner(System.in);  
    // Prompt the user to enter the number of sub-arrays  
    System.out.print("Enter the number of sub-arrays: ");  
    int numberOfArrays = scanner.nextInt();  
  
    // Declare the jagged array with the number of sub-arrays  
    int[][] jaggedArray = new int[numberOfArrays][];  
  
    //Loop through each sub-array to allocate memory and get user input for each element  
    for (int i = 0; i < numberOfArrays; i++) {  
        // Prompt the user to enter the size of the current sub-array  
        System.out.print("Enter the size of sub-array " + (i + 1) + ": ");  
        int sizeOfSubArray = scanner.nextInt();  
  
        // Allocate memory to the current sub-array  
        jaggedArray[i] = new int[sizeOfSubArray];  
  
        //Loop through each element of the current sub-array to get user input  
        for (int j = 0; j < sizeOfSubArray; j++) {  
            System.out.print("Enter the element at index " + j + " of sub-array " + (i + 1) + ": ");  
            jaggedArray[i][j] = scanner.nextInt();  
        }  
    }  
  
    // Print the jagged array  
    System.out.println("The jagged array is:");  
    for (int i = 0; i < numberOfArrays; i++) {  
        for (int j = 0; j < jaggedArray[i].length; j++) {  
            System.out.print(jaggedArray[i][j] + " ");  
        }  
        System.out.println();  
    }  
  
    // Close the scanner object  
    scanner.close();  

  }
}
