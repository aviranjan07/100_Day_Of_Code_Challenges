import java.util.*;

public class print_fibonacci_number {

  public static void main(String[] args) {
    // Write your code here
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    int a = 0;
    int b = 1;
    for(int i = 1; i <= n; i++){
        int c = a + b;
        System.out.println(a);
        a = b;
        b = c;
    }

  }
}