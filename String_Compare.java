import java.util.*;

public class String_Compare {

    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            String A = sc.next();
            String B = sc.next();
            int C = A.length() + B.length();
            System.out.println(C);
            if (A.compareTo(B) > B.compareTo(A)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
            String first = A.substring(0, 1).toUpperCase() + A.substring(1);
            String second = B.substring(0, 1).toUpperCase() + B.substring(1);
            System.out.println(first + " " + second);
        }
        
    }
}



