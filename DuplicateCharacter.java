import java.util.*;
class DuplicateCharacter{
    public static void main(String x[]){
        try (Scanner sc = new Scanner(System.in)) {
            String s = sc.next();
            char[] arr = s.toCharArray();
            int count=0;

            for(int i=0;i<arr.length;i++){
                int j;
                for(j=0;j<i;j++){
                    if(arr[i]==arr[j]){
                        break;  
                    }
                }
                if(j==i){
                    arr[count++]=arr[i];
                    
                }
            }
            System.out.println(String.valueOf(Arrays.copyOf(arr, count)));
            
        }
    }
}