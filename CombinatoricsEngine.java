// Problem : Permutation & Combination 

import java.util.Scanner;

public class CombinatoricsEngine {

    public static long factorial(int a) {
        long factorial = 1;

        for (int i = 1; i <= a; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static long nCr(int n, int r) {
        long nCr = factorial(n) / (factorial(r) * factorial(n - r));
        return nCr;
    }

    public static long nPr(int n, int r) {
        long nPr = factorial(n) / factorial(n - r);
        return nPr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("What is N: ");
        int n = sc.nextInt();

        System.out.print("What is P: ");
        int r = sc.nextInt();

        while (n < 0 || r < 0 || n < r || n > 21) {
            System.out.println("Inavlid Input : try again ");

            System.out.print("What is N: ");
            n = sc.nextInt();

            System.out.print("What is P: ");
            r = sc.nextInt();
        }

        System.out.println("Combination: " + nCr(n, r));
        System.out.println("Permutation: " + nPr(n, r));

        sc.close();

    }
}
