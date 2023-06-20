// https://www.hackerrank.com/challenges/java-dequeue/problem?isFullScreen=true&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
package basic;

import java.util.*;
public class P037DataStructuresDequeue{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        int n = in.nextInt();
        int m = in.nextInt();

        HashSet<Integer> set = new HashSet<Integer>();
        int max = -1;
        int removed = 0;
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            deque.add(num);
            set.add(num);
            
            if(deque.size()==m){
            	if(max < set.size()) max = set.size();
            	removed = deque.remove();
            	if(!deque.contains(removed)) set.remove(removed);
            }
        }
        in.close();
        System.out.println(max);
    }
}



