/**
 * The command pattern is used because I wanted to create a general driver and 
 * decouple my driver from any specific sorting algorithm
 **/
package sorting;

import java.util.ArrayList;
public interface Command
{
  public ArrayList<Integer> execute(ArrayList<Integer> a);
}
