/* Q.String With Difference Of Every Two Consecutive Characters
input--
aviranjan
output-
a21v-13i9r-17a13n-4j-9a13n
*/
import java.io.*;
import java.util.*;

public class String_With_Difference_Of_Every_Two_Consecutive_Characters {

	public static String solution(String str){
		// write your code here
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < str.length(); i++){
         if(i == str.length() - 1){
            char chi = str.charAt(i);
            sb.append(chi);
         }
         else{
             char chi = str.charAt(i);
             char cip1 = str.charAt(i + 1);
             sb.append(chi);
             sb.append(cip1 - chi);
         }
     }
		return sb.toString();
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(solution(str));
	}

}