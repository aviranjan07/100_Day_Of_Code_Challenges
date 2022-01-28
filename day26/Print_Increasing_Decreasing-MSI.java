/* Q.Print Increasing Decreasing
input--
3
output--
3
2
1
2
3
*/
import java.io.*;
import java.util.*;

public class Print_Increasing_Decreasing {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        pdi(n);
    }

    public static void pdi(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        pdi(n - 1);
        System.out.println(n);
    }

}
