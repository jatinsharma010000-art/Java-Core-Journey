// Problem ; trading and banking integer overflow .. 

import java.util.Scanner;

public class TradingBankingProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("write the number of shares traded: ");
        int numberOfShares = sc.nextInt();

        System.out.print("what the price per share: ");
        int pricePerShare = sc.nextInt();

        long totalPrice = (numberOfShares * pricePerShare);
        System.out.println("total price: " + totalPrice);

        // this syntax will break the code because the int datatypes is a 32 bits box,
        // meaning it can stores value around 2 billions, any number larger than it's
        // limit will break the code.

        totalPrice = (long) numberOfShares * pricePerShare;
        System.out.println("total price: " + totalPrice);

        // long Datatype is a 64 bits box, it can easily stors value around
        // 9.22 quintillion. it's way larger capacity , that's casting a int varaible
        // number into long datatypes run the code without any error

        sc.close(); // prevent the data from being leaked ..

    }
}
