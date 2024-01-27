import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int N = sc.nextInt();
            int M = sc.nextInt();

            int[] initialCount = new int[N];
            for (int i = 0; i < N; i++) {
                initialCount[i] = sc.nextInt();
            }

            int maxStates = 0;
            int currentLiterate = 0;
            for (int i = 0; i < N; i++) {
                currentLiterate += initialCount[i];
                if (currentLiterate >= M) {
                    maxStates++;
                    currentLiterate = 0;
                }
            }

            System.out.println(maxStates);
        }
    }
}
