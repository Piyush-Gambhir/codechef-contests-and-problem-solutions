import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int X = sc.nextInt();
            int Y = sc.nextInt();

            if (X < 50) {
                System.out.println("Z");
            } else if (Y < 50) {
                System.out.println("F");
            } else {
                System.out.println("A");
            }
        }
    }
}
