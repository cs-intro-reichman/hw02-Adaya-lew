import java.util.Random;
/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		int T = Integer.parseInt(args[0]);
		// Initailizes a random numbers generator with the given seed value
        Random generator = new Random();
        int counter2 = 0; 
        int counter3 = 0;
        int counter4OrMore = 0;
        double totalChildren = 0;
        for(int i = 0; i < T; i++){
        	boolean boy = false; // Indicator if a boy was born already
			boolean girl = false; // Indicator if a girl was born already
			int count = 0; // Children counter
			double rnd = 0;
			while (!girl || !boy){
				rnd = generator.nextDouble();
				count++;
				if(rnd < 0.5){
					girl = true;
				}
				else{
					boy = true;
				}
			} // Increases the specific counter according to the experiment result
			if(count == 2) counter2++;
			if(count == 3) counter3++;
			if(count >= 4) counter4OrMore++;
			totalChildren = totalChildren + count;
        }
        double average = totalChildren / T;
        System.out.println("Average: " + average + " children to get at least one of each gender.");
        System.out.println("Number of famiilies with 2 children: " + counter2);
        System.out.println("Number of famiilies with 3 children: " + counter3);
        System.out.println("Number of famiilies with 4 or more children: " + counter4OrMore);
        if((counter2 > counter3) && (counter2 > counter4OrMore))
        	System.out.println("The most common number of children is 2.");
        if((counter3 > counter2) && (counter3 > counter4OrMore))
        	System.out.println("The most common number of children is 3.");
        if((counter4OrMore > counter3) && (counter4OrMore > counter2))
        	System.out.println("The most common number of children is 4 or more.");
	}
}
