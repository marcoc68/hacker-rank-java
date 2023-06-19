package basic;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
    Write a RegEx that will match any repeated word.
    Complete the second compile argument so that the compiled RegEx is case-insensitive.
    Write the two necessary arguments for replaceAll such that each repeated word is replaced with the very first instance the word found in the sentence. It must be the exact first occurrence of the word, as the expected output is case-sensitive.

Sample Input
============
5
Goodbye bye bye world world world
Sam went went to to to his business
Reya is is the the best player in eye eye game
in inthe
Hello hello Ab aB

Sample Output
=============
Goodbye bye world
Sam went to his business
Reya is the best player in eye game
in inthe
Hello Ab
 */
public class P021DuplicateWords {

    public static void main(String[] args) {

        String regex = "(\\b(\\w+)\\b)(?:\\s+\\1\\b)+";//"/* Write a RegEx matching repeated words here. */";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE /* Insert the correct Pattern flag here.*/);

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());
        
        while (numSentences-- > 0) {
            String input = in.nextLine();
            
            Matcher m = p.matcher(input);
            
            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {
                input = input.replaceAll(/* The regex to replace */ m.group(), m.group(1) /* The replacement. */);
            }
            
            // Prints the modified sentence.
            System.out.println(input);
        }
        
        in.close();
    }
}
