package Binary_Search;

public class MinimunNumber {
    public static void main(String[] args) {
        
        int [] arr = {4,5,6,7,0,1,2,3};
       
            int low = 0, high = arr.length - 1;
            int ans = Integer.MAX_VALUE;
            while (low <= high) {
                int mid = (low + high) / 2;
    
                //if left part is sorted:
                if (arr[low] <= arr[mid]) {
                    // keep the minimum:
                    ans = Math.min(ans, arr[low]);
    
                    // Eliminate left half:
                    low = mid + 1;
    
                } else { //if right part is sorted:
    
                    // keep the minimum:
                    ans = Math.min(ans, arr[mid]);
    
                    // Eliminate right half:
                    high = mid - 1;
                }
       
    }
    System.out.println(ans);
}
    
}
