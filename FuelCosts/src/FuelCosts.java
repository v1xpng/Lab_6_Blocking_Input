import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double gallons = 0.0;
        double efficientFuel = 0.0;
        double gasPrice = 0.0;
        String trash = "";

        boolean done = false;
        do {
            System.out.println("Enter the number of gallons of gas in your tank: ");
            if (in.hasNextDouble()) {
                gallons = in.nextDouble();
                if (gallons > 0) {
                    done = true;
                } else {
                    System.out.println("Please enter a numeric greater than 0.");
                }
            } else {
                trash = in.nextLine();
                System.out.println(trash + "is not a valid input. Please try again.");
            }
        } while (!done);

        done = false;
        do {
            System.out.println("Enter your vehicles fuel efficiency (mpg): ");
            if (in.hasNextDouble()) {
                efficientFuel = in.nextDouble();
                if (efficientFuel > 0) {
                    done = true;
                } else {
                    System.out.println("Please enter a numeric greater than 0.");
                }
            } else {
                trash = in.nextLine();
                System.out.println(trash + "is not a valid input. Please try again.");
            }
        } while (!done);

        done = false;
        do {
            System.out.println("Enter the price of gas per gallon: ");
            if (in.hasNextDouble()) {
                gasPrice = in.nextDouble();
                if (gasPrice > 0) {
                    done = true;
                } else {
                    System.out.println("Please enter a numeric greater than 0.");
                }
            } else {
                trash = in.nextLine();
                System.out.println(trash + "is not a valid input. Please try again.");
            }
        } while (!done);

        double milescost100 = (100.0 / efficientFuel) * gasPrice;
        double fulldistanceTank = gallons * efficientFuel;

        System.out.println("How much it costs to drive 100 miles: " + milescost100);
        System.out.println("How many miles the vehicle can drive with a full tank: " + fulldistanceTank);
    }
}

