/* Q1. reverce a number 
  input -- 543 ,
   output -- 
   3
   4
   5
*/
import java.util.*;

public class reverse_a_number {

  public static void main(String[] args) {
    // Write your code here
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    while(n != 0){
        int q = n / 10;
        int r = n % 10;
        System.out.println(r);
        n = q;
        
    }
  }
}
// today- 1.Count digits in a number 2.Inverce of a number 3.reverce a number  