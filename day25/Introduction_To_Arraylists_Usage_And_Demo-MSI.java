import java.io.*;
import java.util.*;

public class Introduction_To_Arraylists_Usage_And_Demo {

	public static void main(String[] args) throws Exception{
        // write your code here 
        // part 1 
       ArrayList<Integer> list; //declear

        list = new ArrayList<>(); //define
        System.out.println(list.size() + " --> " + list); // 0 --> []
        
        // part 2 
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list.size() + " --> " + list); // 4 --> [10,20,30,40] 
        
        // part 3
        list.set(1,200); //changes values, does not add a new value
        System.out.println(list.size() + " --> " + list); // 4 --> [10,200,30.40]
        
        // part 4 
        list.add(1,2000); //adds a new value, is different from set
         System.out.println(list.size() + " --> " + list); // 5 --> [10,2000,200,30.40]
         
         //part 5
         int val = list.get(1);
         System.out.println(val);// you will get 2000 (list[i]) will not work)
          System.out.println(list.size() + " --> " + list); // 5 --> [10,2000,200,30.40]
          
        //   part 6 
        list.remove(1); //delets the value at index 1
        System.out.println(list.size() + " --> " + list); // 4 --> [10,200,30.40]
        
        // part 7 
        
        for(int i = 0; i < list.size(); i++){ //loop
            int val1 = list.get(i);
            System.out.println(val1); // 10,200,30,40 
        }
        
        // part 8 
        for(int val2: list){// other style of loop
            System.out.println(val2); // 10 ,200, 30, 40
        }
        
        
    }
}
        