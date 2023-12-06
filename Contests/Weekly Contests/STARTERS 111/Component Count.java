/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    private static final int MOD = 1000000007;

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int M = sc.nextInt();
            int N = sc.nextInt();
            int K = sc.nextInt();
            int[][] grid = new int[M][N];

            int ways = countWays(M, N, K);
            System.out.println(ways);
        }
    }

    public static int countWays(int N, int M, int k) {
        int[][][] dp = new int[N][M][k + 1];

        // Base case: 1 way to reach any cell with 0 steps
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                dp[i][j][0] = 1;
            }
        }

        // Fill the dp array
        for (int s = 1; s <= k; s++) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    for (int x = Math.max(0, i - 1); x < Math.min(N, i + 2); x++) {
                        for (int y = Math.max(0, j - 1); y < Math.min(M, j + 2); y++) {
                            dp[i][j][s] += dp[x][y][s - 1] % MOD; // Perform modulo operation
                        }
                    }
                }
            }
        }

        // Sum up the ways to reach exactly k cells
        int totalWays = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                totalWays += dp[i][j][k] % MOD; // Perform modulo operation
            }
        }

        return totalWays % MOD; // Perform modulo operation
    }
}