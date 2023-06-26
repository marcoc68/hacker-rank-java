// https://www.hackerrank.com/challenges/java-exception-handling-try-catch/problem?isFullScreen=true
package basic;

import java.util.*;

public class P048ExceptionHandlingTryCatch {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	
    	Scanner scan = new Scanner(System.in);
    	
    	try {
			int in = scan.nextInt();
			scan.nextLine();
			int id = scan.nextInt();
			System.out.println(in/id);
		} catch (java.util.InputMismatchException e) {
			System.out.println("java.util.InputMismatchException");
			
		} catch(java.lang.ArithmeticException e) {
			System.out.println("java.lang.ArithmeticException: "+ e.getLocalizedMessage());
		}
    	scan.close();
    }
}