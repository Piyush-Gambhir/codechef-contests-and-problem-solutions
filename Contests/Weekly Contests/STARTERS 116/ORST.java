import java.util.*;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();

        while (testCases-- > 0) {
            int sizeA = sc.nextInt();
            int sizeB = sc.nextInt();
            int maxB = 0;

            List<Integer> arrayA = new ArrayList<>();
            List<Integer> arrayB = new ArrayList<>();

            for (int i = 0; i < sizeA; i++) {
                arrayA.add(sc.nextInt());
            }

            for (int i = 0; i < sizeB; i++) {
                int num = sc.nextInt();
                arrayB.add(num);
                maxB = Math.max(num, maxB);
            }

            Collections.sort(arrayA.subList(sizeA - maxB, sizeA));

            for (int element : arrayA) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
