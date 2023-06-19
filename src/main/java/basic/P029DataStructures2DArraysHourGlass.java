// https://www.hackerrank.com/challenges/java-2d-array/problem?isFullScreen=true
package basic;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class P029DataStructures2DArraysHourGlass{
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        int maxl = 6-2;
        int maxc = 6-2;
        int maxsum  = 0;
        int tmp     = 0;
        for(int l=0; l<maxl; l++) {
        	for(int j=0; j<maxc; j++) {
        		int glass[][] = new int[3][3];
        		tmp = 0;
        		for(int lg=0; lg<3; lg++) {
        			for(int jg=0; jg<3; jg++) {
        				glass[lg][jg] = arr.get(l+lg).get(j+jg);
        			}
        		}
        		tmp = sumHourGlass(glass);
        		if(maxsum<tmp || (l==0 && j==0)) { maxsum = tmp; }
        	}
        }
        System.out.println(maxsum);
    }

    static int sumHourGlass(int a[][]) {
    	int sum = 0;
    	for(int[] l: a) {
//    		StringBuilder linha = new StringBuilder("");    		
    		for(int c: l) {
//    			linha.append(c+" ");
    			sum += c;
    		}
//    		System.out.println(linha);
    	}
//    	System.out.println();
    	sum -= a[1][0];
    	sum -= a[1][2];
    	return sum;
    }
}

