package basic;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Scanner;

public class P010BitSet1{

	/*
	 *  Entrada do teste
	 *  5 4
		AND 1 2
		SET 1 4
		FLIP 2 2
		OR 2 1
		
		Saida do teste
		0 0
		1 0
		1 1
		1 2
	 */
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // bitsets lentgth 
        int m = sc.nextInt(); // num of operations
                sc.nextLine(); // nextLine precisa de uma execucao extra apos nextInt
        
        ArrayList<String> vet = new ArrayList<String>();
        for(int i = 0; i<m; i++){
           vet.add(sc.nextLine());
        }
        sc.close();
        
        BitSet b1 = new BitSet(n);
        BitSet b2 = new BitSet(n);
        
        String[] parts;        
        for(String cmd : vet) {
        	parts = cmd.split(" ");
        	int p1 = Integer.parseInt(parts[1]);
        	int p2 = Integer.parseInt(parts[2]);

        	if(p1==1) {
        		operation(parts[0], p1, p2, b1, b2);
        	}else {
        		operation(parts[0], p1, p2, b2, b1);
        	}
	    	
	    	System.out.println(b1.cardinality() + " " + b2.cardinality());
        }
    }
    
    static void operation(String oper, int p1, int p2, BitSet b1, BitSet b2){
    	if(oper.equalsIgnoreCase("AND" ) ) b1.and (b2);
    	if(oper.equalsIgnoreCase("OR"  ) ) b1.or  (b2);
    	if(oper.equalsIgnoreCase("XOR" ) ) b1.xor (b2);
    	if(oper.equalsIgnoreCase("FLIP") ) b1.flip(p2);
    	if(oper.equalsIgnoreCase("SET" ) ) b1.set (p2);
    }
    
}