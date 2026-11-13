// Problem : find the tax bracket based on the income ..

import java.util.Scanner;

public class TaxBracketFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Your Annual income: ");
        double annualIncome = sc.nextDouble();

        double taxRate = (annualIncome <= 5) ? 0.0
                : (annualIncome > 5.0 && annualIncome <= 10.0) ? 10
                        : (annualIncome > 10 && annualIncome <= 20.0) ? 20.0 : (annualIncome > 20.0) ? 30 : 30 ;

        double taxAmount = annualIncome * taxRate / 100;

        String isTaxable = (taxAmount > 0) ? "Taxable Citizen" : "Tax-Exempt Citizen";

        System.out.println("Tax Rate: " + taxRate + "%");
        System.out.println("tax Amount: " + taxAmount);
        System.out.println("Are you a: " + isTaxable);

        sc.close();
    }
}
