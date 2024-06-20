// https://www.hackerrank.com/challenges/java-1d-array/problem?isFullScreen=true
package basic;

import java.util.Scanner;

public class P046DataStructuresJava1DArrayPart2X {

	public static boolean canWin(int leap, int[] game) {

		int i=0;
		while(true){
			if(canJump(game, i, leap)) {
				i+=leap; log("+" + leap + "game.size:" + game.length + " i:" + i);
				if(isWin(game,i)) return true;
				continue;
			}
			if(canJump(game, i, 1   )){
				i+=1; log("+1: game.size:" + game.length + " i:" + i);
				if(isWin(game,i)) return true;
				game[i] = 1;
				continue;
			}
			if(canJump(game, i, -1  )){
				i-=1; log("-1: game.size:" + game.length + " i:" + i);
				if(isWin(game,i)) return true;
				game[i] = 1;
				continue;
			}
			return isWin(game,i);
		}
    }

	private static boolean canJump(int[] game, int i, int leap){
		if(leap>0){
			if(i+leap>=game.length) return true; // pode passar do final
			return (game[i+leap]==0);            // pode avancar se for zero
		}
		if(i+leap<=0) return false; // nao pode voltar pro primeiro ou anterior
		return (game[i+leap]==0);   // pode voltar se for zero
	}
	private static boolean isWin(int[] game, int i){
		return i>=game.length;
	}

	private static void log(String str){System.out.println(str);}

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
