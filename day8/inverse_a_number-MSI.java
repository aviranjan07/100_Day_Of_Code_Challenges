// Q2. Inverce of a number 

// input - 45213
// output-   45132
  
import java.util.*;

public class inverse_a_number {

  public static void main(String[] args) {
    // write your code here
   Scanner scn = new Scanner(System.in);
   int n = scn.nextInt();

   int p = 1; //p = position
   int inv = 0; // inv = inverce
    while(n > 0){
        int r = n % 10; //r = reminder
        int q = n / 10; // q = quosnt

        n = q; 

        inv = inv + p * (int)Math.pow(10, r - 1);
        p++;
    }
       System.out.println(inv)
  }
}