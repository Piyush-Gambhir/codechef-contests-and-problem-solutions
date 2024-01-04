import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(br.readLine());

        while (testCases-- > 0) {
            int size = Integer.parseInt(br.readLine());

            int[] arr = new int[size];
            Map<Integer, List<Integer>> freqMap = new HashMap<>();
            String[] input = br.readLine().split(" ");
            for (int i = 0; i < size; i++) {
                arr[i] = Integer.parseInt(input[i]);
                freqMap.computeIfAbsent(arr[i], k -> new ArrayList<>()).add(i);
            }

            int answer = size, last = size + 1;
            for (Map.Entry<Integer, List<Integer>> entry : freqMap.entrySet()) {
                int key = entry.getKey();
                List<Integer> value = entry.getValue();
                int position = Collections.binarySearch(value, last);
                if (position < 0) {
                    position = -position - 1;
                }
                if (position > 0) {
                    position--;
                    size -= position + 1;
                    answer = Math.min(answer, size + key);
                    last = value.get(0);
                }
            }

            System.out.println(answer);
        }
    }
}
