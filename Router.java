// Problem : Command Router & Fall-Through Mastery

import java.util.Scanner;

public class Router {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("write the month [ number ]: ");
        int month = sc.nextInt();

        System.out.print("the year was: ");
        int year = sc.nextInt();

        System.out.print("Server mode code : ");
        char serverModeCode = sc.next().charAt(0);

        int numberOfDays;

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:

                System.out.println("the number of days: " + (numberOfDays = 31));
                break;

            case 4:
            case 6:
            case 9:
            case 11:

                System.out.println("the number of days: " + (numberOfDays = 30));
                break;

            case 2:

                if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                    numberOfDays = 29;
                    System.out.println("days in a month: " + numberOfDays);
                }

                else {
                    numberOfDays = 28;
                    System.out.println("days in a month: " + numberOfDays);
                }
                break;

            default:
                System.out.println("invalid month numbers.");

        }

        switch (serverModeCode) {

            case 'A':
            case 'a':

                System.out.print("Server Mode: ACTIVE (Full Traffic)");
                break;

            case 'M':
            case 'm':

                System.out.print("Server Mode: MAINTENANCE (Admin Only)");
                break;

            case 'S':
            case 's':

                System.out.print("Server Mode: STANDBY (Backup Ready)");
                break;

            case 'D':
            case 'd':

                System.out.print("Server Mode: DECOMMISSIONED (Offline)");
                break;

            default:
                System.out.println("Error: Unknown Server Mode");

        }

        sc.close();

    }

}
