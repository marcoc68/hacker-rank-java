//STDIN           Function
//-----           --------
//4               q = 4 (number of queries)
//5 3             game[] size n = 5, leap = 3 (first query)
//0 0 0 0 0       game = [0, 0, 0, 0, 0]
//6 5             game[] size n = 6, leap = 5 (second query)
//0 0 0 1 1 1     . . .
//6 3
//0 0 1 1 1 0
//3 1
//0 1 0


//22 15
//0011111010 0 1 1 0 0 0 1 1 1 1 1 0
//0123456789101112131415161718192021
//1+15
//
//0011111010011000111110

//84 14
//0 0 0 0 0 1 0 1 1 1 1 0 1 0 1 0 0 1 0 0 0 1 0 1 0 0 0 0 1 1 0 0 1 0 0 1 1 1 1 0 0 0 0 0 0 1 0 0 0 0 0 1 1 0 0 1 1 1 0 0 0 0 1 0 0 1 1 1 0 0 1 1 1 1 1 1 1 1 0 1 1 0 0 0
package basic;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

//import static basic.P046DataStructuresJava1DArrayPart2.canWin;
import static basic.P046DataStructuresJava1DArrayPart2X.canWin;
import static org.junit.jupiter.api.Assertions.*;

public class P0046DataStructuresJava1DArrayPart2Test {

    @Test
    public void testWin1(){
        int[] game = {0,0,0,0,0};
        int leap = 3;
        assertTrue(canWin(leap, game));
    }

    @Test
    public void testWin2(){
        int[] game = {0,0,0,1,1,1};
        int leap = 5;
        assertTrue(canWin(leap, game));
    }

    @Test
    public void testWin3(){
        int[] game = {0,0,1,1,1,0};
        int leap = 3;
        assertFalse(canWin(leap, game));
    }

    @Test
    public void testWin4(){
        int[] game = {0,1,0};
        int leap = 1;
        assertFalse(canWin(leap, game));
    }

    @Test
    public void testWin5(){
        int[] game = {0,0,1,1,1,1,1,0,1,0,0,1,1,0,0,0,1,1,1,1,1,0};
        int leap = 15;
        assertTrue(canWin(leap, game));
    }

    @Test
    public void testWin6(){
        int[] game = {0,0,0,0,0,1,0,1,1,1,1,0,1,0,1,0,0,1,0,0,0,1,0,1,0,0,0,0,1,1,0,0,1,0,0,1,1,1,1,0,0,0,0,0,0,1,0,0,0,0,0,1,1,0,0,1,1,1,0,0,0,0,1,0,0,1,1,1,0,0,1,1,1,1,1,1,1,1,0,1,1,0,0,0};
        int leap = 14;
        assertTrue(canWin(leap, game));
    }

    @Test
    public void testWin7(){
        int[] game = {0,0,1,0,0,1,0,0,1,1,0,1,1,1,1,0,0};
        int leap = 65;
        assertTrue(canWin(leap, game));
    }

    @Test
    public void testWin_84_14(){
        int[] game = {0,0,0,0,0,1,0,1,1,1,1,0,1,0,1,0,0,1,0,0,0,1,0,1,0,0,0,0,1,1,0,0,1,0,0,1,1,1,1,0,0,0,0,0,0,1,0,0,0,0,0,1,1,0,0,1,1,1,0,0,0,0,1,0,0,1,1,1,0,0,1,1,1,1,1,1,1,1,0,1,1,0,0,0};
        int leap = 14;
        assertTrue(canWin(leap, game));
    }

    @Test
    public void testWin_63_25(){
        int[] game = {0,1,1,1,1,0,1,1,1,1,1,0,1,0,0,1,0,1,1,0,0,1,0,0,0,0,1,1,1,1,0,1,0,0,1,1,0,0,1,0,1,0,0,0,0,0,1,1,1,0,1,1,0,1,0,0,0,1,1,1,1,1,0};
        int leap = 25;
        assertTrue(canWin(leap, game));
    }

    @Test
    public void testWin_02_00(){
        int[] game = {0,0};
        int leap = 0;
        assertTrue(canWin(leap, game));
    }

    @Test
    public void testWin8() throws IOException {
        Scanner scan = new Scanner(Files.newInputStream(Paths.get("src/test/resources/input-P046DataStructuresJava1DArrayPart2.txt")));
        Scanner scanResult = new Scanner(Files.newInputStream(Paths.get("src/test/resources/result-P046DataStructuresJava1DArrayPart2.txt")));
        int q = scan.nextInt();
        int teste = 0;
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }
            teste++;
            String result = canWin(leap, game)? "YES" : "NO";
            System.out.println("Teste: " + teste + " size:" + game.length +" leap:" + leap + " result:" + result);

            String esperado = scanResult.nextLine();
            assertEquals(esperado,result);
        }
        scan.close();
        scanResult.close();
    }

    @Test
    public void testWin9() throws IOException {
        Scanner scan = new Scanner(Files.newInputStream(Paths.get("src/test/resources/input2-P046DataStructuresJava1DArrayPart2.txt")));
        Scanner scanResult = new Scanner(Files.newInputStream(Paths.get("src/test/resources/result2-P046DataStructuresJava1DArrayPart2.txt")));
        int q = scan.nextInt();
        int teste = 0;
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }
            teste++;
            String esperado = scanResult.nextLine();
            System.out.println("Teste: " + teste + " size:" + game.length +" leap:" + leap + " esperado:" + esperado);
            String result = canWin(leap, game)? "YES" : "NO";
            System.out.println("Teste: " + teste + " size:" + game.length +" leap:" + leap + " esperado:" + esperado + " result:" + result);

            assertEquals(esperado,result);
        }
        scan.close();
        scanResult.close();
    }
}
