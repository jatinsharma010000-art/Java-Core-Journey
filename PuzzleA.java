// Problem : take two number & check both number have opposite sign ..

import java.util.Scanner;

public class PuzzleA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("write the first number: ");
        int firstNumber = sc.nextInt();

        System.out.print("write the second number: ");
        int secondNumber = sc.nextInt();

        boolean isOppositeSignNumber = firstNumber * secondNumber < 0;
        System.out.print("are the number has opposite sign: " + isOppositeSignNumber);

        sc.close(); // prevent the data from being leaked ..

    }
}
