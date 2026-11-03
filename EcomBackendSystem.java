// Problem ; building Ecom Backend System ..

import java.util.Scanner;

public class EcomBackendSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Order Amount: ");
        double orderAmount = sc.nextDouble();

        System.out.print("Account Balance: ");
        double accountBalance = sc.nextDouble();

        System.out.print("Is your account frozen: ");
        boolean isAccountFrozen = sc.nextBoolean();

        System.out.print("Transaction Limit: ");
        double dailyTransactionLimit = sc.nextDouble();

        if (isAccountFrozen == true) {
            System.out.println("DECLINED: Account is frozen. Contact security.");
        }

        else {
            if (orderAmount <= 0) {
                System.out.println("DECLINED: Order amount must be greater than zero.");
            }

            else {
                if (orderAmount > accountBalance) {
                    System.out.println("DECLINED: Insufficient funds. Short by $" + (orderAmount - accountBalance));
                }

                else {
                    if (orderAmount > dailyTransactionLimit) {
                        System.out.println("DECLINED: Exceeds daily limit by $" + (orderAmount - dailyTransactionLimit));
                    }

                    else {
                        System.out.println("APPROVED: Order placed successfully!");
                        System.out.println("Remaining Balance: $" + (accountBalance - orderAmount));

                        if (orderAmount >= 50000) {
                            System.out.println("SECURITY NOTICE: High-value transaction logged for audit.");
                        }
                    }
                }

            }
        }

        sc.close();

    }
}
