import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int A = sc.nextInt();
            int B = sc.nextInt();

            int D = Math.max(B + 10 - A, 0);
            int threePointShots = D / 3;
            int additionalShot = D % 3 > 0 ? 1 : 0;
            int totalShots = threePointShots + additionalShot;

            System.out.println(totalShots);
        }
        sc.close();
    }
}
