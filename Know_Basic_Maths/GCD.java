package Know_Basic_Maths;

public class  GCD{

    public static int gcd(int x, int y) {
        int r = x%y;
         if(r ==0) {
           return y;
         }
       
        return gcd(y,r);
       }
    public static void main(String[] args) {
//         int n= 26;
//         int q = 32, r =1 ;
//         while(r != 0) {
//           r= q%n;
//           q=n;
//         if(r==0) {
//             break;
//         }
//           n=r;
//         }
// System.out.println(q );

System.out.println(gcd(26,32));
    }
}