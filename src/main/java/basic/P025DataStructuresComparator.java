package basic;


import java.util.*;

//Write your Checker class here
class Checker implements Comparator<Player>{
	@Override
	public int compare(Player o1, Player o2) {
		int sinal = -Integer.signum(o1.score - o2.score);
		if(sinal!=0) return sinal;
		return o1.name.compareTo(o2.name);
	}
}

class Player{
 String name;
 int score;
 
 Player(String name, int score){
     this.name = name;
     this.score = score;
 }
}

public class P025DataStructuresComparator {

 public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     int n = scan.nextInt();

     Player[] player = new Player[n];
     Checker checker = new Checker();
     
     for(int i = 0; i < n; i++){
         player[i] = new Player(scan.next(), scan.nextInt());
     }
     scan.close();

     Arrays.sort(player, checker);
     for(int i = 0; i < player.length; i++){
         System.out.printf("%s %s\n", player[i].name, player[i].score);
     }
 }
}