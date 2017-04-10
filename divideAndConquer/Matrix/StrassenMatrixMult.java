import java.util.ArrayList;
public class StrassenMatrixMult
{
  /**
  * This method takes in two square nxn matrices and multiplies them together
  * using a simple divide and conquer method
  *
  * We assume that n is an exact power of 2 so that when we divide an nxn
  * matrix into four n/2 x n/2 matrices, we are guarenteed that n/2 is an
  * integer
  *
  * Idea:
  * The idea is that we partition A, B, and C into four n/2 x n/2 matrices
  * 
  * A = (a11 a12    B = (b11 b12      C = (c11 c12
  *      a21 a22),       b21 b22),         c21 c22)
  * 
  * Which we can write as,
  * (c11 c12  = (a11 a12  * (b11 b12
  *  c21 c22)    a21 a22)    b21 b22)
  *
  * Which gives us the 4 equations:
  * c11 = a11*b11 + a12*b21
  * c12 = a11*b12 + a12*b22
  * c21 = a21*b11 + a22*b21
  * c22 = a21*b12 + a22*b22
  *
  * @param A - nxn matrix filled with numbers
  * @param B - nxn matrix filled with numbers
  * @return C - nxn matrix that's the product of two input matrices
  **/
  public ArrayList<ArrayList<Integer> squareMatrixMultipleRecursive(
      ArrayList<ArrayList<Integer>> a, ArrayList<ArrayList<Integer>> b)
  {
     // obtain the dimensions of the square matrix
    int n = a.size(); 
    ArrayList<ArrayList<Integer>> c = new ArrayList<ArrayList<Integer>>();

    // base case
    if (n == 1)
    {
      (c.add(ArrayList<Integer>));
      (a.get(1)).add((a.get(1)).get(1) + (b.get(1)).get(1));
    }
    else // partition a,b and c into the 4 equations above w/ indexes so O(1)
    {


    }

    return c;
  }
  
  /**
   * We use this in addition to our recurse matrix multiple method.
   * We are creating 12 new n/2 x n/2 matrices which would cost O(n^2)
   **/
  public ArrayList<ArrayList<Integer>> splitSubMatrix(
      ArrayList<ArrayList<Integer>> a, int rStart, int rEnd, 
      int cStart, int cEnd)
  {

  }

  /**
   * This method takes in two square nxn matrices and multiplies them together
   * with the definition method. This procedure runes in O(n^3) because each
   * loop runs n times.
   *
   * @param A - nxn matrix filled with numbers
   * @param B - nxn matrix filled with numbers
   * @return C - nxn matrix that's the product of two input matrices
   **/
  public ArrayList<ArrayList<Integer>> squareMatrixMultiply(
      ArrayList<ArrayList<Integer>> a, ArrayList<ArrayList<Integer>> b)
  {
    // obtain the dimensions of the square matrix
    int n = a.size(); 
    ArrayList<ArrayList<Integer>> c = new ArrayList<ArrayList<Integer>>();

    for(int i = 0; i < n; i++)
    {
      c.add(new ArrayList<Integer>());
      for(int j = 0; j < n; j++)
      {
        (c.get(i)).add(0);
        for(int k = 0; k < n; k++)
        {
          (c.get(i)).set(j, 
              (c.get(i)).get(j)+(a.get(i)).get(k)*(b.get(k).get(j)));
        }
      }
    }

    return c;
  }

  /**
   * Prints the matrix
   *
   * @param a - the input nxn matrix
   **/
  public void printMatrix(ArrayList<ArrayList<Integer>> a)
  {
    for(int i = 0; i < a.size(); i++)
    {
      for(int j = 0; j < a.size(); j++)
      {
        System.out.print((a.get(i)).get(j) + " " );
      }
      System.out.println();
    }
  }
}
