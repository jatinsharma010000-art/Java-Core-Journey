// Problem : Building The Automated Margin & Leverage Risk Engine 

import java.util.Scanner;

public class FutureNOptionTrading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Asset Class Code : ");
        char assetClassCode = sc.next().charAt(0);

        System.out.print("Your Account Capital : ");
        double accountCapital = sc.nextDouble();

        System.out.print("The Position Size : ");
        double positionSize = sc.nextDouble();

        System.out.print("Are there any High-Volatility News Day ? : ");
        boolean isHighVolatilityNewsDays = sc.nextBoolean();

        if (accountCapital <= 0 || positionSize <= 0) {
            System.out.println("REJECTED: Capital and Position Size must be positive.");
        }

        else {
            double requestedLeverage = positionSize / accountCapital;
            double maximumAllowedLeverage = 0;

            if (assetClassCode == 'E' || assetClassCode == 'e') {
                if (isHighVolatilityNewsDays) {
                    maximumAllowedLeverage = 2.0;
                }

                else {
                    maximumAllowedLeverage = 5.0;
                }
            }

            else if (assetClassCode == 'C' || assetClassCode == 'c') {
                if (isHighVolatilityNewsDays) {
                    maximumAllowedLeverage = 1.0;
                }

                else {
                    maximumAllowedLeverage = 3.0;
                }
            }

            else {
                System.out.println("REJECTED: Unsupported Asset Class");
            }

            if (maximumAllowedLeverage > 0) {
                double minimumRequiredCapital = positionSize / maximumAllowedLeverage;

                if (requestedLeverage > maximumAllowedLeverage) {
                    System.out.println("MARGIN CALL REJECTED: Requested " + requestedLeverage + "x exceeds max allowed "
                            + maximumAllowedLeverage + "x. Add ₹"
                            + (minimumRequiredCapital - accountCapital)
                            + " more capital.");
                }

                else {
                    System.out.println("TRADE APPROVED at " + requestedLeverage + "x leverage! Free Margin Remaining: ₹"
                            + (accountCapital - minimumRequiredCapital));
                }

            }

        }
        sc.close();
    }

}
