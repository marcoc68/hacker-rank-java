package basic;

import java.util.Scanner;

public class P014Substring {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        in.close();
        
        if(S.length() < end) {
        	System.out.println( S.substring(start) );
        }else {
        	System.out.println( S.substring(start, end) );
        }
    }
}
