/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    private static boolean isVowel(char ch) {
        return (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U');
    }

    private static boolean isConsonant(char ch) {
        return !isVowel(ch);
    }

    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String S = sc.next();
            String S1 = "CODETOWN";

            boolean flag = true;
            for (int i = 0; i < S.length(); i++) {
                if ((isVowel(S.charAt(i)) && isConsonant(S1.charAt(i)))
                        || (isConsonant(S.charAt(i)) && isVowel(S1.charAt(i)))) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}