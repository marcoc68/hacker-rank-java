package basic;
import java.util.Scanner;

public class P018StringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        scan.close();
        
        if(s.trim().isEmpty() ) {
        	System.out.println(0);
        }else {
        	String[] tks = s.trim().split("[ !,?._'@]+");
        	System.out.println(tks.length);
        	for(String tk : tks) { System.out.println(tk); }
        }
        
    }
}
//YES      leading spaces        are valid,    problemsetters are         evillllll