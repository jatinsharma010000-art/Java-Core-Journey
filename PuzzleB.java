// Problem : take one number ( either 0 or 1 ) & flip it ..

import java.util.Scanner;

public class PuzzleB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("write one number ( Either 0 or 1 ): ");
        int number = sc.nextInt();

        int output = 1 - number;

        System.out.print("output: " + output);

        sc.close(); // prevent the data from being leaked ..

    }
}
