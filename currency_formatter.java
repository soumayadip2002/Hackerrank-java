import java.util.*;
import java.text.*;
public class currency_formatter {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double payment = sc.nextDouble();
            Locale indiaLocale = new Locale("en", "IN");
            NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
            NumberFormat india = NumberFormat.getCurrencyInstance(indiaLocale);
            NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
            NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);
            System.out.println("US: " + us.format(payment));
            System.out.println("India: " + india.format(payment));
            System.out.println("China: " + china.format(payment));
            System.out.println("France: " + france.format(payment));
        }
    }
}

