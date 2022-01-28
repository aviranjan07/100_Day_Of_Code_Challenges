/* Q. pattern 7 , when input is 5 

   *
     *
       * 
         *
           *
*/
import java.util.*;

public class pattern7 {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();

     int nsp = 0;
      for(int i = 1; i <= n; i++){
          for(int j = 1; j <= nsp; j++){
              System.out.print("\t");
              
          }
          System.out.println("*");
          nsp++;
      }
   
 

  }
}
// aviranjan07