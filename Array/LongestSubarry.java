package Array;

public class LongestSubarry {
    public static void main(String[] args) {
       
        int arr[] = {-1,1,1};
        int n = arr.length;
        int k=1;
        int ptr1= 0;
        int ptr2 = 1;
        int sum =0;
        int maxlength =0 ;
        int currentlength =0;

        while(ptr2<n) {
          sum=0;
         for(int i=ptr1;i<=ptr2 ;i++){
        sum = arr[i] + sum;
         }

         if(sum<k) {
            ptr2++;
         }

         else if(sum > k) {
            ptr1++;
         }

         else {
         currentlength = ptr2- ptr1 +1;
            ptr2++;
         if(ptr2==n-1){
           ptr1++;
         }
      
         if(maxlength<= currentlength) {
            maxlength = currentlength;
            System.out.println(maxlength);
         }
         
         }
        }

        
          }
    
    }
    
