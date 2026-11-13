// Problem : take two input ( x & y ) & find out on which quardrant Or axis it will fall ..

import java.util.Scanner;

public class QuadrantnAxisLocator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("write the X axis: ");
        int x = sc.nextInt();

        System.out.print("write the Y axis: ");
        int y = sc.nextInt();

        if (x == 0 && y == 0) {
            System.out.println("Point lies at the Origin (0,0)");
        }

        else if (x == 0 && y != 0) {
            System.out.println("Point lies on the Y-Axis");
        }

        else if (y == 0 && x != 0) {
            System.out.println("Point lies on the X-Axis");
        }

        else if (x > 0 && y > 0) {
            System.out.println("Quadrant 1");
        }

        else if (x < 0 && y > 0) {
            System.out.println("Quadrant 2");
        }

        else if (x < 0 && y < 0) {
            System.out.println("Quadrant 3");
        }

        else if (x > 0 && y < 0) {
            System.out.println("Quadrant 4");
        }

        sc.close();

    }
}
