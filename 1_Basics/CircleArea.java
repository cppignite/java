/******************************************************************************
 * Description: Area of a circle calculator
 * Organization: IgniteCS
 * Date: December 22nd, 2017
 *
 * @author Ronald Lencevicius
 *****************************************************************************/
 
public class CircleArea 
{
   public static void main(String[] args) 
   {
      double pi = 3.14159;
      double radius = 10;
      // You can also just declare the name of the variable  
      // without setting it equal to anything to use later on
      double area;
      // A = pi * r^2
      area = pi * radius * radius;
      // Prints out the resulting value
      System.out.println(area);
   }
}
