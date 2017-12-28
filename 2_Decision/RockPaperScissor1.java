//Import scanner object
import java.util.Scanner;

public class RockPaperScissor1 {

	public static void main(String[] args){

		//Create scanner object
		Scanner scanner = new Scanner(System.in);
		String input1 = "";
		String input2 = "";
		
		
		System.out.println("Welcome to Rock/Paper/Scissor! \n");
		System.out.println("Possible inputs: rock, paper, scissors, and quit");
		
		/*Continue playing the game as long as input does not equal quit
		 * The "equalsIgnoreCase" method will compare string values without
		 * considering case sensitivity 
		 * Use && (double ampersand) for "and" comparison and || (double pipe) for "or" comparison
		 */
		while((!input1.equalsIgnoreCase("quit")) && (!input2.equalsIgnoreCase("quit"))){
			//Get player input
			System.out.print("Input command 1: ");
			input1 = scanner.nextLine();
			System.out.print("Input command 2: ");
			input2 = scanner.nextLine();
			
			//Check to see if either input is the quit command
			if (input1.equalsIgnoreCase("quit") || input2.equalsIgnoreCase("quit")){
				System.out.println("Thanks for playing!");
			}
				
			/*The rest of the code is comparing input 1 to input 2
			 * Depending on who won, print the appropriate win/loss message
			 * Or an error message if one of the input is invalid
			 */
			else if (input1.equalsIgnoreCase("rock")){
				if (input2.equalsIgnoreCase("rock"))
					System.out.println("Tie!");
				else if (input2.equalsIgnoreCase("paper"))
					System.out.println("Input 2 wins!");
				else if (input2.equalsIgnoreCase("scissor"))
					System.out.println("Input 1 wins!");
				else
					System.out.println("Input 2 is invalid!");
			}
			else if (input1.equalsIgnoreCase("paper")){
				if (input2.equalsIgnoreCase("rock"))
					System.out.println("Input 1 wins!");
				else if (input2.equalsIgnoreCase("paper"))
					System.out.println("Tie!");
				else if (input2.equalsIgnoreCase("scissor"))
					System.out.println("Input 2 wins!");
				else
					System.out.println("Input 2 is invalid!");				
			}
			else if (input1.equalsIgnoreCase("scissor")){
				if (input2.equalsIgnoreCase("rock"))
					System.out.println("Input 2 wins!");
				else if (input2.equalsIgnoreCase("paper"))
					System.out.println("Input 1 wins!");
				else if (input2.equalsIgnoreCase("scissor"))
					System.out.println("Tie!");
				else
					System.out.println("Input 2 is invalid!");				
			}
			else
				System.out.println("Input 1 is invalid!");
		}
		scanner.close();
	}
}
	
	
		     