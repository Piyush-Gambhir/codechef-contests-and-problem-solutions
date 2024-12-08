/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int N = sc.nextInt();
            int D = sc.nextInt();

            int F = 1;
            for (int i = 1; i <= D; i++) {
                if (i <= 10) {
                    F = F * 2;
                } else {
                    F = F * 3;
                }

                if (F > N) {
                    F = N;
                    break;
                }
            }

            System.out.println(F);
        }
    }
}
