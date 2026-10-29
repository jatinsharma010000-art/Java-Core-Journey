// Problem ; find out is someone is eligible for loan or not ..

import java.util.Scanner;

public class LoanEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Your age: ");
        int userAge = sc.nextInt();

        System.out.print("Your monthly income: ");
        double monthlyIncome = sc.nextDouble();

        System.out.print("your credit Score ");
        int creditScore = sc.nextInt();

        System.out.print("Do you have any existing loan: ");
        boolean hasExistingLoan = sc.nextBoolean();

        boolean isLoanEligible = ((userAge <= 21 && userAge <= 60) && (monthlyIncome >= 25000.0))
                && (creditScore >= 750 || !hasExistingLoan);

        System.out.println("is the person eligible for loan ? " + isLoanEligible);

        // Problem ; find the value of x ;

        int x = 5;

        int result = x++ + ++x * 2 - x--;

        // x++ means use the current value of x then increase it by one.
        // ++x means increase the value of x by one then use the new value
        // x-- means use the current value then decrease it by one.

        // placing the value of x , this equation will be formed -> 5 + 7 * 2 - 7 ,

        // Brain calculation ;
        // 5 + 7 * 2 - 7
        // 5 + 14 - 7
        // 19 - 7
        // 12

        // the answer from my Brain = 12;

        System.out.println("the value of x : " + x);
        System.out.println("Result: " + result);

        sc.close(); // prevent the data from being leaked ..

    }

}
