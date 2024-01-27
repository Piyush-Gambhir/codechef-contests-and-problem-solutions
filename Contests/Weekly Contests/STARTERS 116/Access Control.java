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
            String S = sc.next();
            int temp = X;
            boolean flag = false;
            if (X == 0) {
                System.out.println("NO");
                continue;
            }
            if (S.charAt(0) != '1') {
                System.out.println("NO");
                continue;
            }
            for (int i = 1; i < N; i++) {
                if (temp == 0 && S.charAt(i) == '0') {
                    flag = true;
                    break;
                }
                if (S.charAt(i) == '0') {
                    temp--;
                }
                if (S.charAt(i) == '1') {
                    temp = X;
                }
            }
            if (flag) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}
