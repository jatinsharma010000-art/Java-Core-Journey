// Problem : How many complete 24-hour days will pass before the train arrives
// What the exact hour on the 24-hour clock (0 to 23) will be when the train arrives.

import java.util.Scanner;

public class TrainCircularClock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("what is the current hour on station: ");
        int currentHour = sc.nextInt();

        System.out.print("how many hours are still left for the train arrival : ");
        int trainTimeLeft = sc.nextInt();

        int numberOfDays = trainTimeLeft / 24;
        int trainArrivalTime = ((currentHour + trainTimeLeft) % 24);


        System.out.println("Numbers of days train will take for it's arrival is: " + numberOfDays);
        System.out.println("The exact hour will be: " + trainArrivalTime);

        sc.close(); // prevent the data from being leaked ..

    }
}
