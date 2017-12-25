/******************************************************************************
 * Description: Example of Input/Output
 * Organization: IgniteCS
 * Date: December 24th, 2017
 *
 * @author Ronald Lencevicius
 *****************************************************************************/

import java.util.Scanner;
public class ScannerExample {
   public static void main(String[] args) {
      // declare and initialize Scanner
      Scanner kb = new Scanner(System.in);
      // ask user for input
      System.out.print("Please enter your age: ");
      // declare an integer for age and receive input using Scanner's nextInt() method
      int age = kb.nextInt();
      // output age
      System.out.println("You are " + age + " years old");
      // close Scanner
      kb.close();
   }
}
