/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder{
    public static void main (String args[]) {
        

        // System.out.println(); 

        int rnd1 = 0;
        int rnd2 = (int) (Math.random() * 10);
        while (rnd1 <= rnd2) {
            System.out.print(" " + rnd2);
            rnd1 = rnd2;
            rnd2 = (int) (Math.random() * 10);
        }
    }
}
		
