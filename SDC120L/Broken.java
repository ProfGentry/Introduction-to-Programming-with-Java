public class Broken {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Menu Program")
        System.out.println("1. Say Hello");
        System.out.println("2. Say Goodbye");
        System.out.println("3. Exit");

        System.out.print("Enter your choice: ");
        int choice = input.nextInt();

        while (choice != 3) {

            if (choice = 1) {
                System.out.println("Hello there!");
            }
            else if (choice == 2) {
                System.out.println("Goodbye!");
            }
            else {
                System.out.println("Invalid option");
            }

            System.out.println("1. Say Hello");
            System.out.println("2. Say Goodbye");
            System.out.println("3. Exit");

            System.out.print("Enter your choice: ");
            choice = input.nextInt();
        }

        System.out.println("Program ended. Goodbye!");
    }
}
