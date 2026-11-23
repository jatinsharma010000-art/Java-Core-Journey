// Problem : take one Number ; find out & print all the factor(s) within that Number,
// count all the factor(s) , is that Number is prime , 

import java.util.Scanner;

public class MathematicalNumberClassifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("write the number : ");
        int number = sc.nextInt();

        int totalProperDivisor = 0;
        int properDivisorSum = 0;
        boolean isPrime = false;

        if (number > 0) {
            System.out.print("Proper Divisor : ");

            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    System.out.print(i + " ");
                    totalProperDivisor++;
                    properDivisorSum += i;
                }
            }
            System.out.println();
            System.out.println("Count : " + totalProperDivisor);

            if (totalProperDivisor == 1) isPrime = true;
            System.out.println("Prime : " + isPrime);

            if (properDivisorSum == number) System.out.println("Type : Perfect");
            else if (properDivisorSum > number) System.out.println("Type : Abundant");
            else System.out.println("Type : Deficient");

        }

        else {
            System.out.println("Invalid Number");
        }

        sc.close();

    }
}
