import java.util.*;

public class even_odd_number {

  public static void main(String[] args) {
    // Write your code here
    Scanner scn = new Scanner(System.in);
    int num = scn.nextInt();

    int i = 1;
    while(i <= num){
        int rem = i % 2;
        if(rem == 0 ){
            System.out.println(i + " even");
        }else{
            System.out.println(i + " odd");
        }
        i++;
    }

  }
}