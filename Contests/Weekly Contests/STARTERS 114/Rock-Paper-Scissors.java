import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            String s = sc.next();

            StringBuilder result = new StringBuilder();
            for (int j = 0; j < n; j++) {
                result.append('P');
            }

            int wins = n / 2 + 1;

            for (int j = 0; j < n; j++) {
                if (s.charAt(j) == 'R') {
                    wins--;
                }
            }

            for (int j = n - 1; j >= 0; j--) {
                if (wins > 0 && (s.charAt(j) == 'P' || s.charAt(j) == 'S')) {
                    result.setCharAt(j, (s.charAt(j) == 'P') ? 'S' : 'R');
                    wins--;
                }
            }

            System.out.println(result.toString());
        }

        sc.close();
    }
}
