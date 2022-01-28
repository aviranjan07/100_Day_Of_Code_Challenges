
//  Q. String interning 

import java.util.*;

public class String_Interning_Immutability {

      public static void main (String[] args) throws Exception{
        // write your code here 
       String s1 = "hello";
       String s2 = "hello"; //interning
       String s3 =  new String("hello"); // interning
       String s4 = s1; // ref copy

       // == just checks on stack and not the content
       // equals first chechs the stack (if equal return true, otherwise checks the content)
		
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
	}

}