package Array;

public class MoveZeros {

    public static void main(String[] args) {
        

        int[] arr = { 1,0,0,0,0,1};
        int n = arr.length;
        int temp;
int a =0 ,b=1;
        while (b < n) {
            if(arr[b]!=0) {
             temp = arr[a];
             arr[a] = arr[b];
             arr[b] = temp;
            }
             if(arr[a] !=0) {
                a++;
             }
             b++;

        
        }

        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
         }

    }
    
}
