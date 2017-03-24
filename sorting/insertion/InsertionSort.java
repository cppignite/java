package sorting.insertion;

import java.util.ArrayList;

public class InsertionSort
{
  /**
  * This algorithm sorts an arraylist of integers into increasing order
  *
  * @param a A sequence of n numbers <a1, a2, ..., an>
  * @return ArrayList<Integer> A sequence of n numbers <a1', a2', ..., an'> such
  *                            that a1' <= a2' <= ... <= an'
  **/

  public static void sort(ArrayList<Integer> a)
  {
    for (int j = 1; j < a.size(); j++)
    {
      int key = a.get(j);
      // Insert key into the sorted sequence A[1...j-1]
      int i = j - 1;
      while ((i > -1) && (a.get(i) > key))
      {
        a.set(i+1, a.get(i));
        i = i - 1;
      }
      a.set(i+1, key);
    }
  }
}
