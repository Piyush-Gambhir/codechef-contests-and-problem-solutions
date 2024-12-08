import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int N = sc.nextInt();
            int X = sc.nextInt();

            boolean possible = false;

            int startA = (int)Math.ceil(X / 3.0);
            for (int a = startA; a <= N; a++) {
                int b = 3 * a - X;
                int c = N - 4 * a + X;

                if (c >= 0) {
                    possible = true;
                    System.out.println("YES");
                    System.out.println(a + " " + b + " " + c);
                    break;
                }
            }

            if (!possible) {
                System.out.println("NO");
            }
        }
    }
}
