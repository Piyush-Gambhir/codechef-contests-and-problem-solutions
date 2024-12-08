/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int p[] = new int[n];
            for (int i = 0; i < n; i++) {
                p[i] = sc.nextInt();
            }
            Arrays.sort(p);
            int l = 0;
            int r = n - 1;
            long cnt = 0;
            while (l < r) {
                if (p[l] * p[r] <= p[l] + p[r]) {
                    cnt += (r - l);
                    l++;
                } else {
                    r--;
                }
            }
            System.out.println(cnt);
        }
    }
}