import java.util.Scanner;
import java.util.*;
import java.util.function.Supplier;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    int integer;
    int numtimes;
    List<Integer> numlist = new ArrayList<Integer>();
    
    Scanner in = new Scanner(System.in);
    //System.out.print("Enter the number of times you will be entering integers: ");
    numtimes = in.nextInt();
    System.out.println();  
        
    for (int i = 0; i < numtimes; i++)
    {        
      //System.out.print("Enter an integer: ");
      integer = in.nextInt();      
      numlist.add(integer);     
    }
    
    System.out.println(); 
    
    for (int j : numlist)
    {
      System.out.println(j);
    }
  }
}
