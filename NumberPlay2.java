// Problem ; take 3 digit number , add the digits & reverse it's first number & last number ..

import java.util.Scanner;

public class NumberPlay2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("write three Digit number : ");
        int number = sc.nextInt(); // 987

        int firstDigit = number / 100;
        int secondDigit = (number / 10) % 10;
        int thirdDigit = number % 10;

        int sumOfDigit = firstDigit + secondDigit + thirdDigit;
        int reverseNumber = (thirdDigit * 100) + (secondDigit * 10) + (firstDigit);

        System.out.println("sum of digit: " + sumOfDigit);
        System.out.print("Reverse NUmber : " + reverseNumber);

        sc.close(); // prevent the data from being leaked ..

    }
}
