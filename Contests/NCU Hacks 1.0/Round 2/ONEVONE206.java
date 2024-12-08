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
            int X = sc.nextInt();

            int[] E = new int[N];
            for (int i = 0; i < N; i++) {
                E[i] = sc.nextInt();
            }

            Arrays.sort(E);
            int time = 0;
            int[] countLeftToVisit = new int[N];
            for (int i = 0; i < N; i++) {
                countLeftToVisit[i] = X;
            }
            while (Arrays.stream(countLeftToVisit).sum() > 0) {

                for (int i = 0; i < N; i++) {

                    if (countLeftToVisit[i] == 0) {
                        continue;
                    }
                    if (E[i] >= X) {
                        countLeftToVisit[i] = 0;
                        time++;
                    } else {
                        // if the max limit of exhibition is smaller than toal friends then number pf
                        // firends of the xhibition limit can view the current exhibition, rest will be
                        // send to the next exhibitions till the last one or till all frirends are in a
                        // exhibition, if we reach last.
                        int xLocal = X;
                        while (xLocal != 0 && i < N) {

                            if (E[i] >= xLocal) {
                                countLeftToVisit[i] = countLeftToVisit[i] - xLocal;
                                break;
                            }
                            countLeftToVisit[i] -= E[i];
                            xLocal -= E[i];
                            i++;
                        }
                        time++;
                    }
                }
            }
            System.out.println(time);
        }
    }
}
