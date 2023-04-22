import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    /**
     * Prints a right angle triangle with *. The base of the triangle depends on the integer given.
     *    e.g.
     *     > 5
     *     *****
     *     ****
     *     ***
     *     **
     *     *
     * 
     * Hint: 2 loops are required. System.out.print(...) to print on single line.
     */
    
    int integer;
    int row;
    
    Scanner in = new Scanner(System.in);
    System.out.println("Enter an integer: ");
    integer = in.nextInt();
    
    for (int i = 0; i < integer; i++)
    {
      row = integer - i;
        
      for (int j = row; j > 0; j--)
      {
        System.out.println("*");
      }
      
      System.out.println("\n");
    }
  }
}
