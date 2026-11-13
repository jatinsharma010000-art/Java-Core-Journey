// Problem : Building digital clock & moving it's seconds to one step forward.

import java.util.Scanner;

public class DigitalClock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Hours: ");
        int hours = sc.nextInt();

        System.out.print("Minutes: ");
        int minutes = sc.nextInt();

        System.out.print("Seconds: ");
        int seconds = sc.nextInt();

        if (hours < 0 || hours > 23 || minutes < 0 || minutes > 59 || seconds < 0 || seconds > 59) {
            System.out.println("Invalid Clock Time!");
        }

        else {

            seconds++;

            if (seconds == 60) {
                seconds = 0;
                minutes++;
            }

            if (minutes == 60) {
                minutes = 0;
                hours++;

            }

            if (hours == 24) {
                hours = 0;
            }

            System.out.println(hours + " : " + minutes + " : " + seconds);

        }

        sc.close();

    }
}
