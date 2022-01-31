/*
Q. get_common_elements_1
simple input-
9
5
5
9
8
5
5
8
0
3
18
9
7
1
0
3
6
5
9
1
1
8
0
2
4
2
9
1
5
simple output-
9
0
3
5
8
*/
import java.io.*;
import java.util.*;
public class Get_Common_Elements_1{
    public static void main(String[] args) throws Exception{
        // write your code here 
        Scanner scn = new Scanner(System.in);

        int n1 = scn.nextInt();
        int[] a1 = new int[n1];
        for(int i = 0; i < a1.length; i++){
            a1[i] = scn.nextInt();
        }
        int n2 = scn.nextInt();
        int[] a2 = new int[n2];
        for(int i = 0; i < a2.length; i++){
            a2[i] = scn.nextInt();
        }

        HashMap<Integer, Integer> fmap = new HashMap<>();
        for(int Val: a1){
            if(fmap.containsKey(Val)){
                int of = fmap.get(Val);
                int nf = of + 1;
                fmap.put(Val, nf);
            }else{
                fmap.put(Val, 1);
            }
        }

        for(int Val: a2){
            if(fmap.containsKey(Val)){
                System.out.println(Val);
                fmap.remove(Val);
            }
        }
    }
}