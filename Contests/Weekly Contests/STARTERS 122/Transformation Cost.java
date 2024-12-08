import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long N = sc.nextLong();
            long totalCost = calculateTransformationCost(N);
            System.out.println(totalCost);
        }
    }
    
    private static long calculateTransformationCost(long N) {
        long totalCost = 0;
        while (true) {
            String binary = Long.toBinaryString(N);
            binary = padWithZeros(binary);
            int pos = binary.indexOf("101");
            if (pos == -1) {
                break;
            }
            int k = countOnesBeforePosition(binary, pos);
            int x = calculateX(k);
            N += (1L << x);
            totalCost += (1L << x);
        }
        return totalCost;
    }
    
    private static String padWithZeros(String binary) {
        while (binary.length() < 64) {
            binary = "0" + binary;
        }
        return binary;
    }
    
    private static int countOnesBeforePosition(String binary, int pos) {
        int count = 0;
        for (int i = pos - 1; i >= 0 && binary.charAt(i) == '1'; i--) {
            count++;
        }
        return count;
    }
    
    private static int calculateX(int k) {
        int x = 0;
        while ((1L << (x + 1)) <= k) {
            x++;
        }
        return x;
    }
}
