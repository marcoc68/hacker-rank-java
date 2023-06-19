// https://www.hackerrank.com/challenges/java-negative-subarray/problem?isFullScreen=true
package basic;

import java.util.*;

public class P030DataStructuresJavaSubArray {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int maxLen = scan.nextInt();
        
        int vet[] = new int[maxLen];
        for( int i=0; i<maxLen; i++ ) {
        	vet[i] = scan.nextInt(); 
        }
        scan.close();
        
        // tamanho do chunk varia de 1 ateh o maior tamanho
        int tot = 0;
        for(int chunk=1; chunk<=maxLen; chunk++) {
        	// passeando pelos grupos de chunks
        	for(int c=0; c+chunk-1 < maxLen; c++) {
        		int sum = 0;
        		for(int i=c; i-c<chunk; i++) {
        			sum += vet[i];
        		}
        		if(sum<0) tot++;
        		System.out.println(sum);
        	}
        }
    	System.out.println(tot);
    }
}