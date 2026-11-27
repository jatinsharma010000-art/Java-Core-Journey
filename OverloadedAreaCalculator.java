// Problem : Area calculator for circle , Rectangle & triangle ..

import java.util.Scanner;

public class OverloadedAreaCalculator {

    public static double calculateArea(double radius) {
        double areaOfCircle = Math.PI * (radius * radius);
        return areaOfCircle;
    }

    public static double calculateArea(double length, double width) {
        double areaOfRectangle = length * width;
        return areaOfRectangle;
    }

    public static double calculateArea(double base, double height, boolean isTriangle) {
        double areaOfTriangle = 0.5 * (base * height);

        System.out.println("is this a trainagle ? " + isTriangle);
        return areaOfTriangle;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("choose the shape ( 1 = Circle, 2 = Rectangle, 3 = Triangle ) : ");
        int whichShape = sc.nextInt();

        switch (whichShape) {
            case 1:

                System.out.print("Radius: ");
                double Radius = sc.nextDouble();

                while (Radius <= 0) {
                    System.out.println("Invalid Input: Try again");

                    System.out.print("Radius: ");
                    Radius = sc.nextDouble();

                }

                System.out.print("Area of circle : " + calculateArea(Radius));
                break;

            case 2:

                System.out.print("length: ");
                double length =  sc.nextDouble();

                System.out.print("Width: ");
                double Width =  sc.nextDouble();

                while (length <= 0 || Width <= 0) {
                    System.out.println("Invalid Input: Try again");

                    System.out.print("length: ");
                    length =  sc.nextDouble();

                    System.out.print("Width: ");
                    Width =  sc.nextDouble();

                }

                System.out.print("Area of Rectangle : " + calculateArea(length, Width));
                break;

            case 3:

                System.out.print("Base: ");
                double Base = sc.nextDouble();

                System.out.print("Height: ");
                double Height =  sc.nextDouble();

                while (Base <= 0 || Height <= 0) {
                    System.out.println("Invalid Input: Try again");

                    System.out.print("Base: ");
                    Base =  sc.nextDouble();

                    System.out.print("Height: ");
                    Height =  sc.nextDouble();

                }

                System.out.print("Area of triangle is : " + calculateArea(Base, Height, false));
                break;

            default:

                System.out.print("invalid Input");
                break;

        }

        sc.close();
    }

}
