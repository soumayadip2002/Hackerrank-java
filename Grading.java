import java.util.*;
public class Grading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = Integer.parseInt(sc.nextLine());
        for(int i=0;i<tc;i++){
            int number = sc.nextInt();
            int nearest = (number + 4) / 5 * 5;

            System.out.println(nearest);
            if(number>=38 && nearest-number<3){
                    System.out.println(nearest);
            }
            else{
                System.out.println(number);
            }
        }
    }
}

