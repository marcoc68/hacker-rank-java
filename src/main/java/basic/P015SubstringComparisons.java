package basic;
import java.util.Scanner;

public class P015SubstringComparisons {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        String chunk = s.substring(0, k); 
        smallest = chunk;
        largest  = chunk;
        for(int i=1; i<=s.length()-k; i++) {
        	chunk = s.substring(i, k+i);
        	if(smallest.compareTo(chunk) > 0) smallest = chunk;
        	if(largest .compareTo(chunk) < 0) largest  = chunk;
        }
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
