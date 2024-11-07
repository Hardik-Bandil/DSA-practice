package Know_Basic_Maths;

public class SumfirstNNatural {

    public static void func(int i, int n, int sum) {
         
        if(i>n) {
              System.out.println(sum);
              return;
        }
     sum = sum + i;
     System.out.println(i);
    func(i+1, n, sum);

    }

    public static void main(String[] args) {
        
        func(1, 5, 0);

    }
    
}
