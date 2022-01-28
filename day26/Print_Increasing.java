/* Q. print Increasing
input--
5
output--
1
2
3
4
5
*/


import java.io.*;
import java.util.*;

public class Print_Increasing {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printIncreasing(n);
    }

    public static void printIncreasing(int n){
        if(n == 0){
            return;
        }
         printIncreasing(n - 1);
        System.out.println(n);
      
        
    }

}