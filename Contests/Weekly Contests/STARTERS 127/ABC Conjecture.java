import java.util.*;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int N = sc.nextInt();
            String A = sc.next();
            String B = sc.next();
            Queue<Integer> q = new LinkedList<>();
            int curr = -1;
            boolean flag = true;
            for (int i = 0; i < N; i++) {
                if (A.charAt(i) == B.charAt(i)) {
                    if (A.charAt(i) == 'b') {
                        curr = i;
                    }
                } else if (A.charAt(i) == 'a' && B.charAt(i) == 'c') {
                    q.add(i);
                } else if (A.charAt(i) == 'c' && B.charAt(i) == 'a') {
                    if (!q.isEmpty() && q.peek() < curr) {
                        q.poll();
                    } else {
                        System.out.println("No");
                        flag = false;
                        break;
                    }
                } else {
                    System.out.println("No");
                    flag = false;
                    break;
                }
            }
            if (flag && !q.isEmpty()) {
                System.out.println("No");
            } else if (flag) {
                System.out.println("Yes");
            }
        }
        sc.close();
    }
}
