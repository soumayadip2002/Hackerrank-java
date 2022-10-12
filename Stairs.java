import java.util.*;
class Stairs{
    public static void main(String[] x){
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            for(int i=1;i<=n;i++){
                for(int j=n-i;j>0;j--){
                    System.out.print(" ");
                }
                for(int j=1;j<=i;j++){
                    System.out.print("#");
                }
                System.out.println();
            }
        }
        
    }
}