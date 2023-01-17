import java.util.Scanner;

class IP_Address{

    public static void main(String[] args){
        try (Scanner in = new Scanner(System.in)) {
            while(in.hasNext()){
                String IP = in.next();
                System.out.println(IP.matches(new myRegex().pattern));
            }
        }
    }
}

class MyRegex{
   String expression = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
   public String pattern = expression + "\\." + expression + "\\." + expression + "\\." + expression;
}