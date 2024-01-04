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
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }

            int[] B = new int[N];
            for (int i = 0; i < N; i++) {
                B[i] = sc.nextInt();
            }

            Arrays.sort(A);
            Arrays.sort(B);
            reverse(B);

            boolean flag = false;

            Set<Integer> st = new HashSet<>();

            for (int i = 0; i < N; i++) {
                st.add(A[i] + B[i]);
            }

            if (st.size() == 1) {
                for (int i : A) {
                    System.out.print(i + " ");
                }
                System.out.println();
                for (int i : B) {
                    System.out.print(i + " ");
                }
                System.out.println();
            } else {
                System.out.println("-1");
            }
        }
    }

    private static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
