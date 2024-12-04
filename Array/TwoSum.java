package Array;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        
        Integer[] arr = {2,6,5,8,11};
       Integer a=0;
       Integer target = 14;
        Map<Integer, Integer> hashArray = new HashMap<>();

        for(Integer i=0;i<arr.length;i++) {
        hashArray.put(target - arr[i], i); 
    }

    // for(Integer i=0;i<arr.length;i++) {
    //    System.out.print(hashArray.get(i) + " ");
    // }

       for( int i=0;i<arr.length;i++) {
          if(hashArray.containsKey(arr[i])) {
            System.out.println("YES");
            System.out.println("[" + i  + ", " + hashArray.get(arr[i])  + "]");
            break;
          }
       }
    
}
}
