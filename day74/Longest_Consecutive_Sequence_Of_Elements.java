/*
Q.Longest_Consecutive_Sequence_Of_Elements
simple input-
17
12
5
1
2
10
2
13
7
11
8
9
11
8
9
5
6
11
simple output-
5
6
7
8
9
10
11
12
13
*/
import java.io.*;
import java.util.*;

public class Longest_Consecutive_Sequence_Of_Elements {

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int [] arr = new int[n];
    for(int i = 0; i < arr.length; i++){
        arr[i] = scn.nextInt();
    }

    HashMap<Integer, Boolean> map = new HashMap<>();
    for(int val: arr){
        map.put(val,true);
    }

    for(int val: arr){
        if(map.containsKey(val - 1)){
            map.put(val, false);
        }
    }
    int msp = 0;
    int ml = 0;
    for(int val:arr){
        if(map.get(val) == true){
            int tl = 1;
            int tsp = val;

            while(map.containsKey(tsp + tl)){
                tl++;
            }

            if(tl > ml){
                msp = tsp;
                ml = tl;
            }
        }
    }
    
    for(int i = 0; i < ml; i++){
        System.out.println(msp + i);
    }
 }

}