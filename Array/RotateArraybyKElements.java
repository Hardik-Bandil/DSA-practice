package Array;

public class RotateArraybyKElements {

    public static int[]  reverse(int[] arr, int start, int end) {
        int temp ;
        
        for(int i=start;i<end/2;i++) {
            temp =arr[i];
            arr[i] = arr[end -i-1];
            arr[end-i-1] = temp;
        }
   
       return arr;
    }
    
    public static void main(String[] args) {
  int[] arr  = {1,2,3,4,5,6,7,8};
  int n = arr.length;
    int k=2;
    arr = reverse(arr, 0,n);

    arr= reverse(arr, 0, k);
   arr= reverse(arr, k, n+k);

    for(int i=0;i<n ;i++) {
        System.out.print(arr[i] + " ");
    }


    //    String str = "right";
//        int [] arr = {1,2,3,4,5,6,7};
//        int [] arr2 = new int[7];
//        int p=0;
// int k =10;
// k= k % arr.length;
//    if(str=="right") {
//     for(int i=0;i<arr.length;i++) {
//         if(i+k <= arr.length-1) {
//         arr2[i+k] = arr[i];
//     }
//     else if(i+k>arr.length-1) {
//       arr2[p] = arr[i];
//       p++;
//     }
// } 
//    }
// for(int i=0;i<arr2.length;i++) {
// System.out.print(arr2[i] + " ");
// }

}
    }
