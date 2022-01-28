import java.io.*;
import java.util.*;

public class ring_rotate {

  public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int m = scn.nextInt();

     int[][] twodarr = new int[n][m];
     for(int i = 0; i < twodarr.length; i++){
         for(int j = 0; j < twodarr[0].length; j++){
             twodarr[i][j] = scn.nextInt();
         }
     }
     int s = scn.nextInt();
     int r = scn.nextInt();

    //  make a oned array and fill it with the ring (spiral display)
    int[]onedarr = fillOnedArry(twodarr, s);
    // rotate the oned array 
    rotate(onedarr, r);
    // fill the ring back from rotated 1d array 
    fillTwodArry(onedarr, twodarr, s);

     for(int i = 0; j < twodarr[i].length; j++){
         for(intj = 0; j < twodarr[i].length; j++){
             System.out.println(twodarr[i][j] + " ");
         }
         System.out.println();
     }
   }
   
   public static int[] fillOnedArry(int[][] twodarr , int s){
        int rows = arr.length;
      int cols = arr[0].length;

      int rmin = s - 1;
      int cmin = s - 1;
      int rmax = rows - s;
      int cmax = cols - s;

      int sz = 2 * rmax + 2 * cmax + 2 * rmin + 2 * cmin;
      int[] onedarr = new int[cz];    
      
      int idx = 0;

     //left wall
     for(int i = rmin, j = cmin; i <= rmax; i++){
          onedarr[idx] = twodarr[i][j];
         idx++;
     }
     cmin++;

    //   bottom wall 
    for(int i = rmax, j = cmin; j <= cmax; j++){
        onedarr[idx] = twodarr[i][j];
         idx++;
    }
    rmax--;

    //right wall
    for(int i = rmax, j = cmax; i >= rmin; i--){
        onedarr[idx] = twodarr[i][j];
         idx++;
    }
    cmax--;

    //  top wall  
    for(int i = rmin, j = cmax; j >= cmin; j--){
         onedarr[idx] = twodarr[i][j];
         idx++;
    }
    rmin++;

     return onedarr;
    }

   public static void fillTwodArr(int[] onedarr, int[][] twodarr, int s){
      int rows = arr.length;
      int cols = arr[0].length;

      int rmin = s - 1;
      int cmin = s - 1;
      int rmax = rows - s;
      int cmax = cols - s;
      
      

      int idx = 0;

     //left wall
     for(int i = rmin, j = cmin; i <= rmax; i++){
         twodarr[i][j] = onedarr[idx];
         idx++;
     }
     cmin++;

    //   bottom wall 
    for(int i = rmax, j = cmin; j <= cmax; j++){
       twodarr[i][j] = onedarr[idx];
         idx++;
    }
    rmax--;

    //right wall
    for(int i = rmax, j = cmax; i >= rmin; i--){
        twodarr[i][j] = onedarr[idx];
         idx++;
    }
    cmax--;

    //  top wall  
    for(int i = rmin, j = cmax; j >= cmin; j--){
        twodarr[i][j] = onedarr[idx];
         idx++;
    }
    rmin++;

   
   }

   public static void rotate(int[] onedarr, int r){
       r = r % onedarr.length;
       if(r < 0){
           r += onedarr.length;
       }
     reverse(onedarr, 0, onedarr.length - r - 1);
     reverse(onedarr, onedarr.length - r, onedarr.length - 1);
     reverse(onedarr, 0, onedarr.length - 1);
   }

   public static void reverse(int[]onedarr , int left, int right){
       while(left < right){
           int temp = onedarr[left];
           onedarr[left] = onedarr[right];
           onrdarr[right] = temp;

           left++;
           right--;
       }
   }
}
 // not done 