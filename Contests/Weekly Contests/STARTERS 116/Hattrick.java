import java.util.*;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            char A = sc.next().charAt(0);
            char B = sc.next().charAt(0);
            char C = sc.next().charAt(0);
            char D = sc.next().charAt(0);
            char E = sc.next().charAt(0);
            char F = sc.next().charAt(0);

            if ((A == 'W' && B == 'W' && C == 'W') || (B == 'W' && C == 'W' && D == 'W')
                    || (C == 'W' && D == 'W' && E == 'W') || (D == 'W' && E == 'W' && F == 'W')) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
