// https://www.hackerrank.com/challenges/java-generics/problem?isFullScreen=true&h_r=next-challenge&h_v=zen
package basic;

public class P035DataStructuresGenerics {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Integer int_arr[] = {1, 2, 3}; 
    	String  str_arr[] = {"Hello", "World"};
    	
    	printArray(int_arr);
    	printArray(str_arr);
    }
    
    static <T> void printArray(T[] arr) {
    	for(T i: arr) {
    		System.out.println(i);
    	}
    }
}

//class MyGeneric<T>{
//	T att;
//	public MyGeneric(T att) { this.att = att; }
//	public String toString() { return att.toString(); }
//}