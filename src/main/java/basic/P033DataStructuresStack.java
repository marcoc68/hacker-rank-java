// https://www.hackerrank.com/challenges/java-stack/problem?isFullScreen=true&h_r=next-challenge&h_v=zen
package basic;

//Complete this code or write your own from scratch
import java.util.Scanner;
import java.util.Stack;
class P033DataStructuresStack{
	
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		
		Stack<Character> pilha = new Stack<Character>();
		
		boolean ret = true;
		
		while (sc.hasNext()) {
			pilha.clear();
			ret = true;
			String input=sc.next();
			System.out.println(input);
			//Complete the code
			char[] vetc = input.toCharArray();
			pilha.clear();
			for(int i=0; i<vetc.length; i++){
				char c = vetc[i];
					if(isOpen(c)) {
						pilha.push(c);
					}else{
						if(isClose(c)) {
							if(pilha.size()==0) {
								ret=false; break;
							}
							char open = pilha.pop();
							if(!isPair(open, c)) {
								ret=false; break;
							}
						}
					}
			}
			if(pilha.size() > 0) {
				ret = false;
			}
		System.out.println(ret);
		}
		
		sc.close();
	}
	
	static boolean isOpen(char c) {
		if(c == '(' || c == '{' || c == '[') return true;
		return false;
	}

	static boolean isClose(char c) {
		if(c == ')' || c == '}' || c == ']') return true;
		return false;
	}
	static boolean isPair(char open, char close) {
		if(open == '(' && close == ')') return true;
		if(open == '[' && close == ']') return true;
		if(open == '{' && close == '}') return true;
		return false;
	}
}
