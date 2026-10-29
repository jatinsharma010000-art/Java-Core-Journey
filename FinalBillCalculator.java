
// Problem ; calculator that add the price of the 3 items along with the Tax.
import java.util.Scanner;

public class FinalBillCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //

        System.out.print("1st item price : ");
        int item1 = sc.nextInt();

        System.out.print("2nd item price : ");
        int item2 = sc.nextInt();

        System.out.print("3rd item price : ");
        int item3 = sc.nextInt();

        System.out.print("tax: ");
        int tax = sc.nextInt();

        int sumOfAll = item1 + item2 + item3; // this will the prices of all the three item in one place

        double average = (double) sumOfAll / 3; // calculate the average
        double calculatedTax = (double) sumOfAll * tax / 100; // calculate the tax
        double finalBill = (double) sumOfAll + calculatedTax; // calculate the final bill

        System.out.println("subtotal: " + sumOfAll);
        System.out.println("Exact Average: " + average);
        System.out.println("Final Bill: " + finalBill);

        sc.close(); // prevent the data from being leaked ..

    }
}
