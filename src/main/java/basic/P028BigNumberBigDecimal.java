// https://www.hackerrank.com/challenges/java-bigdecimal/problem?isFullScreen=true
package basic;


import java.math.BigDecimal;
import java.util.*;
public class P028BigNumberBigDecimal {

    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
      	sc.close();
//      	for (int i = 0; i < s.length; i++) {
//      		System.out.println(i + " " + s[i]);
//      	}
      	
        //Write your code here
      	BigDecimal b;
      	TreeMap<BigDecimal, List<String>> map = new TreeMap<BigDecimal, List<String>>();
      	
      	// percorrendo o array de strings e colocando as mesmas em um dicionario cuja chave eh o bigd...
      	for (int i = 0; i < n; i++) {
      		b = new BigDecimal(s[i]);
			if(map.containsKey(b)) {
				map.get(b).add(s[i]);
			}else {
				ArrayList<String> a = new ArrayList<String>();
				a.add(s[i]);
				map.put(b, a);
			}
		}

      	// percorrendo o map e colocando as strings de volta no array...
      	int ind = n-1;
      	for( List<String> ls : map.values()) {
   			 for (int i = ls.size()-1; i >= 0; i--) {
   				 s[ind--] = ls.get(i);
   			 }
      	}
      	
      	//Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }

}