import java.util.ArrayList;
public class Driver
{
  public static void main(String[] args)
  {
    StrassenMatrixMult s = new StrassenMatrixMult();

    int size = 2;
    ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();
    ArrayList<ArrayList<Integer>> b = new ArrayList<ArrayList<Integer>>();

    // populate the matrices with random variables
    for(int i = 0; i < size; i++)
    {
      a.add(new ArrayList<Integer>());
      b.add(new ArrayList<Integer>());
      for(int j = 0; j < size; j++)
      {
        //Generates an integer from 1-100
        (a.get(i)).add((int)Math.ceil(Math.random()*100));
        (b.get(i)).add((int)Math.ceil(Math.random()*100));
      }
    }

    // Print matrices
    System.out.println("Matrix a is:");
    s.printMatrix(a);
    System.out.println("\nMatrix b is:");
    s.printMatrix(b);

    ArrayList<ArrayList<Integer>> c = s.squareMatrixMultiply(a,b);
    System.out.println("\nMatric c is:");
    s.printMatrix(c);
  }
}
