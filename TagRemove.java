import java.util.*;
import java.util.regex.*;
public class TagRemove {
    public static void main(String x[]){
        try (Scanner sc = new Scanner(System.in)) {
            int tc = sc.nextInt();
            while(tc-->0){
                String line = sc.next();
                Pattern p = Pattern.compile("<(.+)>([^<]+)</\\1>");
                Matcher m = p.matcher(line);
                if(!m.find()) {
                    System.out.println("None");
                }
                else {
                    do {
                        System.out.println(m.group(2));
                    }
                    while(m.find());
                }
            }
        }
    }
}
