// Problem : swap two number with any temp variable & without using + & - operators

import java.util.Scanner;

public class FourDigitPlay1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("write first 2 digit non zero number: ");
        int firstNumber = sc.nextInt();

        System.out.print("write first 3 digit non zero number: ");
        int secondNumber = sc.nextInt();

        firstNumber = firstNumber * secondNumber;

        secondNumber = firstNumber / secondNumber;
        firstNumber = firstNumber / secondNumber;

        System.out.println("first Number: " + firstNumber);
        System.out.println("second number: " + secondNumber);

        sc.close(); // prevent the data from being leaked ..

    }
}
