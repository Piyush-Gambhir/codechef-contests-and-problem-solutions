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

            ArrayList<Integer> v = new ArrayList<>();
            for (int i = 1; i <= N; i++) {
                v.add(i);
            }

            if (X == 0) {
                for (int i : v) {
                    System.out.print(i + " ");
                }
                System.out.println();
                continue;
            }

            if (X >= N || N - X == 1) {
                System.out.println("-1");
                continue;
            }

            Collections.reverse(v);
            Collections.reverse(v.subList(N - X - 1, N));
            for (int i : v) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
