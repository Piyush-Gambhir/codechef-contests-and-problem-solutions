import java.util.*;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int t = 0; t < T; t++) {
            int x = sc.nextInt();
            int[] y = new int[x];

            for (int i = 0; i < x; i++) {
                y[i] = sc.nextInt();
            }

            int result = solve(x, y);
            System.out.println(result);
        }
    }

    public static int solve(int x, int[] y) {
        Arrays.sort(y);

        int r = 0;
        for (int i = 1; i <= x; i++) {
            r = Math.abs((i - 1) - y[i - 1]);
        }

        return r;
    }
}
