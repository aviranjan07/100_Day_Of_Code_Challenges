/* Q. display arry in reverse 
input--
3
10
20
30
output--
30
20
10
*/

import java.io.*;
import java.util.*;

public class Display_Array_In_Reverse {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }
        displayArrReverse(arr, 0);
    }

    public static void displayArrReverse(int[] arr, int idx) {
          if(idx == arr.length){
              return;
          }
          
        displayArrReverse(arr, idx + 1);
         System.out.println(arr[idx]);
    }

}