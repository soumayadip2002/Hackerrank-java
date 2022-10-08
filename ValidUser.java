import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class ValidUser {
    public static void main(String x[]){
        try (Scanner sc = new Scanner(System.in)) {
            int tc = sc.nextInt();

            while(tc-->0){
                String s = sc.next();
                Pattern p = Pattern.compile("^[a-zA-Z]\\w{7,29}$");
                Matcher m = p.matcher(s);
   
                boolean match = m.find();
   
                if(match){
                    System.out.println("Valid");
                }
                else{
                    System.out.println("Invalid");
                }
            }
        }
    }
}
