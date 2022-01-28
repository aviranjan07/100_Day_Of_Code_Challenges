/* Q.the state of wakanda 2 
input-
11 12 13 14
21 22 23 24
31 32 33 34
41 42 43 44
output -
11  12 13 14
  22  23 24
    33  34
      44
*/
import java.io.*;
import java.util.*;

public class The_State_Of_Wakanda2 {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[][] arr = new int[n][n];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        for(int g = 0; g < arr[0].length; g++){
           for(int i = 0, j = g; j < arr[0].length; i++, j++){
               System.out.println(arr[i][j]);
           }
        }
    }

}