// Problem : Any serial number divisible by 3 or 5 must be flagged for quality inspection - 
// except serial numbers divisible by 15,

import java.util.Scanner;

public class FactorySerialAuditor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Starting number : ");
        int start = sc.nextInt();

        System.out.print("End number : ");
        int end = sc.nextInt();

        int totalFlaggedItem = 0;
        int flaggedSerialSum = 0;

        if (start <= end && start >= 0 && end >= 0) {

            for (int i = start; i <= end; i++) {
                if (i % 3 == 0 || i % 5 == 0) {
                    if (i % 15 != 0) {
                        totalFlaggedItem++;
                        flaggedSerialSum += i;
                    }

                    else {
                        continue;
                    }
                }
            }

            System.out.println("Flagged Count: " + totalFlaggedItem);
            System.out.println("Flagged Serial Sum: " + flaggedSerialSum);

        }

        else {
            System.out.println("Invalid Range");
        }

        sc.close();

    }
}
