package sorting;

import sorting.insertion.InsertionSort;
import java.util.ArrayList;
public class Driver
{
  public static void main(String[] args)
  {
    ArrayList<Integer> a = new ArrayList<Integer>(10);
    System.out.println("The current list of numbers is: ");
    for (int i = 0; i < 10; i++)
    {
      a.add((int)(Math.random()*100));
      System.out.print(a.get(i) + " ");
    }
    System.out.println();

    long startTime = System.nanoTime();
    InsertionSort.sort(a);
    long endTime = System.nanoTime();

    System.out.println("The sorted list of numbers by Insertion Sort is: ");
    for (int i = 0; i < a.size(); i++)
    {
      System.out.print(a.get(i) + " ");
    }
    System.out.println("\nIt took " + (endTime - startTime)/1000000.0 + " milliseconds");
  }
}
