package sorting;

import sorting.insertion.InsertionSort;
import java.util.ArrayList;
import java.util.Iterator;

public class Driver
{
  public static void main(String[] args)
  {
    ArrayList<Integer> a = createRandArray(10);    

    ArrayList<Command> sortingAlg = new ArrayList<Command>();
    sortingAlg.add(new InsertionSort());

    sortAll(sortingAlg, a);
  }

  public static void sortAll(ArrayList<Command> sortingAlg, ArrayList<Integer> a)
  {
    for (Iterator it = sortingAlg.iterator(); it.hasNext();)
    {
      ArrayList<Integer> b = copyArray(a);
      long startTime = System.nanoTime();
      ((Command)it.next()).execute(b);
      long endTime = System.nanoTime();

      System.out.println("The sorted list of numbers is: ");
      printArray(b);
      System.out.println("\nIt took " + (endTime - startTime)/1000000.0 
                       + " milliseconds");
    }
  }
  /**
   * Copies the array into another array. This is used to preserve the original
   * random order of the input array since some sorting algorithms sort 
   * in-place
   * 
   * @param a input array
   * @return b same output array
   **/
  public static ArrayList<Integer> copyArray(ArrayList<Integer> a)
  {
    ArrayList<Integer> b = new ArrayList<Integer>(a.size());
    for (int i = 0; i < a.size(); i++)
    {
      b.add(a.get(i));
    }
    return b;
  }
  
  /**
   * Takes in the number of elements and generates an array of integers
   * that can randomly take values from 0 to 100.
   *
   * @param size The number of desired elements
   * @return a A random arraylist of integers from 0 to 100
   **/
  public static ArrayList<Integer> createRandArray(int size)
  {
    ArrayList<Integer> a = new ArrayList<Integer>(size);
    System.out.println("The current list of numbers is: ");
    for (int i = 0; i < size; i++)
    {
      a.add((int)(Math.random()*100));
      System.out.print(a.get(i) + " ");
    }
    System.out.println();
    
    return a;
  }

  /**
   * Prints the array
   *
   * @param a The arraylist to print
   **/
  public static void printArray(ArrayList<Integer> a)
  {
    for (int i = 0; i < a.size(); i++)
    {
      System.out.print(a.get(i) + " ");
    }
    System.out.println();
  }
}
