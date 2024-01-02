
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		boolean boy = false; // Indicator if a boy was born already
		boolean girl = false; // Indicator if a girl was born already
		int count = 0; // Children counter
		double rnd = 0;
		while (!girl || !boy){
			rnd = Math.random();
			count++;
			if(rnd < 0.5){
				girl = true;
				System.out.print("g ");
			}
			else{
				boy = true;
				System.out.print("b ");
			}
		}
        System.out.println();
		System.out.println("You made it... and you have " + count + " children.");
	}
}
