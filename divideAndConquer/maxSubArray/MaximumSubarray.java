package divideAndConquer.maxSubArray;

import java.util.ArrayList;
public class MaximumSubarray
{
  // This tuple class is designed to allow us to return three items 
  public class Tuple
  {
    int low, high, sum;
    public Tuple(int low, int high, int sum) 
    {
      this.low = low;
      this.high = high;
      this.sum = sum;
    }
    public String toString()
    {
      return ("The max sum is " + sum + ", starting from " + low + " to " + high);
    }
  }

  /**
   * The idea is that when we cut an array in half, the maximum subarray can be
   * found in either entirely in the left subarray, entirely in the right
   * subarray, or entirely in the middle, a bit from the left and right
   * subarrays.
   *
   * If the max subarray is located entirely in either the left or right
   * subarrays, that can be found easily because that is just a smaller
   * instance of the main problem.
   *
   **/
  public Tuple findMaxSubarray(ArrayList<Integer> a, int low, int high)
  {
    int mid = 0;
    if(high == low) // base case: only one element
      return (new Tuple(low, high, a.get(low)));
    else
    {
      mid = (int)((low + high)/2.0);
      Tuple leftT = findMaxSubarray(a, low, mid);
      Tuple rightT = findMaxSubarray(a, mid+1, high);
      Tuple crossT = findMaxCrossingSubarray(a, low, mid, high);
      if(leftT.sum >= rightT.sum && leftT.sum >= crossT.sum)
      {
        //System.out.println("The leftT sum is " + leftT.sum);
        return (new Tuple(leftT.low, leftT.high, leftT.sum));
      }
      else if( rightT.sum >= leftT.sum && rightT.sum >= crossT.sum)
        return (new Tuple(rightT.low, rightT.high, rightT.sum));
      else
        return (new Tuple(crossT.low, crossT.high, crossT.sum));
    }
  }

  /**
   * Finding the max crossing subarray is the "combine" part in the divide
   * and conquer paradigm because what we are doing is that we are combining
   * the left and right subarrays and returning the sum.
   *
   * This subroutine works in \Theta(n) time becuase we are just going through 
   * all the elements of the input array once. The reason this is so is because
   * each step iteration of the for loop takes \Theta(n) time, so we just need
   * to count up the amount of iterations altogether. The first for loop takes
   * (mid - low + 1) iterations and the second for loop takes high-low 
   * iterations. Thus (mid - low + 1) + (high - mid) = high - low + 1 = n
   *
   * @param a - the arraylist of integers we are trying to find the max subarr
   * @param low - the index of the first element
   * @param mid - the index of the cut between the left nad right subarray
   * @param high - the index of the last element we are looking at
   *
   * @return tuple of max subarray sum with low index and high index 
   **/
  public Tuple findMaxCrossingSubarray(ArrayList<Integer> a, 
      int low, int mid, int high)
  {
    // Find the maximum subarray of the left half A[low..mid]
    int leftSum = Integer.MIN_VALUE; // Hold the greatest sum so far
    int maxLeft = 0;
    int sum = 0;

    // Start from mid and work down to low so that we consider every subarray
    for(int i = mid; i >= low; i--)
    {
      sum = sum + a.get(i);
      //System.out.println("adding " + a.get(i) + ", our sum is " + sum);
      if(sum > leftSum) // Update the sum if we found a greater sum
      {
        leftSum = sum;
        maxLeft = i; // record the max index
      }
    }

    // WLOG, works the same as the Left side
    int rightSum = Integer.MIN_VALUE;
    int maxRight = 0;
    sum = 0;
    for(int j = mid + 1; j <= high; j++)
    {
      sum = sum + a.get(j);
      //System.out.println("adding " + a.get(j) + ", our sum is " + sum);
      if(sum > rightSum)
      {
        rightSum = sum;
        maxRight = j;
      }
    }

    // Checking so we don't accidentally add Integer.MIN_VALUE to our sum
    int total = 0;
    if (rightSum == Integer.MIN_VALUE && leftSum == Integer.MIN_VALUE)
      total = 0;
    else if( rightSum == Integer.MIN_VALUE)
      total += leftSum;
    else if (leftSum == Integer.MIN_VALUE)
      total += rightSum;
    else
      total = leftSum + rightSum;

    return (new Tuple(maxLeft, maxRight,total)); 
  }
}
