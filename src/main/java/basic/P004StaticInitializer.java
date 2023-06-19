package basic;
import java.util.Scanner;

public class P004StaticInitializer {

    static byte B,H;
    static boolean flag;

    // Write your code here
static {
    Scanner s = new Scanner(System.in);
    B = s.nextByte();
    H = s.nextByte();
    flag = true;
    
    if(B<=0 || H<=0) { 
        System.out.println("java.lang.Exception: Breadth and height must be positive");
        flag = false;
    }
    
    s.close();
}

public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class

