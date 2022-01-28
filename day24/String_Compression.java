/* Q. string compression 
input-
wwwwaaadexxxxxx
output--
wadex
w4a3dex6
*/

import java.io.*;
import java.util.*;

public class String_Compression {

	public static String compression1(String str){
		// write your code here
		String ans = "";

		for(int i = 0; i < str.length() - 1; i++){
			if(str.charAt(1) == str.charAt(i - 1)){
				//nothing
			}else{
				ans += str.charAt(i);
			}
		}
         ans += str.charAt(str.length() - 1);
		return ans;
	}

	public static String compression2(String str){
		// write your code here
		String ans = "";
		int c = 1;
		 
		 for(int i = 0; i < str.length() - 1; i++){
			 if(str.charAt(i) == str.charAt(i + 1)){
				 c++;
			 }else{
				 ans += str.charAt(i);
				 if(c > 1){
					 ans += c;
					 c = 1;
				 }
			 }
		 }
		
        ans += str.charAt(str.length() - 1);
		if(c > 1){
			ans += c;
		}
		return ans;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(compression1(str));
		System.out.println(compression2(str));
	}

}
// not done
 

// type 2
/* Q. string compression 
input-
wwwwaaadexxxxxx
output--
wadex
w4a3dex6
*/
 /*
 import java.io.*;
import java.util.*;

public class Main {

	public static String compression1(String str){
		// write your code here
		String s = str.charAt(0) + "";
        
		for(int i = 1; i < str.length(); i++){
			char curr = str.charAt(i);
			char prev = str.charAt(i - 1);

			if(curr != prev){
				s += curr;
			}
		}

		return s;
	}

	public static String compression2(String str){
		String s = str.charAt(0) + "";
		int count = 1;
        
		for(int i = 1; i < str.length(); i++){
			char curr = str.charAt(i);
			char prev = str.charAt(i - 1);
          
		    if(curr == prev){
				count++;
			}else{
				if(count > 1){
					s += count;
					count = 1;
				}
				s += curr;
			}
		}
		if(count > 1){
	    	s += count;
			count = 1;
		}
		return s;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(compression1(str));
		System.out.println(compression2(str));
	}

}
*/