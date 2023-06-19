// https://www.hackerrank.com/challenges/tag-content-extractor/problem?isFullScreen=true
package basic;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P023StringsTagContentExtractor {
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String line = in.nextLine();
			
          	//Write your code here
	        Pattern p = Pattern.compile("<(\\p{Print}+)>[^<>/]*</(\\1)>");
            Matcher m = p.matcher(line);
            String print = "";
            int i = 0;
            while (m.find()) {
//            	print = m.group().replaceAll("<"+m.group(1)+">"+ "|" + "</"+m.group(1)+">" , "");
            	print = m.group().trim().substring( 0,m.group().length()-m.group(1).length()-3 );
            	print = print.substring( m.group(1).length()+2 );
            	if(!print.equals("")) {
            		System.out.println(print);
            		i++;
            	}
            }
            if(i==0)System.out.println("None");
			
			
			testCases--;
		}
		in.close();
	}
}



