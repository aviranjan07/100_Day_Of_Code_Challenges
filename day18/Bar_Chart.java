/* Q. bar chart 
5 (number)
3
1
0
7
5
output - 
			*		
			*		
			*	*	
			*	*	
*			*	*	
*			*	*	
*	*		*	*	
*/
import java.io.*;
import java.util.*;

public class Bar_Chart {

  public static void main(String[] args) throws Exception {
     //part 1 
    Scanner scn = new Scanner(System.in);
     int n = scn.nextInt();

     int[] arr = new int[n];
     for(int i = 0; i < arr.length; i++){
         arr[i] = scn.nextInt();
     }
     //part 2
     int max = arr[0];
     for(int i = 0; i < arr.length; i++){
         if(arr[i] > max){
             max = arr[i];
         }
     }
     //the shape
     for(int ht = max; ht >= 1; ht--){
         for(int i = 0; i < arr.length; i++){
             if(arr[i] >= ht ){
                 System.out.print("*\t");
             }else{
                 System.out.print("\t");
             }
            
         }
          System.out.println();
     }
  }

}