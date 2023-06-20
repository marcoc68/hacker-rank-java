// https://www.hackerrank.com/challenges/java-abstract-class/problem?isFullScreen=true&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
package basic;
import java.util.*;
abstract class Book{
	String title;
	abstract void setTitle(String s);
	String getTitle(){
		return title;
	}
	
}

//Write MyBook class here
class MyBook extends Book{
    void setTitle(String s){super.title = s;}
}
public class P040ObjectOrientedProgrammingAbstractClass{
	
	public static void main(String []args){
		//Book new_novel=new Book(); This line prHMain.java:25: error: Book is abstract; cannot be instantiated
		Scanner sc=new Scanner(System.in);
		String title=sc.nextLine();
		MyBook new_novel=new MyBook();
		new_novel.setTitle(title);
		System.out.println("The title is: "+new_novel.getTitle());
      	sc.close();
		
	}
}