import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long N = sc.nextLong();
            long n = (long) Math.sqrt(N);
            if (n % 2 != N % 2) {
                n--;
            }
            System.out.println((long) (n + 1) / 2);
        }
    }
}
