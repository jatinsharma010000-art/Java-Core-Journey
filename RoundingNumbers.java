// Round off the decimla numbers  

import java.util.Scanner;

public class RoundingNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("write any decimal number: ");
        double decimalNumber = sc.nextDouble();

        int wholeNumber = (int) (decimalNumber + 0.5);

        System.out.print("the whole number of the number " + decimalNumber + " is: " + wholeNumber);

        sc.close(); // prevent the data from being leaked ..

    }
}
