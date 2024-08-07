public class StringCompare_concat {
    public static void main(String[] args) {
        String s1 = "Aakash"; //Create string object in string constant pool
        String s2 = "Aakash";
        String s3 = new String("Aakash"); //Creates two objects( one is in non-pool(i.e. heap memory) & another in constant constant pool)
        // s3 reference is referring to the non-pool reference
        String s4 = "aarav";
        String s5 = "AAKASH";

        // .equals() method compares original content of the string. 
        System.out.println(s1.equals(s2)); //true
        System.out.println(s1.equals(s3)); //true
        System.out.println(s1.equals(s4)); //false
        System.out.println(s1.equals(s5)); //false
        System.out.println(s1.equalsIgnoreCase(s5)); //true

        // == operator compares references not values... 
        System.out.println(s1 == s2); //true (because both refers to same instance in string constant pool)
        System.out.println(s1 == s3); //false (because s3 refers to instance created in non-pool(i.e heap memory))

        // .compareTo() method compares two values lexicographically(returns 0 if equal, 1 if s1>s2, and -1 if s1<s2)... 
        System.out.println(s1.compareTo(s2)); //returns 0
        System.out.println(s1.compareTo(s5)); // returns +ve
        System.out.println(s1.compareTo(s4)); //-ve

        // String concatenation by "+"
        String s6 = "Aakash " + "Chaurasiya";
        System.out.println(s6); // Aakash Chaurasiya
        // Java compiler transform above vode to this (using StringBuilder)
        String s = (new StringBuilder()).append("AAkash ").append("Chaurasiya").toString();
        System.out.println(s); // Aakash Chaurasiya

        //String concatenation using .concat() method
        String s7 = s1.concat(s4);
        System.out.println(s7); //AakashAarav

        //String concatenation using string building class
        StringBuilder s10 = new StringBuilder("Hello");
        StringBuilder s11 = new StringBuilder("World");
        s10.append(s11);
        System.out.println(s10); //HelloWorld
        // StringBuilder s12 = s10.append(s11);
        // System.out.println(s12.toString()); //HelloWorld

        // Concatenation using .join() method
        String s13 = String.join(" ", s1, s2);
        System.out.println(s13); //Aakash Aakash

        //String concatenation using String.format() method
        String s14 = String.format("%s %s", s1, s2);
        System.out.println(s14); //Aakash Aakash

        // .toUpperCase() method.. 
        System.out.println(s1.toUpperCase()); //AAKASH
        System.out.println(s1); //Aakash

        // .trim() --> eleminates white spaces from start and beginning
        
        System.out.println(s1.startsWith("Aa")); //true

        System.out.println(s1.charAt(2)); // k
         
        // String.valueOf() --> converts given type like int, long, double, float, array into string 
        char[] ch = {'a','b','c','d','e'};
        String str = String.valueOf(ch);
        System.out.println(str);

        // .replace() method --> replaces all occurance of the first sequence of characters with the second sequence of characters. 
        String str1 = "Java is a Programming Language";
        String replaceString = str1.replace("Java", "Python");
        System.out.println(replaceString);
    }
}