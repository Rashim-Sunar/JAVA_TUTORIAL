public class RS_4_VAR_ARG {
    //VarArg is similar to rest operator in javaScript. It is passed to the called method as a parameter with three dots 
    static int sum(int ...arr){
        //Available as: int[] arr
        int s = 0;
        for (int elem : arr){
           s += elem; 
        }

        return s;
    }

    public static void main(String[] args){
        System.out.println(sum(1,2));
        System.out.println(sum(1,2,3,4));
    }
}
