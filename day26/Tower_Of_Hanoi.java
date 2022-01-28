/* Q. Tower Of Hanoi
input --
3
10
11
12
output--
1[10 -> 11]
2[10 -> 12]
1[11 -> 12]
3[10 -> 11]
1[12 -> 10]
2[12 -> 11]
1[10 -> 11]
*/
import java.io.*;
import java.util.*;

public class Tower_Of_Hanoi {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int t1d = scn.nextInt();
        int t2d = scn.nextInt();
        int t3d = scn.nextInt();

        toh(n, t1d, t2d, t3d);
    }

    public static void toh(int n, int t1id, int t2id, int t3id){
         if(n == 0){
             return;
         }
        toh(n -1, t1id, t3id, t2id);
        System.out.println(n + "[" + t1id + " -> " + t2id + "]");
        toh(n - 1, t3id, t2id, t1id);
    }

}

// today- 1.Factorial 2.power linear 3.Power-logarithmic 4.print printDecreasing 5.Print Increasing Decreasing 6.print Increasing 7.print Zigzag  8.Tower Of Hanoi 