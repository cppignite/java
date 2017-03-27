package sorting.merge;

import java.util.ArrayList;
public class Merge
{
  public Arraylist<Integer> sort(ArrayList<Integer> a)
  {
    return a;
  }

  /**
   * The merge subroutine takes in two sorted subarrays and combines them into
   * a single sorted subarray.
   *
   * The running time of this subroutine is O(n) because all we are doing is 
   * comparing the smallest value from the two subarrays until we run out
   * of elements, or n times. 
   *
   * @param a An array such that a[p..q] and a[q+1..r] are in sorted order
   * @param p,q,r Integers such that p<q<r
   * @return A sorted single subarray.
   **/
  public ArrayList<Integer> merge(ArrayList<Integer> a, int p, int q, int r)
  {
    // The amount of cards in the left and right subarray
    int leftNum = q - p - 1;
    int rightNum = r - q;
    
    // New left and right subarrays
    ArrayList<Integer> leftArr = new ArrayList<Integer>(leftNum+1);
    ArrayList<Integer> rightArr = new ArrayList<Integer>(rightNum+1);

    // Fill subarrays with values from the input array
    for (int i = 0; i < leftNum; i++)
    {
      leftArr.add(a.get(p+i));
    }
    for (int i = 0; i < rightNum; i++)
    {
      rightArr.add(a.get(q+i+1));
    }

    // Add sentinel value to simplify code
    leftArr.add(Integer.MAX_VALUE);
    rightArr.add(Integer.MAX_VALUE);

    // Counters for left and right subarrays
    int i = 0;
    int j = 0

    for (int k=p; k < r; k++)
    {
      if (leftArr.get(i) <= rightArr.get(j))
      {
        a.set(k, leftArr.get(i));
        i++;
      }
      else
      {
        a.set(k, rightArr.get(j));
        j++;
      }
    }
    return a;
  }
}
