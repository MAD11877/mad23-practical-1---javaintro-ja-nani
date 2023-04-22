import java.util.Scanner;

public class Question3
{
  public static void main(String[] args)
  {
    /**
     * Reads integer entered by the user, multiplies the integer by itself and print out the result.
     * 
     * Hint: in.nextInt() to read integer
     */
    int initialint;
    int finalint;
    
    Scanner in = new Scanner(System.in);
    System.out.println("Enter an integer: ");
    initialint = in.nextInt();
    
    finalint = initialint * initialint;    
    System.out.println("The final integer is: " + finalint);
  }
}
