package Binary_Search;

public class LastOccurence {
    public static void main(String[] args) {
        

        int [] arr = {3,4,13,14,14,20,40};
        int target = 40;
        int ans =0;
        int low = 0;
        int high = arr.length-1;
      while(low<=high) {
       int mid = low + (high-low)/2;
       if(arr[mid] == target) {
        if(mid+1<arr.length && arr[mid+1]<=target && target <=arr[high]) {
            low = mid +1;
            ans = low ;
        }
        else {
            high = mid -1;
             ans = mid ;
        }
      
    }
    else if (arr[mid] > target) {
        high = mid -1 ;
    }
       else if (arr[mid] < target ) {
        low = mid +1;
       }

      }
      System.out.println(ans);
    }
    
}
