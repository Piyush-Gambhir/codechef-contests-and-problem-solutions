import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int[] playerScores = new int[22];

            for (int j = 0; j < 22; j++) {
                int runs = sc.nextInt();
                int wickets = sc.nextInt();
                playerScores[j] = runs + (wickets * 20);
            }

            int maxScore = 0;
            int manOfTheMatchIndex = 0;
            for (int j = 0; j < 22; j++) {
                if (playerScores[j] > maxScore) {
                    maxScore = playerScores[j];
                    manOfTheMatchIndex = j + 1;
                }
            }

            System.out.println(manOfTheMatchIndex);
        }

        sc.close();
    }
}