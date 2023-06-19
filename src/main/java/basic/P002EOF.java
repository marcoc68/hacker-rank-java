package basic;

import java.util.ArrayList;
import java.util.Scanner;

public class P002EOF {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        ArrayList<String> vet = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        do{
            vet.add(s.nextLine());
        }while(s.hasNext());
        s.close();
        
        int i = 1;
        for(String str : vet){
            System.out.printf("%d %s\n", i++, str);
        }
    }
}
