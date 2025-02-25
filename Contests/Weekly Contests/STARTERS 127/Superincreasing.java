import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            long X = sc.nextLong();

            K--;
            if (K >= 30) {
                System.out.println("NO");
                continue;
            }
            int minval = (int) Math.pow(2, K);
            if (X >= minval) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
