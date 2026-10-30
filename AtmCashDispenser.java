// Problem : which currency notes comes out of the ATM machine & how much notes ..

import java.util.Scanner;

public class AtmCashDispenser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("how much money you want to withdrawal: ");
        int withdrawalAmount = sc.nextInt(); // 2853

        int fiveHundredNotes = withdrawalAmount / 500;
        int twoHundredNotes = (withdrawalAmount - (fiveHundredNotes * 500)) / 200;
        int oneHundredNotes = (withdrawalAmount - (fiveHundredNotes * 500 + twoHundredNotes * 200)) / 100;
        int oneRuppesNotes = (withdrawalAmount - (fiveHundredNotes * 500 + twoHundredNotes * 200 + oneHundredNotes * 100));
               

        System.out.print(fiveHundredNotes + " - 500 notes, " + twoHundredNotes + " - 200 notes, " + oneHundredNotes
                + " - 100 notes, " + oneRuppesNotes + " - 1 ruppees notes / coin");

                sc.close(); // prevent the data from being leaked ..

    }
}
