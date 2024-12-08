import java.util.*;
import java.lang.*;
import java.io.*;


class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();

        while (testCases-- > 0) {
            int n = scanner.nextInt();
            int onesCount = 0;
            int twosCount = 0;
            int moreCount = 0;

            for (int i = 0; i < n; i++) {
                int num = scanner.nextInt();
                if (num == 1) {
                    onesCount++;
                } else if (num > 2) {
                    moreCount += num - 2;
                    twosCount++;
                } else {
                    twosCount++;
                }
            }

            int a = (onesCount + 1) / 2;
            int b = onesCount / 2;
            boolean flag = onesCount % 2 == 1;

            if ((flag && moreCount % 2 == 1) || (!flag && moreCount % 2 == 0)) {
                flag = !flag;
            }

            if (flag) {
                a += twosCount;
            } else {
                b += twosCount;
            }

            if (a > b) {
                System.out.println("Alice");
            } else if (b > a) {
                System.out.println("Bob");
            } else {
                System.out.println("Draw");
            }
        }
    }
}
