// Problem : Printing the Floyd Triangle pattern ..

import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Write the Row number : ");
        int row = sc.nextInt();
        int realRow = row;
        int s = 1;

        while (row <= 0) {

            System.out.println("Please enter the valid number");

            System.out.print("Write the Row number : ");
            row = sc.nextInt();

        }

        System.out.println("Here is your Diamond Pattern Pattern : ");

        if (row % 2 == 0) {
            row = (row * 2) + 1;
        }

        for (int i = 1; i <= row; i++) {

            if (i <= realRow) {

                for (int j = 1; j <= row - i; j++) {
                    System.out.print(" ");
                }

                for (int k = 1; k <= (i * 2) + 1; k++) {
                    System.out.print("* ");
                }
            }

            else {

                for (int j = 1; j <= s; j++) {
                    System.out.print(" ");
                    s++;
                }

                for (int k = 1; k <= (i * 2) + 1; k++) {
                    System.out.print("* ");
                }

            }
        }

    }
}
