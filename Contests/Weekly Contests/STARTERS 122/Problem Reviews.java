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
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }
            boolean goodProblem = true;
            for (int i = 0; i < N; i++) {
                if (A[i] <= 4) {
                    goodProblem = false;
                    break;
                }
            }

            if (goodProblem) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }
    }
}
