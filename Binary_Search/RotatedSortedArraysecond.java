package Binary_Search;

public class RotatedSortedArraysecond {
    public static void main(String[] args) {
        
        int [] arr2 = {7,8,1,2,3,3,3,4,5,6};
        int [] arr = {6,7,8,1,2,3,3,3,4,5};
        int low = 0;
        int high =  arr.length-1;
        int target = 3;
        int ans =0;
    while(low<=high) {

    int mid = low + (high - low)/2;
    if(arr[mid] == target) {
        ans = mid;
        break;
    }
    else if (arr[low]==arr[mid] && arr[mid] == arr[high]) {
        low = mid+1;
        high = mid -1;
        ans = mid ;
        break;
    }
    else if(arr[mid] > target ) {
        if(arr[low]<= target && target < arr[mid]) {
            high = mid-1;
        }
        else {
            low =mid +1;
        }
    }
    else if(arr[mid]< target ) {
        if(arr[mid]< target && target <= arr[high]) {
           low =mid +1;
        }
        else {
            high = mid -1;
        }
    }
    }
    System.out.println(ans);
    }
}
