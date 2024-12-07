package Binary_Search;

public class SearchingElement {
    
    //This is recursive approach
    public static  int binarySearch(int [] arr , int low, int high, int target) {
        if(low>high) {
            return -1;
        }
        int mid = (low + high)/2;
        if(arr[mid]< target) {
            low = mid +1;
           return binarySearch(arr, low, high, target);
        }
        else if (arr[mid] > target ) {
            high = mid -1 ;
           return binarySearch(arr, low, high, target);
        }
        else  {
            return mid;
        }
    }

    public static void main(String[] args) {
        
        int [] arr = { 3,4,6,7,9,12,16,17};
        int target =17;
        int low = 0;
        int high = arr.length-1;
        int element = binarySearch(arr, low, high, target);
        System.out.println(element);

        // this is iterative approach 
        while(low <= high) {
        int mid = (low+ high)/2;
         if(arr[mid] < target ) {
            low = mid +1;
         }
         else if (arr[mid] > target) {
            high = mid -1 ;
         }
         else  {
            System.out.println(mid);
            break;
         }







        }


    }
    
}
