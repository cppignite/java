package divideAndConquer.maxSubArray;

import java.util.ArrayList;
import java.util.Arrays;
import divideAndConquer.maxSubArray.MaximumSubarray;
public class Driver
{
  public static void main(String[] args)
  {
    ArrayList<Integer> a = new ArrayList<Integer>(
        Arrays.asList(13, -3, -25, 20, -3, -16, -23, 18, 20, -7, 12, -5, -22, 
          15, -4, 7));
    MaximumSubarray m = new MaximumSubarray();
    System.out.println(m.findMaxSubarray(a, 0, a.size()-1));
    
  }
}
