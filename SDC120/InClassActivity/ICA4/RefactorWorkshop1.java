import java.util.Scanner;

/**
 * In-Class Refactor Workshop
 * Goal: Refactor this program into smaller methods WITHOUT changing behavior/output.
 * Suggestions:
 * - Extract printMenu()
 * - Extract readChoice(...)
 * - Extract handleChoice(...)
 * - Keep main() short
 */
public class RefactorWorkshop1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Quick Utility Console ===");

        boolean running = true;
        while (running) {

            System.out.println();
            System.out.println("1) Show greeting");
            System.out.println("2) Convert inches to centimeters");
            System.out.println("3) Calculate simple total with tax");
            System.out.println("4) Exit");

            System.out.print("Choose an option: ");
            String raw = sc.nextLine();

            int choice;
            try {
                choice = Integer.parseInt(raw.trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Enter a number.");
                continue;
            }

            if (choice == 1) {
                System.out.print("Enter your name: ");
                String name = sc.nextLine();
                if (name.trim().isEmpty()) {
                    System.out.println("Hello, mysterious stranger.");
                } else {
                    System.out.println("Hello, " + name.trim() + "!");
                }

            } else if (choice == 2) {
                System.out.print("Enter inches: ");
                String inchesRaw = sc.nextLine();
                try {
                    double inches = Double.parseDouble(inchesRaw.trim());
                    double cm = inches * 2.54;
                    System.out.println(inches + " inches = " + cm + " cm");
                } catch (NumberFormatException e) {
                    System.out.println("Invalid number.");
                }

            } else if (choice == 3) {
                System.out.print("Enter subtotal: ");
                String subtotalRaw = sc.nextLine();
                try {
                    double subtotal = Double.parseDouble(subtotalRaw.trim());
                    double taxRate = 0.07;
                    double total = subtotal + (subtotal * taxRate);
                    System.out.println("Subtotal: " + subtotal);
                    System.out.println("Tax (7%): " + (subtotal * taxRate));
                    System.out.println("Total: " + total);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid number.");
                }

            } else if (choice == 4) {
                System.out.println("Exiting. Have a nice day.");
                running = false;

            } else {
                System.out.println("Choice must be 1-4.");
            }
        }

        sc.close();
    }
}
