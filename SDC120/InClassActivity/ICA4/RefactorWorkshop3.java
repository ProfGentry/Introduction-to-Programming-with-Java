import java.util.Scanner;

/**
 * In-Class Refactor Workshop
 * Goal: Refactor into methods WITHOUT changing behavior/output.
 * Suggestions:
 * - Extract calculateDiscountRate(...)
 * - Extract calculateFinalTotal(...)
 * - Extract printReceipt(...)
 * - Keep main() short and readable
 */
public class RefactorWorkshop3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Simple Checkout ===");

        System.out.print("Enter customer type (regular/student/senior): ");
        String customerType = sc.nextLine().trim().toLowerCase();

        System.out.print("Enter subtotal: ");
        String rawSubtotal = sc.nextLine().trim();

        double subtotal;
        try {
            subtotal = Double.parseDouble(rawSubtotal);
        } catch (NumberFormatException e) {
            System.out.println("Subtotal must be a number.");
            sc.close();
            return;
        }

        if (subtotal < 0) {
            System.out.println("Subtotal cannot be negative.");
            sc.close();
            return;
        }

        double discountRate = 0.0;

        if (customerType.equals("student")) {
            discountRate = 0.10;
        } else if (customerType.equals("senior")) {
            discountRate = 0.15;
        } else if (customerType.equals("regular")) {
            discountRate = 0.00;
        } else {
            // unknown type gets no discount (keep behavior)
            discountRate = 0.00;
        }

        double discount = subtotal * discountRate;
        double afterDiscount = subtotal - discount;

        double taxRate = 0.07;
        double tax = afterDiscount * taxRate;
        double total = afterDiscount + tax;

        System.out.println();
        System.out.println("=== Receipt ===");
        System.out.println("Customer type: " + customerType);
        System.out.println("Subtotal: " + subtotal);
        System.out.println("Discount rate: " + (discountRate * 100) + "%");
        System.out.println("Discount: " + discount);
        System.out.println("After discount: " + afterDiscount);
        System.out.println("Tax (7%): " + tax);
        System.out.println("TOTAL: " + total);

        sc.close();
    }
}
