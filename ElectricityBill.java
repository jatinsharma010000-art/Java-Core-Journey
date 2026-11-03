// Problem : calculate the Electricity charges , adding surcharges or discount based on commercial or Domestic .. 

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("write down the total Energy Used: ");
        int electricityUnit = sc.nextInt();

        System.out.print("is it commercial? : ");
        boolean isCommercial = sc.nextBoolean();

        // Base Energy Charges ..

        double baseEnergycharge;

        if (electricityUnit <= 100) {

            baseEnergycharge = electricityUnit * 4;
            System.out.println("The base energy Charge is: " + baseEnergycharge);
        }

        else if (electricityUnit > 100 && electricityUnit <= 200) {

            baseEnergycharge = (electricityUnit - 100) * 6 + 400;
            System.out.println("The base energy Charge is: " + baseEnergycharge);
        }

        else if (electricityUnit > 200 && electricityUnit <= 300) {

            baseEnergycharge = ((electricityUnit - 200) * 8) + 1000;
            System.out.println("The base energy Charge is: " + baseEnergycharge);
        }

        else {

            baseEnergycharge = ((electricityUnit - 300) * 10) + 1800;
            System.out.println("The base energy Charge is: " + baseEnergycharge);
        }

        // Surcharge & Discount Rules:

        if (isCommercial == true) {
            double surCharge = baseEnergycharge * 20 / 100;
            System.out.println("Surcharge Applied [+20%]: " + surCharge);
            baseEnergycharge += surCharge;
        }

        else {

            if (baseEnergycharge < 500) {

                double subsidy = baseEnergycharge * 10 / 100;
                System.out.println("subsidy discount Applied [-10%]: " + subsidy);
                baseEnergycharge -= subsidy;

            }

            else {
                System.out.println("No subsidy discount");
            }
        }

        System.out.println("the final charges is: " + baseEnergycharge);

        sc.close();

    }
}
