//Import scanner tool
import java.util.Scanner;

public class InputOutput2
{
  public static void main(String[] args)
  {
    //Create a scanner object
	Scanner scanner = new Scanner(System.in);
	
	//Ask user for input
	System.out.print("Please input a character: ");
	//A string type can store anything that user inputs
	//But if you try to store a character into a integer...
	int integer = scanner.nextInt();
	
	//Print text
	System.out.println(integer);
	
  }
}
