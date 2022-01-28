 /* Q. subarray problems 
input--
5
1
2
3
4
5
output--
1	
1	2	
1	2	3	
1	2	3	4	
1	2	3	4	5	
2	
2	3	
2	3	4	
2	3	4	5	
3	
3	4	
3	4	5	
4	
4	5	
5	
*/
import java.io.*;
import java.util.*;

public class Subarray_Problem{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
     int n = scn.nextInt();
     int[] arr = new int[n];

     for(int i = 0; i < arr.length; i++){
         arr[i] = scn.nextInt();
     }
     for(int si = 0; si < arr.length; si++){
         for(int ei = si; ei < arr.length; ei++){
             for(int i = si; i <= ei; i++){
                 System.out.print(arr[i] + "\t");
             }
             System.out.println();
         }
     }
 }

}