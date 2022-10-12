import java.util.*;
public class MaxMin {
    public static void main(String[] x){
        try (Scanner sc = new Scanner(System.in)) {
            long[] arr = new long[5];

            for(int i=0;i<5;i++){
                arr[i]=sc.nextInt();
            }

            long sum=0;
            for(int i=0;i<5;i++){
                sum=sum+arr[i];
            }
            long[] str = new long[5];
            for(int i=0;i<5;i++){
                str[i]=sum-arr[i];
            }

            Arrays.sort(str);
            
            System.out.println(str[0] + " " + str[4]);
        }

    }
}
