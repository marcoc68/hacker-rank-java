package basic;

import java.util.Scanner;

public class P020Regex {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }
        in.close();

    }
}

//Write your code here
class MyRegex{ 
	String pattern = "^(([0]?[0-9]?[0-9]|[1][0-9][0-9]|[2][0-4][0-9]|[2][5][0-5])\\.){3}([0]?[0-9]?[0-9]|[1][0-9][0-9]|[2][0-4][0-9]|[2][5][0-5])$"; 
}

//001-099 [0]?[0-9]?[0-9]|
//100-199 [1][0-9][0-9]|
//200-249 [2][0-4][0-9]|
//250-255 [2][5][0-5]|
//
//([0][0-9][0-9]|[1][0-9][0-9]|[2][0-4][0-9]|[2][5][0-5]\\.){3}(^[0][0-9][0-9]|[1][0-9][0-9]|[2][0-4][0-9]|[2][5][0-5]$)
//
//"^(([0]?[0-9]?[0-9]|[1][0-9][0-9]|[2][0-4][0-9]|[2][5][0-5])\\.){3}([0]?[0-9]?[0-9]|[1][0-9][0-9]|[2][0-4][0-9]|[2][5][0-5])$"    