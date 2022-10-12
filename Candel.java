import java.util.*;
public class Candel {
    public static void main(String[] x){
        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();

            int[] arr = new int[num];

            for(int i=0;i<num;i++){
                arr[i]=sc.nextInt();
            }

            Arrays.sort(arr);
            int max=arr[num-1];
            int count=0;
            for(int i=0;i<num;i++){
                if(arr[i]==max){
                    count++;
                }
            }
            System.out.println(max);
            System.out.println(count);
        }
    }
}
