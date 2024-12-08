import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int N = sc.nextInt();
            int l = sc.nextInt();
            int r = sc.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }

            int happinessCount = 0;

            int maxHappieness = 0;
            int minHappieness = 0;

            for (int i = 0; i < N; i++) {
                if (A[i] >= l && A[i] <= r) {
                    happinessCount++;
                } else {
                    happinessCount--;
                }

                maxHappieness = Math.max(maxHappieness, happinessCount);
                minHappieness = Math.min(minHappieness, happinessCount);
            }

            System.out.println(maxHappieness + " " + minHappieness);
        }
    }
}
