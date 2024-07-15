public class RS_2_JAVA_METHODS {

    int sum(int x, int y){
        int s = x + y;
        return s;
    }

    static int logic(int x, int y){
        return x>y ? x : y;
    }

    public static void main(String[] arg){
        int a = 9, b=7;
        int c = logic(a,b);
        System.out.println("Largest =  " +c);
        
        //METHOD INVOCATION USING OBJECT CREATION......--> If method is not made static
        RS_2_JAVA_METHODS obj = new RS_2_JAVA_METHODS();
        int s = obj.sum(a,b);
        System.out.println("Sum = "+s);
    }
}