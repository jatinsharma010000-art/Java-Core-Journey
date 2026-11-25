// Problem : Printing the Floyd Triangle pattern ..

import java.util.Scanner;

public class FloydTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Write the Row number : ");
        int row = sc.nextInt();

        int counter = 0;

        while (row <= 0) {

            System.out.println("Please enter the valid number");

            System.out.print("Write the Row number : ");
            row = sc.nextInt();

        }

        System.out.println("Here is your Floyd Triangle Pattern : ");

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                counter++;
                System.out.print(counter + " ");
            }

            System.out.println("  ");
        }

        sc.close();

    }
}
