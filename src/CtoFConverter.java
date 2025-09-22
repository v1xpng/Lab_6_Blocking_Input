import java.util.Scanner;

public class CtoFConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double tempC = 0.0;
        double tempF = 0.0;
        String trash = "";

        boolean done = false;
        do {
            System.out.println("Input temperature in Celsius: ");
            if (in.hasNextDouble()) // checks if user input decimal
            {
                tempC = in.nextDouble();
                in.nextLine(); // clear buffer

                tempF = (tempC * 9.0 / 5.0) + 32;

                System.out.println(tempC + " Celsius = " + tempF + " Fahrenheit");

                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("You entered an invalid value: " + trash);
                System.out.println("Please try again...\n");
            }
        }while (!done);
    }
}

