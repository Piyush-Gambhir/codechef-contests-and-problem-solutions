import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();
            int count = 0;
            for (char ch : s.toCharArray()) {
                if (ch == '1') {
                    count++;
                }
            }
            if (count > k) {
                StringBuilder sb = new StringBuilder(s);
                for (int i = 0; i < n && k > 0; i++) {
                    if (sb.charAt(i) == '1') {
                        sb.setCharAt(i, '0');
                        k--;
                    }
                }
                System.out.println(sb.toString());
            } else {
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < n - k; i++) {
                    sb.append('0');
                }
                System.out.println(sb.toString());
            }
        }
    }
}
