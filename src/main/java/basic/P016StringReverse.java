package basic;
import java.util.Scanner;

public class P016StringReverse {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        
//    	char[] vet1 = A.toCharArray();
//    	char[] vet2 = A.toCharArray();
//    	int last = vet1.length-1;
//    	
//    	for(int i=0; i<last; i++ ) { vet2[last-i] = vet1[i]; }
//    	String s = new String(vet2);

        sc.close();
        String r = new StringBuilder(A).reverse().toString();
    	System.out.println( r.equals(A)?"Yes":"No" );
    }    
}
