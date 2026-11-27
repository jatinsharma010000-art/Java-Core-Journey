// Problem : How many Prime numbers between two number ..

import java.util.Scanner;

public class PrimeRangeAnalyzer {

    public static boolean isPrime(int a) {
        int number = 0;

        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                number++;
            }
        }

        if (number != 0 && number <= 2) {
            return true;
        }

        else
            return false;
    }

    public static int printPrimesInRange(int start, int end) {
        int numberOfPrime = 0;

        System.out.print("The Prime Number between " + start + " & " + end + " are: ");

        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + ", ");
                numberOfPrime++;
            }
        }

        System.out.println();
        return numberOfPrime;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Start: ");
        int start = sc.nextInt();

        System.out.print("End: ");
        int end = sc.nextInt();

        while (start < 0 || start > end) {
            System.out.println("Invalid Input: Try Again");

            System.out.print("Start: ");
            start = sc.nextInt();

            System.out.print("End: ");
            end = sc.nextInt();

        }

        System.out.println(
                "the total number of prime between " + start + " & " + end + " is " +
                        printPrimesInRange(start, end));

        sc.close();

    }
}
