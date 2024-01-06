public class DamkaBoard {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please provide a single integer as a command-line argument.");
            return;
        }

        int n = Integer.parseInt(args[0]);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i == n-1) && (j == n-1) && (i % 2 == 0)){ //#feedback - this is not needed. It's ok to have a space at the end of the row.
                    System.out.print("*");
                }
                else if (i % 2 == 0) {
                    System.out.print("* ");
                }
                else {
                    System.out.print(" *");
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
