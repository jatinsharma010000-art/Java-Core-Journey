// Problem : Building Trading Order System

import java.util.Scanner;

public class AlgorithmicTradingOrder {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Order Side: ");
        char orderSide = sc.next().charAt(0);

        System.out.print("Order Type: ");
        char orderType = sc.next().charAt(0);

        System.out.print("Market Price: ");
        double marketPrice = sc.nextDouble();

        System.out.print("limit Price: ");
        double limitOrder = sc.nextDouble();

        if (orderType == 'M' || orderType == 'm') {

            if (orderSide == 'B' || orderSide == 'b' || orderSide == 'S' || orderSide == 's') {
                System.out.println("EXECUTED IMMEDIATELY at Market Price: " + marketPrice);
            }

            else {
                System.out.print("Invalid Order Side");
            }
        }

        else if (orderType == 'L' || orderType == 'l') {

            if (orderSide == 'B' || orderSide == 'b') {
                if (marketPrice <= limitOrder) {
                    System.out.println("BUY LIMIT EXECUTED at $" + marketPrice);
                }

                else {
                    System.out.println("ORDER QUEUED: Waiting for price to drop to $" + limitOrder);
                }
            }

            else if (orderSide == 'S' || orderSide == 's') {
                if (marketPrice >= limitOrder) {
                    System.out.println("SELL LIMIT EXECUTED at $" + marketPrice);
                } else {
                    System.out.println("ORDER QUEUED: Waiting for price to rise to $" + limitOrder);
                }
            }

            else {
                System.out.println("invalid Order Side");
            }
        }

        else {
            System.out.println("Invalid order type");
        }

        sc.close();

    }
}
