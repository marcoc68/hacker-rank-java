package basic;
import java.util.Scanner;
import java.util.regex.*;

public class P019PatternSyntaxChecker {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		String[] result = new String[testCases];
		
		while(testCases-->0){
			String pattern = in.nextLine();
          	//Write your code
			try {
				Pattern.compile(pattern);
				result[testCases] = "Valid";
			} catch (PatternSyntaxException e) {
				result[testCases] = "Invalid";
			}
		}
		for(int i=result.length-1; i>-1; i--) { System.out.println(result[i]); }
		in.close();
	}
}

