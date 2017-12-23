//Import scanner
import java.util.Scanner;

public class Square
{
  public static void main(String[] args)
  {
	//Create scanner object
	Scanner scanner = new Scanner(System.in);
	
	//Ask user for square size
    System.out.print("Size of square: ");
	int side = scanner.nextInt();
	
	//Calculate area and perimeter
	int area = side * side;
	int perimeter = side * 4;
	
	//Print text
	System.out.println("Area: " + area);
	System.out.println("Perimeter: " + perimeter);
	
  }
}
