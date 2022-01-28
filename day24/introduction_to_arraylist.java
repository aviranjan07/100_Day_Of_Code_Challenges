import java.util.*;

public class introduction_to_arraylist {

      public static void main (String[] args){
        //input   
          Scanner scn = new Scanner(System.in);
           String s = scn.nextLine();
           System.out.println(s);
          
// 		declear and define 
		String s1 = "aviranjan";
		System.out.println(s1);
		
		//char and length of String
		for(int i = 0; i < s1.length(); i++){
		    char ch = s1.charAt(i);
		    System.out.println(ch);
		}
		//+-
		s1 += " das";
		System.out.println(s1);
		
		System.out.println(10 + 20 + " aviranjan " + 10 + 20);
		
		//sub string
		
		String s2 = "aviranjan";
		
		System.out.println(s2.substring(1,4));
		System.out.println(s2.substring(0,9));
		System.out.println(s2.substring(0));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}