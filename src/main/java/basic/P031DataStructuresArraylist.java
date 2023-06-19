// https://www.hackerrank.com/challenges/java-arraylist/problem?isFullScreen=true
package basic;

import java.util.ArrayList;
import java.util.Scanner;

public class P031DataStructuresArraylist {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	
    	Scanner scan= new Scanner(System.in);
    	int n = scan.nextInt();
    	ArrayList<ArrayList<Integer>> vet = new ArrayList<ArrayList<Integer>>(n);
    
    	for(int i=0; i<n; i++) {
        	int d = scan.nextInt();
    		ArrayList<Integer> veti = new ArrayList<Integer>(d);
        	for(int j=0; j<d; j++) {
        		veti.add(scan.nextInt());
        	}
        	vet.add(i, veti);
    	}
    	
    	int q = scan.nextInt();
    	int vetq[][] = new int[q][2];
    	for(int i=0; i<q; i++) {
    		vetq[i][0] = scan.nextInt()-1;
    		vetq[i][1] = scan.nextInt()-1;
    	}
    	scan.close();
    	
    	for(int i=0; i<q; i++) {
    		try {
    			System.out.println(vet.get(vetq[i][0]).get(vetq[i][1]));
    		}catch (IndexOutOfBoundsException e) {
    			System.out.println("ERROR!");
			}
    	}
    }
}