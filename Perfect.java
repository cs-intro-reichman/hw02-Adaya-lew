/**
 * Gets a command-line argument (int) and checks if the given number is perfect.
 */
public class Perfect {
    // Helper method to check if a number is perfect
    private static boolean isPerfect(int num) {
        return num == getDivisorsSum(num);
    }

    // Helper method to get the sum of divisors as a string
    private static String getDivisorsSumString(int num) {
        StringBuilder result = new StringBuilder("1");
        int sum = 1;

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
                result.append(" + ").append(i);
            }
        }

        return result.toString();
    }

    //get the sum of divisors
    private static int getDivisorsSum(int num) {
        int sum = 1;

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        // Check if a command-line argument is provided
        if (args.length != 1) {
            System.out.println("Please provide a single integer as a command-line argument.");
            return;
        }

        // Parse the command-line argument as an integer
        int num = Integer.parseInt(args[0]);

        // Check if the number is perfect
        if (isPerfect(num)) {
            System.out.println(num + " is a perfect number since " + num + " = " + getDivisorsSumString(num));
        } else {
            System.out.println(num + " is not a perfect number");
        }
    }
}
