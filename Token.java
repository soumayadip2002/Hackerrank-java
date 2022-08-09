import java.util.*;
public class Token {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
   String s = scan.nextLine();
   String v = s.trim();

   if (v.length() == 0 || v.length() > 400000) {
       System.out.println(0);
   } else {
       String[] tokens = v.split("[, \\t!?._'@]+");

       int size = tokens.length;

       System.out.println(size);

       for (String a : tokens)
           System.out.println(a);
   }

    }
    }
    
}


