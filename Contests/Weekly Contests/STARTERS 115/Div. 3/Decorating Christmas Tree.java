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
            int Y = sc.nextInt();

            int leaves = Y / 3;
            int x_left, leaves1;
            if (X >= leaves) {
                x_left = X - leaves;
                leaves1 = leaves;
            } else {
                x_left = 0;
                leaves1 = X;
            }

            int leaves2 = x_left / 2;
            if (leaves2 + leaves1 >= N) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
