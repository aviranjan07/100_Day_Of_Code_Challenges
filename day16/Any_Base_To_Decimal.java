/* Q. any base to decimal
 input --
number 1420
 base 8
 output - 784
*/
import java.util.*;

public class Any_Base_To_Decimal {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int b = scn.nextInt();
    int d = getValueIndecimal(n, b);
    System.out.println(d);
  }

  public static int getValueIndecimal(int n, int b) {
    
      int dn = 0;
      int bp = 1;
      while(n > 0){
          int r = n % 10;
           n = n / 10;
          dn = dn + r * bp;
          bp = bp * b; 
      }
      return dn;
  }
}