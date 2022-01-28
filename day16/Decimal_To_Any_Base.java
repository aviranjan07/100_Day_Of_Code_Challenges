/* Q. desimal to any base --
 number - 784
 base 8
 output 1420 
 */
import java.util.*;

public class Decimal_To_Any_Base {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int b = scn.nextInt();
    int dn = getValueInBase(n, b);
    System.out.println(dn);
  }

  public static int getValueInBase(int n, int b) {
     
     int dn = 0;
     int tp = 1;

     while(n > 0){
         int r = n % b;
         n = n / b;

        dn = dn + r * tp;
        tp = tp * 10; 
     }
     return dn;
  }
}

// today - 1.any base to any base 2.any base to decimal 3.desimal to any base 