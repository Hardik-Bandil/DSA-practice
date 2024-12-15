package Binary_Search;

public class LowerBound {
    public static void main(String[] args) {
        
        int [] arr = { 3,5,11,15,19};
        int target = 9;
        int low = 0;
        int high = arr.length-1;

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
            System.out.println(low);

        // while(low<high) {
        //    int  mid = (low + high)/2;
           
        //    if(arr[mid] < target) {
        //     low = mid +1 ;
        //     if(arr[low] < target) {
        //         continue;
        //     }
        //     else {
        //         System.out.println(low);
        //         break;
        //     }
        //    }
        //    else if( arr[mid] > target) {
        //     high = mid -1;
        //     if(arr[high] < target) {
        //         System.out.println(mid);
        //         break;
        //     }
        //     else {
        //         System.out.println(high);
        //         break;
        //     }
        //    }
        //    else {
        //     System.out.println(mid);
        //    }
        // }

    }
    
}
