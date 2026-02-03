public class PredictTheOutput1 {

    public static void main(String[] args) {

        int age = 17;
        boolean hasID = true;

        if (age >= 18 && hasID) {
            System.out.println("Access granted");
        } else if (age >= 18 || hasID) {
            System.out.println("Partial access");
        } else {
            System.out.println("Access denied");
        }

        System.out.println("End of program");
    }
}
