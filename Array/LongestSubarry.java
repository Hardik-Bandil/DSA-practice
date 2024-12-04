package Array;

import java.util.HashMap;
import java.util.Map;

public class LongestSubarry {


public static void bruteForce(int [] arr, int k) {

  int sum =0; 
  int len=0;
 
  int max = 0;
   for(int i=0;i< arr.length;i++) {
    sum =0;
    for(int j=i;j<arr.length;j++) {
        sum = sum +arr[j] ; 
        if(sum == k) {
          
         len = j-i +1; //3 5
         if(len > max ) {
           max = len;
         
         }
        }
       
    }
  
   }
   System.out.print("length " + max + " ");
}



    public static void main(String[] args) {
      int [] arr = {2,3,5,1,9};
      //bruteForce(arr, 10);
      int k=10;
      long sum = 0;
    
      int len =0;
      int maxLen =0;
     Map<Long, Integer>  mapHash = new HashMap<>();
     
     for(int  i=0;i<arr.length;i++) {
      sum = sum + arr[i];
   long rem = sum - k;
   
   if (sum == k) {
    maxLen = Math.max(maxLen, i + 1);
}
    if(mapHash.containsKey(rem)) {
      len = i - mapHash.get(rem);
      maxLen= Math.max(maxLen, len);
    }
    else {
      mapHash.put(sum, i);
    }

     }
    System.out.println(maxLen);
    }
  }
    
