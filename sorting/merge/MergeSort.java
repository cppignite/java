package sorting.merge;

import sorting.Command;
import java.util.ArrayList;
public class MergeSort implements Command
{
  public ArrayList<Integer> execute(ArrayList<Integer> a)
  {
    mergeSort(a, 0, a.size()-1);
    return a;
  }

  public void mergeSort(ArrayList<Integer> a, int p, int r)
  {
    if (p<r)
    {
      int q = (int)(p+r)/2;
      mergeSort(a, p, q);
      mergeSort(a, q+1, r);
      merge(a, p, q, r);
    }
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
   **/
  public void merge(ArrayList<Integer> a, int p, int q, int r)
  {
    int leftNum = q - p + 1; // Computes the length of the left subarray A[p..q]
    int rightNum = r - q; // Computes the length of the right subarray A[q+1..r]
    
    // New left and right subarrays
    ArrayList<Integer> leftArr = new ArrayList<Integer>(leftNum);
    ArrayList<Integer> rightArr = new ArrayList<Integer>(rightNum);

    // Copies the subarray A[p..q] into leftArr[0..leftArr-1] 
    for (int i = 0; i < leftNum; i++)
    {
      leftArr.add(a.get(p+i));
    }

    // Copies the subarray A[q+1..r] into the rightArr[0..rightArr-1]
    for (int j = 0; j < rightNum; j++)
    {
      rightArr.add(a.get(q+j+1));
    }

    // var i is the counter for the left subarray
    // var j is the counter for the right subarray
    // var k is the counter for the single whole subarray
    for (int i=0, j=0, k = p; k <= r; k++)
    {
      if (i+p>q)
      {
        a.set(k, rightArr.get(j++));
      }
      else if (j+q >= r)
      {
        a.set(k, leftArr.get(i++));
      }
      else if (leftArr.get(i) <= rightArr.get(j))
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
  }
}
