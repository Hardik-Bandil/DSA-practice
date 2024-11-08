package Know_Basic_Maths;

import java.util.ArrayList;   

public class Fabonaaci {  

    public static void  fabonanni(int a, int b, int sum, int n) {
   if(a==0 && b==1) {
    System.out.print(a + " ");
   }
    if(n==1) {
        return ;
    }
   sum = a+b;
   a =b;
  b= sum;
  
  System.out.print(sum + " ");
  fabonanni(a, b, sum, n-1);
}


    public static void main(String[] args) {
    //    int a=0;
    //    int b=1;
    //    int  c =1;
    //    int n=15;
    //    int sum =0;
    //    System.out.print(a + " ");
    //      while(c<n) {
    //     sum = a+b;
    //     b=a;
    //     a= sum;
    //     System.out.print(sum + " ");
    //         c++;
    //      }
    fabonanni(0, 1, 0, 15);
     


        
       }  

    }
    
