package basic;

import java.util.Scanner;
 
public class P013StringIntroduction {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length()+B.length());
        
        if( A.compareTo(B) > 0 ) {
        	System.out.println("Yes");
        }else {
        	System.out.println("No");
        }
        System.out.println(capitalize(A) + " " + capitalize(B));
        sc.close();
    }
    
    static String capitalize(String s) {    	
    	return s.substring(0, 1).toUpperCase() + s.substring(1);
    }
}
