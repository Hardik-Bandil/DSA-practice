package Binary_Search;

public class SearchPosition {

    public static int[] getFloorAndCeil(int[] a, int n, int x) {
     
        int low =0;
        int high = a.length-1;
        while(low<high) {
         int mid = (low + (high-low)/2);
  
          if(a[mid] == x)  {
            return new int[]{a[mid], a[mid]};
          
          }
          else if(a[mid]> x) {
            high = mid;
          }
          else if(a[mid]< x) {
            low = mid+1;
          }
        
        }
          if(x< a[low] && low==0) {
            low =-1;
            return new int[]{low, a[high]};
          }
          else if(x> a[high]&& high == a.length-1) {
            high =-1;
             return new int[]{a[low], high};
          }
          else if (x==a[low] || x==a[high]) {
            return new int[]{x, x};
          }
          else {
            return new int[]{a[low-1], a[high]};
          }
          
         
         
        // Wriute your code here.
      }

    public static void main(String[] args) {
        
       int array[] = {3,13,13,14,15,20,40};
       int target = 13;
       int n = array.length-1;
       int low = 0;
       int high = n;
    


    }
    
}
