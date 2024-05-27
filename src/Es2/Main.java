package Es2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            double kmTravelled = 0;
            double lConsumed = 0;

            while (true) {
                try {
                    System.out.println("Enter the number of km travelled (enter 0 to exit):");
                    kmTravelled = scanner.nextDouble();
                    if (kmTravelled == 0) {
                        System.out.println("Exiting...");
                        scanner.close();
                        return;
                    }
                    if (kmTravelled <= 0) {
                        System.out.println("The number of km traveled must be greater than zero. Try again.");
                        continue;
                    }
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Enter a number.");
                }
            }

            while (true) {
                try {
                    System.out.println("Enter the number of liters consumed (enter 0 to exit):");
                    lConsumed = scanner.nextDouble();
                    if (lConsumed == 0) {
                        System.out.println("You have press 0");
                        System.out.println("App closing");
                        scanner.close();
                        return;
                    }
                    if (lConsumed < 0) {
                        System.out.println("The number of liters consumed must be greater than zero. Try again.");
                        continue;
                    }
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Enter a number.");
                }
            }

            double kmXLitro = calculateKmXL(kmTravelled, lConsumed);
            double litersX100Km = calculateLX100Km(kmTravelled, lConsumed);
            System.out.println(kmTravelled + " Km " + lConsumed + " L");
            System.out.println(kmXLitro + " Km/l");
            System.out.println(litersX100Km + " L/100km");
        }
    }

    public static double calculateKmXL(double kmTravelled, double lConsumed) {
        if (lConsumed == 0) {
            System.out.println("Impossible to divide by zero!!");
        }
        return kmTravelled / lConsumed;
    }

    public static double calculateLX100Km(double kmTravelled, double lConsumed) {
        if (kmTravelled == 0) {
            System.out.println("Impossible to divide by zero!!");
        }
        return (lConsumed / kmTravelled) * 100;
    }
}
