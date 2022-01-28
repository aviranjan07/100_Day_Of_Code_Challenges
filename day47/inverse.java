import java.util.*;

public class inverse { 

  public static void main(String[] args) {
    // Write your code here
    int p = 1;
    int inv = 0;
    while(n > 0){
       int r = n % 10;
       int q = n / 10;
       n = r;
       inv = inv + p * (int)Math.pow(10 * r - 1);
       p++;
    }
    System.out.println(inv);
  }
}