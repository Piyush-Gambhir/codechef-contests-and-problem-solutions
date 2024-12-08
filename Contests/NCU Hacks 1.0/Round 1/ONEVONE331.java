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
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.println(canBeSorted(arr) ? "YES" : "NO");
        }
    }

    static boolean canBeSorted(int[] arr) {
        int n = arr.length;
        int outOfOrderIndex = -1;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                outOfOrderIndex = i;
                break;
            }
        }

        if (outOfOrderIndex == -1) {
            return true;
        }

        int temp = arr[outOfOrderIndex];
        arr[outOfOrderIndex] = arr[outOfOrderIndex + 1];
        arr[outOfOrderIndex + 1] = temp;

        boolean sorted = true;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                sorted = false;
                break;
            }
        }

        temp = arr[outOfOrderIndex];
        arr[outOfOrderIndex] = arr[outOfOrderIndex + 1];
        arr[outOfOrderIndex + 1] = temp;

        return sorted;

    }
}
