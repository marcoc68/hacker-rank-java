// https://www.hackerrank.com/challenges/java-biginteger/problem?isFullScreen=true
package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class P026BigNumberBigInteger {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	try {
    		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    		BigInteger b1 = new BigInteger(reader.readLine());
    		BigInteger b2 = new BigInteger(reader.readLine());
    		System.out.println(b1.add(b2));
    		System.out.println(b1.multiply(b2));
		} catch (IOException e) {
			System.out.println(":-( ERRO capturing data:" + e.getMessage());
		}
    }
}