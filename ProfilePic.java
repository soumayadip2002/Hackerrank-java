import java.util.*;
class ProfilePic {
    public static void main(String x[]){
        try (Scanner sc = new Scanner(System.in)) {
            int SideLength = sc.nextInt();
            int n = sc.nextInt();
            while(n-->0){
                int width = sc.nextInt();
                int height = sc.nextInt();

                if(width<SideLength || height<SideLength){
                    System.out.println("UPLOAD ANOTHER");
                }

                if(width>SideLength && height>SideLength){
                    System.out.println("CROP IT");
                }

                if(width==SideLength && height==SideLength){
                    System.out.println("ACCEPTED");
                }
            }
        }
    }
}
