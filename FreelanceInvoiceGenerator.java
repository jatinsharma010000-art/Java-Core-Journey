// Problem ; calculating the 3 milestone payment along with the platform charges

import java.util.Scanner;

public class FreelanceInvoiceGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("1 milestone payment: ");
        int firstMilestone = sc.nextInt();

        System.out.print("2 milestone payment: ");
        int secondMilestone = sc.nextInt();

        System.out.print("3 milestone payment: ");
        int thirdMilestone = sc.nextInt();

        System.out.print("platform fees: ");
        int platformTax = sc.nextInt();

        int grossEarning = firstMilestone + secondMilestone + thirdMilestone;
        double platformFees = (double) grossEarning * platformTax / 100;
        double netPayout = (double) grossEarning - platformFees;
        double averageMilestonePayout = netPayout / 3;

        System.out.println("Gross Earnings: " + grossEarning);
        System.out.println("Platform fee: " + platformFees);
        System.out.println("Net Payout: " + netPayout);
        System.out.println("Average Milestone Payout: " + averageMilestonePayout);

        sc.close(); // prevent the data from being leaked ..

    }
}
