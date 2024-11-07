package Know_Basic_Maths;

public class StringPalindrome {

    public static void main(String[] args) {
        
        String str = "ABCDBA";

        StringBuilder str1 = new StringBuilder();

        for(int i=str.length()-1;i>=0;i--) {
            str1.append(str.charAt(i));
        }
     
      System.out.println(str1);

    }
    
}
