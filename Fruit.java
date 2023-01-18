import java. util.*;
class Fruit{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        while(sc.hasNext()){
            int s = sc. nextInt();
            int t = sc. nextInt();

            int a = sc. nextInt();
            int b = sc. nextInt();

            int m = sc. nextInt();
            int n = sc. nextInt();

            int[] apple = new int[m];
            int[] orange = new int[n];

            int acount = 0;
            int ocount = 0;

            for(int i=0;i<m;i++){
                apple[i] = sc.nextInt();
            }

            for(int i=0;i<n;i++){
                orange[i] = sc.nextInt();
            }

            for(int i=0;i<m;i++){
                apple[i] = apple[i]+a;
            }

            for(int i=0;i<n;i++){
                orange[i] = orange[i]+b;
            }

            for(int i=0;i<m;i++){
                if(apple[i]>=s && apple[i]<=t){
                    acount++;

                }
            }

            for(int i=0;i<n;i++){
                if(orange[i]>=s && orange[i]<=t){
                    ocount++;

                }
            }

            System.out.println(acount);

            System.out.println(ocount);

        }
        sc.close();
}
}
