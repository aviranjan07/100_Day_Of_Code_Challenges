/* Q.Remove Primes
input--
4
3 12 13 15
output--
[12, 15]
*/
import java.io.*;
import java.util.*;

public class Remove_primes {

	public static boolean isPrime(int num){
        boolean isPrime = true;

        for(int div = 2; div * div <= num; div++){
            if(num % div == 0){
                isPrime = false;
                break;
            }
        }

        return isPrime;

		
	}
    public static void solution(ArrayList<Integer> al){
          	// write your code here
              for(int i = 0; i < al.size(); i++){
                  int val = al.get(i);
                  boolean isThisValPrime = isPrime(val);
                  if(isThisValPrime == true){
                      al.remove(i);
                      i--;
                  }
              }
    }

public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		ArrayList<Integer> al = new ArrayList<>();
		for(int i = 0 ; i < n; i++){
			al.add(scn.nextInt());
		}
		solution(al);
		System.out.println(al);
	}

}