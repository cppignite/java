package sorting;

import sorting.insertion.InsertionSort;
import java.util.ArrayList;
public class Driver
{
  public static void main(String[] args)
  {
    ArrayList<Integer> a = new ArrayList<Integer>(10);
    System.out.println("The current list of numbers is: ");
    for (int i = 0; i < a.size(); i++)
    {
      a.add((int)(Math.random()*100));
      System.out.print(a.get(i) + " ");
    }
    System.out.println();

    InsertionSort.sort(a);

    System.out.println("The sorted list of numbers is: ");
    for (int i = 0; i < a.size(); i++)
    {
      System.out.print(a.get(i) + " ");
    }
    System.out.println();
  }
}
