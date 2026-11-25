// Problem : Printing the Hollow Rectangle pattern ..

import java.util.Scanner;

public class HollowRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Write the Row number : ");
        int row = sc.nextInt();

        System.out.print("Write the Column number : ");
        int column = sc.nextInt();

        while (row <= 0 || column <= 0) {

            System.out.println("Please enter the valid number");

            System.out.print("Write the Row number : ");
            row = sc.nextInt();

            System.out.print("Write the Column number : ");
            column = sc.nextInt();

        }

        System.out.println("Here is your Hollow Rectangle Pattern : ");

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= column; j++) {

                if (i == 1 || j == 1 || i == row || j == column) {
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
