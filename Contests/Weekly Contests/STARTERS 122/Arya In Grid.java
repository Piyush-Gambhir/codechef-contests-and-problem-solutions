import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int X0 = sc.nextInt();
            int Y0 = sc.nextInt();
            int L = sc.nextInt();

            if (L == 1) {
                System.out.println((long) N * M);
            } else {
                int up = (X0 - 1) / L;
                int down = (N - X0) / L;
                int left = (Y0 - 1) / L;
                int right = (M - Y0) / L;

                System.out.println(1L + (up + down) + (left + right) + (up + down) * (long) (left + right));
            }
        }
    }
}
