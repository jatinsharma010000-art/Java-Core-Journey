// Problem : Printing the Star Pyramid pattern ..

import java.util.Scanner;

public class StarPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Write the Row number : ");
        int row = sc.nextInt();

        while (row <= 0) {

            System.out.println("Please enter the valid number");

            System.out.print("Write the Row number : ");
            row = sc.nextInt();

        }

        System.out.println("Here is your Star Pyramid Pattern : ");

        for (int i = 1; i <= row; i++) {

            for (int j = 1; j <= row - i; j++) {
                System.out.print("  ");
            }

            for (int k = 1; k <= (2 * i) - 1; k++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        sc.close();

    }
}
