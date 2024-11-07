package Know_Basic_Maths;

public class Recursion_print_n_time {

    
        static int cnt = 3;
        static void print(){
            
             // Base Condition.
             if(cnt == 0 ) return;
        
    
             // Count incremented.
             cnt = cnt-1;
             System.out.println(cnt);
             print();
    }
    public static void main(String[] args) {
        
   print();



    }
}
