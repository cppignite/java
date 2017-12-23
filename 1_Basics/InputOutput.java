//Import scanner tool
import java.util.Scanner;

public class InputOutput
{
  public static void main(String[] args)
  {
    //Create a scanner object
	Scanner scanner = new Scanner(System.in);
	
	//Ask user for input
	System.out.print("Please input a text: ");
	//Create a string called text which will store user input
	//Up until user presses enter
	String text = scanner.nextLine();
	
	//Print text
	System.out.println(text);
  }
}
