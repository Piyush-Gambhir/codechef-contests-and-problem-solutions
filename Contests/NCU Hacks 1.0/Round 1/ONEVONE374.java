/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ONEVONE374 {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int N = sc.nextInt();

            if (N < 4) {
                System.out.println("-1");
            } else if (N == 4) {
                int[] A = { 2, 4, 1, 3 };
                for (int i = 0; i < N; i++) {
                    System.out.print(A[i] + " ");
                }
                System.out.println();
            } else {
                int[] A = constructArray(N);
                for (int i = 0; i < N; i++) {
                    System.out.print(A[i] + " ");
                }
                System.out.println();
            }
        }
    }

    public static int[] constructArray(int N) {
        int[] A = new int[N];
        int count = 1;
        for (int i = 0; i < N; i += 2) {
            A[i] = count;
            count++;
        }
        for (int i = 1; i < N; i += 2) {
            A[i] = count;
            count++;
        }

        return A;
    }
}
