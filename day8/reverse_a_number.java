// Q1. reverce a number 
//  input -- 543 ,
//   output -- 
//   3
//   4
//   5

import java.util.*;

public class reverse_a_number {

  public static void main(String[] args) {
    // write your code here
    Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();

while(n > 0){
   int dig = n % 10;
    n = n / 10;
    System.out.println(dig);
}

  }
}