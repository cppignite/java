package sorting;

import sorting.quick.QuickSort;
import sorting.insertion.InsertionSort;
import sorting.merge.MergeSort;
import java.util.ArrayList;
import java.util.Iterator;

public class Driver
{
  public static void main(String[] args)
  {
    // Declared an arraylist that will contain our list of random positive int
    ArrayList<Integer> a = new ArrayList<Integer>();

    // Allows the user to input a custom size for the list of numbers to sort
    if (args.length > 0)
    {
      try
      {
        a = createRandArray(Integer.parseInt(args[0]));
      }
      catch(NumberFormatException e)
      {
        System.err.println("Argument " + args[0] + " must be an integer.");
        System.exit(1);
      }
    }
    else // else create a list of 10 numbers
    {
      a = createRandArray(10);    
      System.out.println("The current list of numbers is: ");
      printArray(a);
    }

    // create a list of sorting algorithms to call
    ArrayList<Command> sortingAlg = new ArrayList<Command>();
    sortingAlg.add(new InsertionSort());
    sortingAlg.add(new MergeSort());
    // sortingAlg.add(new QuickSort());

    // use all of the sorting algorithms
    sortAll(sortingAlg, a);
  }

  public static void sortAll(ArrayList<Command> sortingAlg, ArrayList<Integer> a)
  {
    for (Iterator it = sortingAlg.iterator(); it.hasNext();)
    {
      // Copies the array because java passes by reference
      // We want to preserve the original array so we can sort it again
      ArrayList<Integer> b = copyArray(a);
      
      // Cycles through sorting algorithms
      Command sort = (Command)it.next();

      // Timer to see how quickly the sorting algorithm runs
      long startTime = System.nanoTime();
      sort.execute(b);
      long endTime = System.nanoTime();

      if (b.size() <= 10)
      {
        System.out.println("The sorted list of numbers is: ");
        printArray(b);
      }

      // Prints the how long the sorting alg runs
      System.out.println(sort + " took " + (endTime - startTime)/1000000.0 
                       + " milliseconds\n");
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
    for (int i = 0; i < size; i++)
    {
      a.add((int)(Math.random()*(size*10)));
    }
    
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
