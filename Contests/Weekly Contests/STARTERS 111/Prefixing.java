/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */

class Codechef {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(br.readLine());

        while (testCases-- > 0) {
            int m = Integer.parseInt(br.readLine());
            int[] P = new int[m];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < m; i++) {
                P[i] = Integer.parseInt(st.nextToken());
            }

            int[] L = new int[m + 1];
            int z = 0;

            for (int i = 1; i <= m; i++) {
                L[i] = P[i - 1];
                z = Math.max(L[i], z);
            }

            HashSet<Integer> B = new HashSet<>();
            StringBuilder sb = new StringBuilder();
            for (int i = 1; i <= m; i++) {
                if (B.contains(L[i])) {
                    sb.append(z).append(" ");
                } else {
                    sb.append(L[i]).append(" ");
                }
                B.add(L[i]);
            }
            System.out.println(sb);
        }
    }
}
