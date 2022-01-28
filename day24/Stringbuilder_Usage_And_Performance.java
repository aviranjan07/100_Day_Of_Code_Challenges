//   part 1 
  
import java.util.*;

public class Stringbuilder_Usage_And_Performance {

      public static void main (String[] args){
        // write your code here 
        StringBuilder sb = new StringBuilder("aviranjan");
        System.out.println(sb);
        
        //get
        char ch = sb.charAt(0);
        System.out.println(ch);
        
        // update
        sb.setCharAt(0,'b');
        System.out.println(sb);
        
        // insert 
        sb.insert(2, 'i');
        System.out.println(sb);
        
        // remove 
        sb.deleteCharAt(2);
        System.out.println(sb);
        
        // append
        sb.append("das");
        System.out.println(sb);
       
	}

}
/*
// part 2 
import java.util.*;

public class Main {

      public static void main (String[] args){
        // write your code here 
        int n = 10000;
        
        long start = System.currentTimeMillis();
        
        // part 1 
    // when its strings , give 171 mili sec (n = 10000)   
        //  String s = "";
        //  for(int i = 0; i < n; i++){
        //      s += i;
        //  }
        
        // part 2 
    //but, when we use the StringBuilder , give 2 mili sec (n = 10000) 
        StringBuilder sb = new StringBuilder();
         for(int i = 0; i < n; i++){
             sb.append(i);
         }
        
        long end = System.currentTimeMillis();
        long duration = end - start;
        System.out.println(duration);
        
    	}

}
*/