package Binary_Search;

public class RotatedSortedArray1 {
    public static void  main(String[] args) {
        
        int []arr4 = {4,5,6,7,0,1,2,3};
        int [] arr2= {5,6,7,0,1,2,3,4};
        int [] arr3 = {6,7,0,1,2,3,4,5};
        int [] arr = {3,4,5,6,7,0,1,2};
        int []  arr5 = { 2,3,4,5,6,7,0,1};
                int low = 0;
        int high = arr.length-1;
        int target =  9;
        int mid =0;
        while(low<=high) {
             mid = low +(high-low)/2;
            if(arr[mid] == target ) {
               
                break; 
            }
            else if(arr[mid] > target ) {
                if(arr[low] <= target &&  target < arr[mid]) {
                   high = mid -1;
                }
                else if(arr[low] > target) {
                    low++;
                    continue;
                }
                else {
                    low = mid +1;
                }
            }
            else if(arr[mid] < target) {
                if(arr[mid] <= target && target< arr[high]) {
                 low = mid + 1;
                }
                else if(arr[high] < target) {
                    
                    break;
                }
                else {
                    high = mid -1 ;
                }
            }
        }
        if(arr[high] < target) {
            System.out.println("useless");
        }
        else {
        System.out.println(mid);
        }
    }
    
}
