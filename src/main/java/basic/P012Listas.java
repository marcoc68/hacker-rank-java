/**
 * 
ENTRADA
5
12 0 1 78 12
2
Insert
5 23
Delete
0

SAIDA
0 1 78 12 23

 * 
 * 
 */


package basic;

import java.util.ArrayList;
import java.util.Scanner;

public class P012Listas {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        final Scanner scan = new Scanner(System.in);
        
        int iniElements = Integer.parseInt(scan.nextLine());
        ArrayList<Integer> listN = new ArrayList<>(iniElements);

        String vetList[] = scan.nextLine().split(" ");
        for(int i=0; i<vetList.length; i++) { listN.add( Integer.parseInt( vetList[i] ) ); }
        
        int numQ = Integer.parseInt(scan.nextLine());
        
        String cmd, ind, vetp[];
        while(numQ-- > 0) {
        	cmd = scan.nextLine();
        	if(cmd.equalsIgnoreCase("Insert")) {
        		vetp = scan.nextLine().split(" ");
        		listN.add( Integer.parseInt(vetp[0]), Integer.parseInt(vetp[1]) );
        	}else if(cmd.equalsIgnoreCase("Delete")) {
        		ind = scan.nextLine();
        		listN.remove( Integer.parseInt(ind) );
        	}
        }
        
        String line = "";
        for(int num : listN) line += (num + " ");
        System.out.println(line.trim());
        
        scan.close();
    }
}
