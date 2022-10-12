import java.util.*;
import java.util.regex.*;
public class HTMLTag {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = Integer.parseInt(sc.nextLine());
        Pattern p = Pattern.compile("<(.+)>([^<>]+)</\\1>");
        for(int i=0;i<tc;i++){
            boolean match = false;
            String str = sc.nextLine();
            Matcher m = p.matcher(str);
            while (m.find()){
                System.out.println(m.group(2));
                match=true;
            }
            if(!match){
                System.out.println("None");
            }
        }
    }
}