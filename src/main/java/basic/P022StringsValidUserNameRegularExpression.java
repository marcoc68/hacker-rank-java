package basic;
// https://www.hackerrank.com/challenges/valid-username-checker/problem?isFullScreen=true
// package org.os.basic;

import java.util.Scanner;

class UsernameValidator {
    /*
     * Write regular expression here.
     */
	public static final String regularExpression = "\\p{Alpha}{1}+\\w{7,29}+";
}


public class P022StringsValidUserNameRegularExpression {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }
}
