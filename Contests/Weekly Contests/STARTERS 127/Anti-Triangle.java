import java.util.*;

class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int N = scanner.nextInt();
            int L = scanner.nextInt();
            List<Integer> ans = new ArrayList<>();

            for (int i = 1; i <= N; i++) {
                ans.add(i * L);
            }

            for (int it : ans) {
                System.out.print(it + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
