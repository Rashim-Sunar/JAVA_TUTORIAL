/* String Tokenizer
 The java.util.StringTokenizer class allows you to break a String into tokens. 
 It doesn't provide the facility to differentiate numbers, quoted strings, identifiers etc. like StreamTokenizer class.
  The StringTokenizer class is deprecated now. It is recommended to use the split() method of the String class or the Pattern class t
  hat belongs to the java.util.regex package.
 */

 // Syntax: StringTokenizer(String str, String delimiter, boolean returnValue)

import java.util.StringTokenizer;

public class String_Tokenizer {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("My name is Khan", " ", false); // returnValue false means not taking the delimiter in the string tokenizer object(i.e. in tokenized string)
        
        // .countTokens() --> returns total number of token in tokenizer string 
        System.out.println(st.countTokens()); //4

        while(st.hasMoreTokens()){ // .hasMoreTokens() --> checks if more tokens available in string tokenizer object
            System.out.println(st.nextToken()); // .nextToken(String delim) --> returns the next token from the string tokenizer object
            /*
             My
             name
             is
             khan
             */
        }
    }
}
