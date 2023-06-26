// https://www.hackerrank.com/challenges/java-singleton/problem?isFullScreen=true&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
package basic;

class Singleton{
	public String str;
	private static final Singleton me = new Singleton();
	
	private Singleton() {}
	static Singleton getSingleInstance() { return me; }
}