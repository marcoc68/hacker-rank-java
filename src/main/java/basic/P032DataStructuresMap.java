// https://www.hackerrank.com/challenges/phone-book/problem?isFullScreen=true
package basic;

//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class P032DataStructuresMap{
	public static void main(String []argh)
	{
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();	in.nextLine();
		HashMap<String, Integer> fb = new HashMap<String, Integer>();
		
		for(int i=0;i<n;i++)
		{
			String name=in.nextLine();
			int phone=in.nextInt(); in.nextLine();
			fb.put(name, phone);
		}
		while(in.hasNext())
		{
			String s=in.nextLine();
			Integer phone = fb.get(s);
			if(phone == null) {
				System.out.println("Not found");
			}else {
				System.out.printf("%s=%d\n",s,phone);
			}
		}
	}
}