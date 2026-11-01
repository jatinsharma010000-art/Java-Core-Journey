// Problem : find the midpoint & collinear slope check ..

import java.util.Scanner;

public class CoordinateCollinearSlope {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("x1: ");
        int x1 = sc.nextInt();

        System.out.print("y1: ");
        int y1 = sc.nextInt();

        System.out.print("x2: ");
        int x2 = sc.nextInt();

        System.out.print("y2: ");
        int y2 = sc.nextInt();

        System.out.print("x3: ");
        int x3 = sc.nextInt();

        System.out.print("y3: ");
        int y3 = sc.nextInt();

        // Midpoint of x1y1 & x2y2 ..

        double midpointX = (x1 + x2 )/ 2.0;
        double midpointY = (y1 + y2) / 2.0;

        System.out.println("the midpoint of P1 & P2 is: " + midpointX + " , " + midpointY);

        // collinear slope

        boolean isPointSloped = (y2 - y1) * (x3 - x2) == (y3 - y2) * (x2 - x1);
        System.out.println("are all the points falls on the same line: " + isPointSloped);

        sc.close(); // prevent the data from being leaked ..

    }
}
