import java.util.ArrayList;
public class StrassenMatrixMult
{
  /**
   * This method takes in two square nxn matrices and multiplies them together
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
              (c.get(i)).get(j)+(a.get(i)).get(k)*(b.get(k).get(j));
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
