package Array;

public class ConsecutiveOnes {

    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 1, 0, 1};
        int p = 0;
        int c =0;
for(int i=0;i<arr.length;i++) {
     if(arr[i] == 1) {
        c++;
     }
     else {
        c=0;
     }
     if(p < c) {
        p=c;
     }
}
System.out.println(p);
}   
}
