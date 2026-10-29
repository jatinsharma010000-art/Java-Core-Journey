// problem ; turn any second into it's standard time format

import java.util.Scanner;

public class StandardTimeFormat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Write any number in second: ");
        int totalSecond = sc.nextInt();

        int hour = totalSecond / (60 * 60);
        int minute = (totalSecond % (60 * 60)) / 60;
        int second = totalSecond % 60;

        System.out.print(hour + " hours " + minute + " minutes " + second + " seconds");

        sc.close(); // prevent the data from being leaked ..

    }

}
