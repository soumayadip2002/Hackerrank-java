import java.util.*;
class Plus{
    public static void main(String[] x){
        try (Scanner sc = new Scanner(System.in)) {
            int length = sc.nextInt();
            int[] arr = new int[length];
            for(int i=0;i<length;i++){
                arr[i]=sc.nextInt();
            }
            int plus=0;
            int minus=0;
            int zero=0;
            for(int i=0;i<length;i++){
                if(arr[i]>0){
                    plus=plus+1;
                }
                else if(arr[i]<0){
                    minus=minus+1;
                }
                else{
                    zero=zero+1;
                }
            }
            System.out.printf("%.6f", (double)plus/(double)length);
            System.out.println();
            System.out.printf("%.6f", (double)minus/(double)length);
            System.out.println();
            System.out.printf("%.6f", (double)zero/(double)length);
            System.out.println();
        }

    }
}
