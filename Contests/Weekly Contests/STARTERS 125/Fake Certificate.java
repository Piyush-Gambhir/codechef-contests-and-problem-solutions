import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static int maxZeroSubstring(String S) {
        int maxZeros = 0;
        int currentZeros = 0;
        for (char c : S.toCharArray()) {
            if (c == '0') {
                currentZeros++;
                maxZeros = Math.max(maxZeros, currentZeros);
            } else {
                currentZeros = 0;
            }
        }
        return maxZeros;
    }

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            sc.nextLine();
            String S = sc.nextLine();
            int count = 0;
            for (char c : S.toCharArray()) {
                if (c == '1') {
                    count++;
                }
            }
            System.out.println(maxZeroSubstring(S) + count);
        }
        sc.close();
    }
}
