import java.util.Scanner;

public class RectangleInfo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double width = 0.0;
        double height = 0.0;
        String trash = "";

        boolean done = false;
        do {
            System.out.println("Enter the width of the rectangle: ");
            if (in.hasNextDouble()) {
                width = in.nextDouble();
                if (width > 0) {
                    done = true;
                } else {
                    System.out.println("Width must be greater than 0.");
                }
            } else {
                trash = in.nextLine();
                System.out.println("You must enter a numeric, not: " + trash);
            }
        } while (!done);

        done = false;
        do {
            System.out.println("Enter the height of the rectangle: ");
            if (in.hasNextDouble()) {
                height = in.nextDouble();
                if (height > 0) {
                    done = true;
                } else {
                    System.out.println("Height must be greater than 0.");
                }
            } else {
                trash = in.nextLine();
                System.out.println("You must enter a numeric, not: " + trash);
            }
        } while (!done);

        double area = width * height;
        double perimeter = 2 * area;
        double diagonal = Math.sqrt(width * width + height * height);

        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Diagonal: " + diagonal);
    }
}

