/* Q. last index 
input--
6
15
11
40
4
4
9
4 find
output--
4
*/

import java.io.*;
import java.util.*;

public class last_index {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }
        int x = scn.nextInt();
        int li = lastIndex(arr, 0, x);
        System.out.println(li);
    }

    public static int lastIndex(int[] arr, int idx, int x){
          if(idx == arr.length){
              return -1;
          }

         int liisa = lastIndex(arr, idx + 1, x);
         if(liisa == -1){
             if(arr[idx] == x){
                 return idx;
             }else{
                 return -1;
             }
         }else{
             return liisa;
         }
    }

}