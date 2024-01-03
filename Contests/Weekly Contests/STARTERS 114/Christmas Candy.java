import java.util.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }

            int maxSoFar = A[0];
            Set<Integer> receivers = new HashSet<>();

            for (int i = 1; i < N; i++) {
                if (A[i] < maxSoFar) {
                    receivers.add(i);
                }
                maxSoFar = Math.max(maxSoFar, A[i]);
            }

            System.out.println(receivers.size());
        }
    }
}
