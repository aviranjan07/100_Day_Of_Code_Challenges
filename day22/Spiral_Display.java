/* Q. piral Display
simple input-
3
5
11
12
13
14
15
21
22
23
24
25
31
32
33
34
35
simple output-
11
21
31
32
33
34
35
25
15
14
13
12
22
23
24
*/
import java.io.*;
import java.util.*;

public class Spiral_Display {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        int[][] arr = new int[n][m];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        int minr = 0;
        int minc = 0;
        int maxr = arr.length - 1;
        int maxc = arr[0].length - 1;
        int total = n * m;
        int count = 1;

        while(count <= total){
            for(int i = minr; i <= maxr && count <= total; i++){
                System.out.println(arr[i][minc]);
                count++;
            }
            minc++;
            for(int j = minc; j <= maxc && count <= total; j++){
                System.out.println(arr[maxr][j]);
                count++;
            }
            maxr--;
            for(int i = maxr; i >= minr && count <= total; i--){
                System.out.println(arr[i][maxc]);
                count++;
            }
            maxc--;
            for(int j = maxc; j >= minc && count <= total; j--){
                System.out.println(arr[maxr][j]);
                count++;
            }
            minr++;
        }
    }

}

// not done