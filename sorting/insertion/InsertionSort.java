package sorting.insertion;

import sorting.Command;
import java.util.ArrayList;

public class InsertionSort implements Command
{
  /**
  * This algorithm sorts an arraylist of integers into increasing order.
  * The Insertion Sort is efficient in sorting a small number of elements and
  * it is also efficient when used in a set that is almost already sorted.
  *
  * Running Time analysis: 
  *   T(n) = (c1)n + (c2)(n-1) + (c3)(n-1) + (c4)(n(n+1)/2-1) + (c5)(n(n-1)/2)
  *          + (c6)(n(n-1)/2 + (c7)(n-1)
  *        = ((c4 + c5 + c6)/2)n^2 + (c1 + c2 + c3 + c4/2 - c5/2 - c6/2 + c8)n
  *          - (c2 + c3 + c4 + c7)
  *        = an^2 + bn + c
  *        = O(n^2)
  *
  * @param a A sequence of n numbers <a1, a2, ..., an>
  * @return ArrayList<Integer> A sequence of n numbers <a1', a2', ..., an'> such
  *                            that a1' <= a2' <= ... <= an'
  **/

  public static ArrayList<Integer> sort(ArrayList<Integer> a)
  {
    for (int j = 1; j < a.size(); j++)     // c1 * n steps
    {
      int key = a.get(j);                  // c2 * (n-1) steps
      // Insert key into the sorted sequence A[1...j-1]
      int i = j - 1;                       // c3  * (n-1) steps
      while ((i > -1) && (a.get(i) > key)) // c4 * (n(n+1)/2-1) steps
      {
        a.set(i+1, a.get(i));              // c5 * (n(n-1)/2) steps
        i = i - 1;                         // c6 * (n(n-1)/2) steps
      }
      a.set(i+1, key);                     // c7 * (n-1) steps
    }
    return a;
  }

  public ArrayList<Integer> execute(ArrayList<Integer> a)
  {
    return sort(a);
  }
}
