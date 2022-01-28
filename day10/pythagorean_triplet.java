/* Q. prithagorean triplet 
simple input-
3 2 12
simple output-
true 
*/
import java.util.*;
  
  public class pythagorean_triplet{
  
  	  public static void main(String[] args) {
  	  	  Scanner scn = new Scanner(System.in);
          int a = scn.nextInt();
          int b = scn.nextInt();
          int c = scn.nextInt();
  
          int max = a;
          if(b >= max)
              max = b;
  
          if(c >= max)
              max = c;
  
          if(max == a){
              System.out.println((b * b + c * c) == (a * a));
          } else if(max == b){
              System.out.println((a * a + c * c) == (b * b));
          } else {
              System.out.println((a * a + b * b) == (c * c));
          }
  	  }
  }
//   today- 1.The Curious Case Of Benjamin Bulbs 2.prithagorean triplet