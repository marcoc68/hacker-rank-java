package basic;

//import java.util.HashMap;
import java.util.Scanner;

public class P017Anagrams {

    static boolean isAnagram(String a, String b) {
        
    	String sa = a.toLowerCase();
    	String sb = b.toLowerCase();
    	int[][] vet = new int[256][2];
    	
    	for(char c:sa.toCharArray()) { vet[c][0]++;	}
    	for(char c:sb.toCharArray()) { vet[c][1]++;	}
    	for(int i=0; i<vet.length; i++) {
    		if(vet[i][0] != vet[i][1]) return false;
    	}
    	return true;
    }
    
//    static boolean isAnagram(String a, String b) {
//        // Complete the function
//    	// A frequencia das letras deve ser igual
//    	
//    	HashMap<String, Integer> ha = new HashMap<String, Integer>();
//    	HashMap<String, Integer> hb = new HashMap<String, Integer>();
//    	
//    	String sa = a.toLowerCase();
//    	String sb = b.toLowerCase();
//    	
//    	String keya, keyb;
//    	
//    	for(int i=0; i<sa.length(); i++) {
//    		keya = sa.substring(i, i+1);
//    		if( ha.containsKey(keya) ) {
//    			ha.put(keya, ha.get(keya)+1);
//    		}else {
//    			ha.put(keya, 1);
//    		}
//    	}
//
//    	for(int i=0; i<sb.length(); i++) {
//    		keyb = sb.substring(i, i+1);
//    		if( hb.containsKey(keyb) ) {
//    			hb.put(keyb, hb.get(keyb)+1);
//    		}else {
//    			hb.put(keyb, 1);
//    		}
//    	}
//    	
//    	Integer va, vb;
//    	for(String k : ha.keySet()) {
//    		vb = hb.get(k);
//    		va = ha.get(k);
//    		if( va==null || vb==null ) return false;
//    		if( va.intValue() != vb.intValue() ) return false;
//    	}
//    	
//    	for(String k : hb.keySet()) {
//    		vb = hb.get(k);
//    		va = ha.get(k);
//    		if( va==null || vb==null ) return false;
//    		if( va.intValue() != vb.intValue() ) return false;
//    	}
//    	
//    	return true;
//    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}

