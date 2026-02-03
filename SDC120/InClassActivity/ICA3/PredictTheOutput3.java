public class PredictTheOutput3 {

    public static void main(String[] args) {

        int result = mystery(3);
        System.out.println("Result: " + result);
    }

    public static int mystery(int number) {

        if (number <= 1) {
            return 1;
        }

        return number + mystery(number - 1);
    }
}
