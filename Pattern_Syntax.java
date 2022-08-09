
import java.util.Scanner;
import java.util.regex.*;

public class Pattern_Syntax {
    public static void main(String[] args){
        try (Scanner in = new Scanner(System.in)) {
           int testCases = Integer.parseInt(in.nextLine());
           while (testCases > 0) {
               String pattern = in.nextLine();

               try {
                   Pattern.compile(pattern);
                   System.out.println("Valid");
               } catch (Exception e) {
                   System.out.println("Invalid");
               }
               testCases--;
           }
       } catch (NumberFormatException e) {
           e.printStackTrace();
       }
   }
}





