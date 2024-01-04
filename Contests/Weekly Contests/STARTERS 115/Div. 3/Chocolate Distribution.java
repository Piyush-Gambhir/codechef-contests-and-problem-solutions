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

            if (N % 2 == 0) {
                System.out.println(N / 2 + " " + N);
            } else {
                System.out.println(N / 2 + 1 + " " + N);
            }
        }

    }
}
