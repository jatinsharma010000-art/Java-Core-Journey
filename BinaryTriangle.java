// Problem : Printing the Binary Triangle pattern ..

import java.util.Scanner;

public class BinaryTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Write the Row number : ");
        int row = sc.nextInt();

        while (row <= 0) {

            System.out.println("Please enter the valid number");

            System.out.print("Write the Row number : ");
            row = sc.nextInt();

        }

        System.out.println("Here is your Binary Triangle Pattern : ");

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {

                if (i == j || (i + j) % 2 == 0) {
                    System.out.print("1 ");
                }

                else {
                    System.out.print("0 ");
                }
            }

            System.out.println();
        }

        sc.close();
    }
}
