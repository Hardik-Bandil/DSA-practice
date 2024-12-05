package Array;
public class SortArrayZerosOnesTwo {
    public static void main(String[] args) {
        
      int [] arr = {1,0,2,1,2,0};
      int left=0;
     
      int mid = 0;
      int right = arr.length-1;

      while(mid<=right) {

        if(arr[mid] == 0) {
            int temp;
            temp= arr[mid];
            arr[mid] = arr[left];
            arr[left] = temp ;
            left++;
            mid++;
        }
         else if (arr[mid] == 1) {
            mid++;
         }
        else   {
            int temp;
            temp= arr[mid];
            arr[mid] = arr[right];
            arr[right] = temp ;
            right--;
        }
      }
for (int i : arr) {
   System.out.println(i); 
}



    }
    
}
