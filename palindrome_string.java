import java.util.*;
public class palindrome_string {
    
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            String A = sc.next();
            int size = A.length();
            if (size > 0 || size <= 50) {
                String first = A.substring(0, 1);
                String last = A.substring(size - 1);
                if (first.equals(last)) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            } else {
                System.out.println("Too much length!");
            }
        }

    }

    
}
