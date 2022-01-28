/* pattern 14 , when input is 6 
6 * 1 = 6
6 * 2 = 12
6 * 3 = 18
6 * 4 = 24
6 * 5 = 30
6 * 6 = 36
6 * 7 = 42
6 * 8 = 48
6 * 9 = 54
6 * 10 = 60
*/
import java.util.*;

public class pattern14 {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
      int x = scn.nextInt();

      for(int i = 1; i <= 10; i++){
        int v = x * i;
        System.out.println(x + " * " + i + " = " + v);
      }
    

  }
}