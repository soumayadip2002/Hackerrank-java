import java.util.*;
public class End_of_File {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            for (int i = 1; sc.hasNext() == true; i++) {
                String b = sc.nextLine();
                System.out.println(i + " " + b);
            }
        }
    }
}
