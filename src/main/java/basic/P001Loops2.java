package basic;
import java.util.Scanner;

public class P001Loops2 {

    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        
        int t=in.nextInt();
        int[][] entrada = new int[t][3]; // guarda as entradas
        
        int A = 0; int B = 1; int N = 2;
        
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            entrada[i][A] = a;
            entrada[i][B] = b;
            entrada[i][N] = n;
        }
        in.close();
        
    	for(int i=0; i<entrada.length; i++) {
//    		print(entrada);
			System.out.println(calc_total(entrada[i][A], 
					                      entrada[i][B], 
					                      entrada[i][N]) );
    	}
        
    }

    static String calc_total(int a, int b, int n) {
//    	System.out.printf("a=%d b=%d n=%d \n", a, b, n);
    	int soma = a+b;
    	String saida = "" + soma;
    	
    	for(int i=1; i<n; i++) {
//        	System.out.printf("soma=%d b=%d i=%d \n", soma, b, i);
    		soma += ( b * Math.pow(2,i) );
    		saida += (" " + soma);
    		
    	}
    	return saida;
    }
    
    static void print(int[][] nums) {
    	System.out.println();
    	for(int i=0; i<nums.length; i++) {
    		for (int j=0; j<nums[i].length; j++) {
        		System.out.printf("%d ", nums[i][j]);
			}
    		System.out.println("");
    	}
    }
    

}
