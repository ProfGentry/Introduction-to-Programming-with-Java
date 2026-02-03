public class PredictTheOutput2 {

    public static void main(String[] args) {

        int count = 0;

        while (count < 5) {

            if (count % 2 == 0) {
                System.out.println("Even: " + count);
            }

            count++;
        }

        System.out.println("Final count: " + count);
    }
}
