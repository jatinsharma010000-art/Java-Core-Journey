// Problem : Printing the Star Cross pattern ..

import java.util.Scanner;

public class StarCross {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Write the Row number : ");
        int row = sc.nextInt();

        System.out.print("Write the Column number : ");
        int column = sc.nextInt();

        while (row <= 0 || row != column || row % 2 == 0) {

            System.out.println("Please enter the valid number");

            System.out.print("Write the Row number : ");
            row = sc.nextInt();

            System.out.print("Write the Column number : ");
            column = sc.nextInt();

        }

        System.out.println("Here is your Star Cross Pattern : ");

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= column; j++) {

                if (i == j || i + j == (row + 1)) {
                    System.out.print("* ");
                }

                else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }

        sc.close();

    }
}
