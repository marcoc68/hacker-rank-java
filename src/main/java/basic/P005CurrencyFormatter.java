package basic;
import java.util.*;
import java.text.*;

public class P005CurrencyFormatter {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        // Write your code here.
        String us     = formLoc(payment,"en","US");
        String india  = formLoc(payment,"en","IN");
        String china  = formLoc(payment,"zh","CN");
        String france = formLoc(payment,"fr","FR");
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
    
    static String formLoc(double val, String lang, String country ) {
    	Locale       loc = new Locale(lang,country);
    	NumberFormat  nf = NumberFormat.getCurrencyInstance(loc);
    	return nf.format(val);
    }
}
