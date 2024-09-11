// https://www.hackerrank.com/challenges/java-1d-array/problem?isFullScreen=true
package basic;

import java.util.Scanner;

public class P046DataStructuresJava1DArrayPart2X {
	public static boolean canWin(int leap, int[] game){
		return canWin(leap, game, 0);
	}

	public static boolean canWin(int leap, int[] game, int pos) {

		if(pos+leap > game.length-1 || pos == game.length-1) return true;

		game[pos] = 2;

		if(canJump(game,pos,leap)){
			if( canWin(leap, game, pos+leap) ) return true;
		}
		if(canJump(game,pos, 1)){
			if( canWin(leap, game, pos+1) ) return true;
		}
		if(canJump(game,pos, -1)){
			if( canWin(leap, game, pos-1) ) return true;
		}
		return false;
    }

	private static boolean canJump(int[] game, int i, int leap){
		log("+" + leap + ": game.size:" + game.length + " i:" + i);
		return (i+leap>=0) && (i+leap>game.length || game[i+leap]==0);
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
