// https://www.hackerrank.com/challenges/java-1d-array/problem?isFullScreen=true
package basic;

import java.util.*;

public class P046DataStructuresJava1DArrayPart2 {

//	public static boolean canMoveBack(int[] game, int i       ) {return i   >  0             && game[i-1]==0;}
//	public static boolean canMoveForw(int[] game, int i       ) {return i   <  game.length-1 && game[i+1]==0;}
//	public static boolean canJump    (int[] game, int i, int j) {return i+j >= game.length   || (game[i+j]==0 && (canMoveBack(game, i+j) ||
//			                                                                                                      canMoveForw(game, i+j) ||
//			                                                                                                      canJump    (game, i+j, j) )) ;}
//	public static boolean win        (int[] game, int i, int j) {return i+1 >= game.length   ||      i+j >=game.length;}
//	
//    public static boolean canWin(int leap, int[] game) {
//        // Return true if you can win the game; otherwise, return false.
//    	int qtd = -1;
//    	for(int i=0; i<game.length;) {
//    		if(win(game,i,leap)) return true;
//    		if(qtd++ > game.length) return false;
//    		
//    		if(canMoveForw(game, i)) {i++; continue; }
//    		if(canJump(game, i, leap)) {i+=leap; continue;}
//    		if(canMoveBack(game, i)) {i--; continue; }
//    		
//    		return false;
//    	}
//    	return false;
//    }

//	public static boolean canJump(int[] game, int i, int j) {return i+j >= game.length || game[i+j]==0 ;}

	public static boolean isAchievable(int[] game, int ind, int leap) {
		if(ind==0) return true;
		if(ind<leap) {
			for(int i=0; i<=ind; i++) {
				if(game[i]==1) return false;
			}
			return true;
		}else {
			int ori = ind-leap;
			// verifique se eh alcancavel com um pulo
			if(game[ori]==0) return true; 
			// verifique se um dos vizinhos eh alcancavel
//			if(game[ind-1]==0 || game[ind+1]==0) return true;
			if(game[ind-1]==0                  ) return true;
		}
		return false;
	}
	
	public static int sum(int arr[], int ini, int fim) {
		int sum = 0;
		for(int i=ini; i<=fim; i++) { sum+=arr[i]; }
		return sum;
	}

	public static boolean canWin(int leap, int[] game) {
		
		if(leap >= game.length) return true;
		
        // marcando -1 nos indices que tem zero (significa que devem ser tratados)
    	for(int i=0; i<game.length; i++) { if(game[i]==0) game[i] = -1; }
    	
    	// o ultimo indice sempre eh alcancavel
    	game[game.length-1] = 0;
    	
    	// marcando zero nos alcancaveis
    	for(int i=0; i<game.length; i++) {
    		if(isAchievable(game, i, leap)) {
    			// pra tras
    			for(int j=i; j>=0; j--) {
    				if(game[j]==1) break;
    				game[j] = 0;
    			}
    			// pra frente
    			for(int j=i; j<game.length; j++) {
    				if(game[j]==1) break;
    				game[j] = 0;
    			}
    		}
    	}
    	
    	// marcando 1 nos nao alcancaveis...
    	for(int i=0; i<game.length; i++) { if(game[i]==-1) game[i] = 1; }
    	
    	// buscando um sub-array de 1's com tamanho leap...
    	for(int i=0; i+leap<game.length; i++) {
    		if(sum(game, i, i+leap-1) >= leap ) return false;
    	}
    	return true;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }
            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
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
