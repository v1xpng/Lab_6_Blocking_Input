import java.util.Random;
import java.util.Scanner;

public class HighorLow {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        int randomNumber = rand.nextInt(10) + 1; // exclusive 1-10
        int guess = 0;
        String trash = "";

        do {
            System.out.println("Guess a number between 1 and 10: ");
            if (in.hasNextInt()) {
                guess = in.nextInt();
                if (guess < 1 || guess > 10) {
                    System.out.println("Your guess must be between 1 and 10.");
                }
            } else {
                System.out.println("That is not a valid numeric. Try again.");
                in.nextLine();
            }
        } while (guess < 1 || guess > 10);

        System.out.println("The number was: " + randomNumber);

        if (guess < randomNumber) {
            System.out.println("Your guess was too low.");
        } else if (guess > randomNumber) {
            System.out.println("Your guess was too high.");
        } else {
            System.out.println("Your guess was right on the money!");
        }
    }
}


