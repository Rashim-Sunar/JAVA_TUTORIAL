package javaGit;

public class rs_1_ArrayProblem {
    public static void main(String[] args) {
        // 1 --> SUM OF ELEMENTS OF AN ARRAY.....
        // float [] arr = {10.1f, 20.2f, 30.3f, 40.4f, 50.5f};
        // float sum = 0.0f;
        // for(float elem : arr){
        //     sum += elem;
        // }
        // System.out.println(sum);

        //-----------------------------------------------------------
        // 2 --> FIND WHETHER AN ELEMENT IS PRESENT IN THE ARRAY...
        // float [] arr = {10.1f, 20.2f, 30.3f, 40.4f, 50.5f};
        // float givenElem = 40.0f;
        // boolean isPresent = false;
        // for(float elem : arr){
        //     if(elem == givenElem){
        //         isPresent = true;
        //         break;
        //     }
        // }

        // System.out.println(isPresent);

        //--------------------------------------------------------------
        // 3--> CALCULATE THE AVERAGE OF THE MARKS...
        // float [] marks = {10.1f, 20.2f, 30.3f, 40.4f, 50.5f};
        // float sum = 0.0f;
        // for(float mark : marks){
        //     sum += mark;
        // }

        // System.out.println("Average marks = "+sum/marks.length);

        // 4 --> ADD TWO 2*3 MATRICES..
        // int[][] mat1 = {{1,2,3}, {4,5,6}};
        // int[][] mat2 = {{1,2,3}, {4,5,6}};
        // int[][] mat3 = new int[2][3]; //Of size 2 by 3..
        // for(int i =0; i<mat1.length; i++){
        //     for(int j =0; j<mat1[i].length; j++){
        //         mat3[i][j] = mat1[i][j] + mat2[i][j];
        //     }
        // }

        // //Displaying matrices...
        // System.out.println("Matrix-1 is:");
        // for(int[] row : mat1){
        //     for(int elem : row){
        //         System.out.print(elem+"\t");
        //     }
        //     System.out.println();
        // }

        // System.out.println("Matrix-2 is:");
        // for(int[] row : mat2){
        //     for(int elem : row){
        //         System.out.print(elem+"\t");
        //     }
        //     System.out.println();
        // }

        // System.out.println("Sum of two matrices:");
        // for(int[] row : mat3){
        //     for(int elem : row){
        //         System.out.print(elem+"\t");
        //     }
        //     System.out.println();
        // }

        //-------------------------------------------------------------------
        // 5 --> REVERSE AN ARRAY...
        int[] arr = {1,2,3,4,5};
        int start = 0;
        int end = arr.length - 1;
        int temp;
        while(start < end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        //Diplay array..
        for(int elem : arr){
            System.out.print(elem+"\t");
        }

    }
}
