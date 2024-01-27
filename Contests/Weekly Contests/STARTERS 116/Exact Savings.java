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
            int X = sc.nextInt();
            int Z = sc.nextInt();

            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }

            for (int i = 0; i < N; i++) {
                if ((A[i] + Z) % X == 0) {
                    System.out.println((A[i] + Z) / X);
                    break;
                }
            }

            System.out.println(-1);
        }
    }
}
