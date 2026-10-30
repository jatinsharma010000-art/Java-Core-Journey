// Problem : take a 4 digit number, extract it digit & then add the outer digits , multiple the inner digits   

import java.util.Scanner;

public class FourDigitPlay2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("write one 4 digit number: ");
        int number = sc.nextInt(); // 5468

        int firstNumber = number / 1000;
        int secondNumber = (number % 1000) / 100;
        int thirdNumber = (number % 100) / 10;
        int forthNumber = number % 10;

        int sumOfTheOuterDigit = firstNumber + forthNumber;
        int productOfTheDigit = secondNumber * thirdNumber;

        System.out.println("sum of the outer digit: " + sumOfTheOuterDigit);
        System.out.println("product of the inner digit: " + productOfTheDigit);

        sc.close();  // prevent the data from being leaked ..

    }
}
