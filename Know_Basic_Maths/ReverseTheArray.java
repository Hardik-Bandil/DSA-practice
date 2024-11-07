package Know_Basic_Maths;

import java.util.Arrays;
import java.util.Collections;

public class ReverseTheArray {

//     public static void main(String[] args) {
//        int temp =0;
// Integer arr[] = {1,2,3,4,5};
// int n= arr.length;
// for(int i=0; i<arr.length;i++) {

//     if(!(i < n-1)) {
//     temp = arr[i];
//     arr[i] = arr[n- i-1];
//     arr[n- i-1] = temp;
// }
// }
// for(int i=0; i<arr.length;i++) {
//      System.out.println(arr[i]);

//     }
//}

 static void printArray(int arr[], int n) {
      System.out.print("Reversed array is:- \n");
      for (int i = 0; i < n; i++) {
         System.out.print(arr[i] + " ");
      }
   }
   //Reverse array using library function
   static void reverseArray(int arr[]) {
      //fetching array as list object
      //reversing the fetched object
      Collections.reverse(Arrays.asList(arr));
   }
   public static void main(String[] args) {
      int n = 5;
      int arr[] = {5,4,3,2,1};
      reverseArray(arr);
      printArray(arr, n);
   }
    
}
