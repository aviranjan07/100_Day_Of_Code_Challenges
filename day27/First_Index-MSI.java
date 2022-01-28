/* Q. firstIndex
input--
6 (number)
15
11
40
4
4
9
4(find)
output--
3
*/
import java.io.*;
import java.util.*;

public class First_Index {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }
        int d = scn.nextInt();
        int f1 = firstIndex(arr, 0, d);
        System.out.println(f1);
    }

    public static int firstIndex(int[] arr, int idx, int x){
         if(idx == arr.length){
             return -1;
         }

        if(arr[idx] == x){
            return idx;
        }else{
            int fiisa = firstIndex(arr, idx + 1, x);
            return fiisa;
        }
    }

}