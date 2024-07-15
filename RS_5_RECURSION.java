//A java code to find the factorail of given numbet using recursion... 

import java.util.Scanner;

public class RS_5_RECURSION {

    static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n*factorial(n-1);
    }

    //fibonacci swquence using recursion.... 
    static int fibonacci(int n){
        if(n==1){
            return 0;
        }else if(n==2){
            return 1;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       try{
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        System.out.println("Factorial = "+factorial(n));
        
        //displaying fibonacci sequence... 
        System.out.println("Fibonacci:");
        for(int i=1; i<=n; i++){
            System.out.print(fibonacci(i)+"\t");
        }

       }finally{
        sc.close();
       }
    }
}
