// Problem :  take one number ; find the total number of digits , add all the even number ,
// add all the odd number & is it palindrome or not ?

import java.util.Scanner;

public class TransactionID {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Write your Transaction ID number : ");
        long transactionID = sc.nextLong();
        long realTransactionID = transactionID; // Because transactionID data will be changed ..

        int totalNumberDigits = 0;
        int evenDigitSum = 0;
        int oddDigitSum = 0;
        boolean isPalindrome = false;
        long palindromeNumber = 0;

        if (transactionID >= 0) {
            while (transactionID != 0) {

                long n = transactionID % 10;
                if (n % 2 == 0)
                    evenDigitSum += n;
                else
                    oddDigitSum += n;

                totalNumberDigits++;
                palindromeNumber = (palindromeNumber * 10) + n;
                transactionID = transactionID / 10;

            }

            if (realTransactionID == palindromeNumber) isPalindrome = true;

            System.out.println("Digits: " + totalNumberDigits);
            System.out.println("Even Digit Sum: " + evenDigitSum);
            System.out.println("Odd Digit Sum: " + oddDigitSum);
            System.out.println("Mirror ID: " + isPalindrome);

        }

        else {
            System.out.println("Invalid Input");
        }

        sc.close();

    }
}
