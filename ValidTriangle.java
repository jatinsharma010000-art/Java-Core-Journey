// Problem : take three inputs & figure out the valid Triangle ..

import java.util.Scanner;

public class ValidTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("write the first side: ");
        int firstSide = sc.nextInt();

        System.out.print("write the second side: ");
        int secondSide = sc.nextInt();

        System.out.print("write the third side: ");
        int thirdSide = sc.nextInt();

        if (firstSide + secondSide > thirdSide && secondSide + thirdSide > firstSide
                && thirdSide + firstSide > secondSide) {

            if (firstSide == secondSide && secondSide == thirdSide && thirdSide == firstSide) {

                System.out.print("Valid Triangle - Type : Equilateral Triangle");
            }

            else if ((firstSide * firstSide) + (secondSide * secondSide) == (thirdSide * thirdSide)
                    || (secondSide * secondSide) + (thirdSide * thirdSide) == (firstSide * firstSide)
                    || (thirdSide * thirdSide) + (firstSide * firstSide) == (secondSide * secondSide)) {

                System.out.print("Valid Triangle - Type : Right-Angled Triangle");
            }

            else if (firstSide == secondSide || secondSide == thirdSide || thirdSide == firstSide) {

                System.out.print("Valid Triangle - Type : Isosceles Triangle");
            }

            else {
                System.out.print("Valid Triangle - Type : Scalene Triangle");
            }

        }

        else {
            System.out.print("Invalid Triangle: Sides cannot close!");
        }

        sc.close();

    }
}
