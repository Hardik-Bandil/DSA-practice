package Array;

import java.util.stream.Collectors;

public class NumberOnePairTwice {

    public static int getElementSingleOne(int[] arr) {
int xor = 0;
        for(int i=0;i<arr.length;i++){
             xor = xor ^ arr[i];
        }
        return xor;
    }

    public static void main(String[] args) {

        int[] arr = {4,1,2,1,2};
        int xor = getElementSingleOne(arr);
        System.out.println(xor);
    }
    
}
