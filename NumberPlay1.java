// Problem : PART 1 , swap the number without any temporary variable ..

import java.util.Scanner;

public class NumberPlay1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("write the first number : ");
        int firstNumber = sc.nextInt();

        System.out.print("write the second number : ");
        int secondNumber = sc.nextInt();

        firstNumber = firstNumber + secondNumber;

        secondNumber = firstNumber - secondNumber;
        firstNumber = firstNumber - secondNumber;

        System.out.println("first number: " + firstNumber);
        System.out.println("second number: " + secondNumber);

        sc.close(); // prevent the data from being leaked ..

    }
}
