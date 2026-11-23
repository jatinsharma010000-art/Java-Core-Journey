// Problem ; Building the Loan Amortization & Debt Trap Engine .. 

import java.util.Scanner;

public class LoanAmortizationNDebtTrapEngine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Starting Loan Principal: ");
        double principal = sc.nextDouble();
        double realPrincipal = principal; // Because principal data will be changed ..

        System.out.print("Monthly Interest Rate: ");
        double monthlyInterestRate = sc.nextDouble();

        System.out.print("Fixed Monthly Payment: ");
        double fixedMonthlyPayment = sc.nextDouble();

        int months = 0;
        double totalMoneyPaid = 0;

        if (principal > 0 && monthlyInterestRate >= 0 && fixedMonthlyPayment > 0) {
            if (principal * monthlyInterestRate / 100 < fixedMonthlyPayment) {

                while (principal > 0) {

                    principal += principal * monthlyInterestRate / 100;

                    if (principal <= fixedMonthlyPayment) {
                        fixedMonthlyPayment = principal;
                    }

                    principal -= fixedMonthlyPayment;
                    totalMoneyPaid += fixedMonthlyPayment;
                    months++;

                }

                System.out.println("Months: " + months);
                System.out.println("Total Interest Paid: " + (totalMoneyPaid - realPrincipal));
                System.out.println("Final Month Payment: " + fixedMonthlyPayment);

            }

            else {
                System.out.println("It's a debt-trap");
            }
        }

        else {
            System.out.println("Invalid Input");
        }

        sc.close();

    }
}
