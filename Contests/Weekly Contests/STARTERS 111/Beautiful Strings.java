/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    private static final int MOD = 1000000007;

    private static long countBeautifulStrings(int length, String string) {
        int[] freq = new int[26];
        for (char c : string.toCharArray()) {
            freq[c - 'a']++;
        }

        long result = 1;

        for (int frequency : freq) {
            result = (result * (frequency + 1)) % MOD;
        }

        return result;
    }

    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int length = sc.nextInt();
            String string = sc.next();
            long result = countBeautifulStrings(length, string);
            System.out.println(result - 1);
        }
    }
}