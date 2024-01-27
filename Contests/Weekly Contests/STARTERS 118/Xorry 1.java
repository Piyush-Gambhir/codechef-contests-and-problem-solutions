import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();

            int nearestPowerOf2 = findNearestPowerOf2(x);

            int a = x - nearestPowerOf2;
            int b = nearestPowerOf2;

            System.out.println(a + " " + b);
        }
    }

    private static int findNearestPowerOf2(int x) {
        int power = 0;
        while (x > 0) {
            x = x >> 1;
            power++;
        }
        return (int) Math.pow(2, power - 1);
    }
}
