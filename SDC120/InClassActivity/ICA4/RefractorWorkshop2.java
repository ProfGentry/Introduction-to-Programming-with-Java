import java.util.Scanner;

/**
 * In-Class Refactor Workshop
 * Goal: Refactor into methods WITHOUT changing behavior/output.
 * Suggestions:
 * - Extract a method to readIntInRange(...)
 * - Extract methods for each action
 * - Reduce repeated "try/catch" blocks
 */
public class RefactorWorkshop2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Study Session Planner ===");
        System.out.println("This tool builds a simple plan based on time and focus level.");

        boolean running = true;
        while (running) {

            System.out.println();
            System.out.println("1) Build a plan");
            System.out.println("2) Exit");
            System.out.print("Choose: ");

            String rawChoice = sc.nextLine().trim();
            int choice;

            try {
                choice = Integer.parseInt(rawChoice);
            } catch (NumberFormatException e) {
                System.out.println("Please enter 1 or 2.");
                continue;
            }

            if (choice == 2) {
                System.out.println("Good luck. Drink water.");
                running = false;
                continue;
            }

            if (choice != 1) {
                System.out.println("Please enter 1 or 2.");
                continue;
            }

            System.out.print("Minutes available (15-180): ");
            String rawMinutes = sc.nextLine().trim();
            int minutes;

            try {
                minutes = Integer.parseInt(rawMinutes);
            } catch (NumberFormatException e) {
                System.out.println("Minutes must be a whole number.");
                continue;
            }

            if (minutes < 15 || minutes > 180) {
                System.out.println("Minutes must be between 15 and 180.");
                continue;
            }

            System.out.print("Focus level (1-5): ");
            String rawFocus = sc.nextLine().trim();
            int focus;

            try {
                focus = Integer.parseInt(rawFocus);
            } catch (NumberFormatException e) {
                System.out.println("Focus must be a whole number.");
                continue;
            }

            if (focus < 1 || focus > 5) {
                System.out.println("Focus must be between 1 and 5.");
                continue;
            }

            // Build plan (intentionally verbose / refactorable)
            int breakMinutes;
            if (focus <= 2) {
                breakMinutes = 10;
            } else if (focus <= 4) {
                breakMinutes = 7;
            } else {
                breakMinutes = 5;
            }

            int workBlock = 25;
            if (minutes < 45) {
                workBlock = 15;
            } else if (minutes > 120) {
                workBlock = 30;
            }

            System.out.println();
            System.out.println("=== Your Plan ===");
            System.out.println("Work blocks: " + workBlock + " minutes");
            System.out.println("Breaks: " + breakMinutes + " minutes");
            System.out.println("Tip: Put phone in another room.");

            int cycles = minutes / (workBlock + breakMinutes);
            if (cycles < 1) cycles = 1;
            System.out.println("Estimated cycles: " + cycles);

            System.out.println("Plan created.\n");
        }

        sc.close();
    }
}
