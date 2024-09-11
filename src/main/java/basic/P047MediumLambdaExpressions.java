// https://www.hackerrank.com/challenges/java-1d-array/problem?isFullScreen=true
package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

interface PerformOperation {
	boolean check(int a);
}
class MyMath {
	public static boolean checker(PerformOperation p, int num) {
		return p.check(num);
	}

	PerformOperation isOdd(){return null;}
	PerformOperation isPrime(){return null;}
	PerformOperation isPalindrome(){return null;}
}

public class P047MediumLambdaExpressions {
	public static void main(String[] args) throws IOException {
		MyMath ob = new MyMath();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		PerformOperation op;
		boolean ret = false;
		String ans = null;
		while (T-- > 0) {
			String s = br.readLine().trim();
			StringTokenizer st = new StringTokenizer(s);
			int ch = Integer.parseInt(st.nextToken());
			int num = Integer.parseInt(st.nextToken());
			if (ch == 1) {
				op = ob.isOdd();
				ret = ob.checker(op, num);
				ans = (ret) ? "ODD" : "EVEN";
			} else if (ch == 2) {
				op = ob.isPrime();
				ret = ob.checker(op, num);
				ans = (ret) ? "PRIME" : "COMPOSITE";
			} else if (ch == 3) {
				op = ob.isPalindrome();
				ret = ob.checker(op, num);
				ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

			}
			System.out.println(ans);
		}
	}
}

//STDIN           Function
//-----           --------
//4               q = 4 (number of queries)
//5 3             game[] size n = 5, leap = 3 (first query)
//0 0 0 0 0       game = [0, 0, 0, 0, 0]
//6 5             game[] size n = 6, leap = 5 (second query)
//0 0 0 1 1 1     . . .
//6 3
//0 0 1 1 1 0
//3 1
//0 1 0


//22 15
//0011111010 0 1 1 0 0 0 1 1 1 1 1 0
//0123456789101112131415161718192021
//1+15
//
//0011111010011000111110

//84 14
//0 0 0 0 0 1 0 1 1 1 1 0 1 0 1 0 0 1 0 0 0 1 0 1 0 0 0 0 1 1 0 0 1 0 0 1 1 1 1 0 0 0 0 0 0 1 0 0 0 0 0 1 1 0 0 1 1 1 0 0 0 0 1 0 0 1 1 1 0 0 1 1 1 1 1 1 1 1 0 1 1 0 0 0
