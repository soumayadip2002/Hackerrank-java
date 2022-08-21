import java.util.*;
class Village {
    public static void main(String x[]){
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            String s="";
            for(int i=0;i<n+1;i++){
                s = s+sc.nextLine();
            }
            

            if(s.contains("HH")){
                System.out.println("No");
            }
            else{
                System.out.println("Yes");
                String ans = s.replace('.', 'B');
                System.out.println(ans);
            }
        }
        
        
    }
}
