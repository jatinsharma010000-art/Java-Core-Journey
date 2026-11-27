// Problem :

import java.util.Scanner;

public class ModularBankAccount {

    public static void showBalance(double balance) {
        System.out.println("Your Bank Balance is " + balance);
    }

    public static double deposit(double balance, double amount) {
        balance += amount;
        return balance;
    }

    public static double withdraw(double balance, double amount) {
        balance -= amount;
        return balance;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Write your balance : ");
        double balance = sc.nextDouble();

        while (balance < 0) {
            System.out.print("Invalid Input | try again : ");
            balance = sc.nextInt();
        }

        boolean anyMoreRequest = true;

        while (anyMoreRequest) {

            System.out.print("Tell me your Request sir ( 1 = Check Balance, 2 = Deposit, 3 = Withdraw, 4 = Exit ) : ");
            int request = sc.nextInt();

            switch (request) {

                case 1:

                    showBalance(balance);
                    break;

                case 2:

                    System.out.print("How much you want to deposite : ");
                    double deposit = sc.nextDouble();

                    while (deposit < 0) {
                        System.out.print("Invalid Input | try again ");
                        deposit = sc.nextDouble();
                    }

                    balance = deposit(balance, deposit);
                    showBalance(balance);
                    break;

                case 3:

                    System.out.print("How much you want to withdraw : ");
                    double withdraw = sc.nextDouble();

                    while (withdraw < 0) {
                        System.out.print("Invalid Input | try again ");
                        withdraw = sc.nextDouble();
                    }

                    balance = withdraw(balance, withdraw);
                    showBalance(balance);
                    break;

                case 4:

                    System.out.println("Have a nice day sir / maam ");
                    anyMoreRequest = false;
                    break;

                default:
                    System.out.print("Invalid Option");

            }

        }

        sc.close();

    }
}
