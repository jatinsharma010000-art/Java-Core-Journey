// Problem : find out the P&L amount, Percentage Change, and the Action message ..

import java.util.Scanner;

public class StockMarketPnL {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("write the Entry Price: ");
        double entryPrice = sc.nextDouble();

        System.out.print("write the Current Price: ");
        double currentPrice = sc.nextDouble();

        System.out.print("write the Quantity of shares: ");
        double sharesQuantity = sc.nextDouble();

        if (entryPrice <= 0 || currentPrice <= 0 || sharesQuantity <= 0) {
            System.out.print("Invalid Trade Inputs");
        }

        else {

            double position = (currentPrice - entryPrice) * sharesQuantity;
            double positionPercentage = ((currentPrice - entryPrice) / entryPrice) * 100;

            String status = (positionPercentage <= -5) ? "TRIGGER STOP-LOSS (SELL)"
                    : (positionPercentage >= 10) ? "TAKE PROFIT (SELL)" : "HOLD POSITION";

            System.out.println("Total P&L:" + position);
            System.out.println("Change %: " + positionPercentage);
            System.out.println("Action: " + status);

        }

        sc.close();

    }
}
