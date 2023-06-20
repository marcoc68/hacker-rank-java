// https://www.hackerrank.com/challenges/java-primality-test/problem?isFullScreen=true

package basic;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class P024BigNumberPrimalityTest {

	public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String n = bufferedReader.readLine();
        bufferedReader.close();
        
        BigInteger b = new BigInteger(n);
        if( b.isProbablePrime(1) ) {
        	System.out.println("prime");
        }else {
        	System.out.println("not prime");
        }
    }
}
